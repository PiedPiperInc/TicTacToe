
        var id;
        function myFunction(clicked_id) {
            id = clicked_id;
            $('#turnForm').submit();
        };


        $(document).ready(function() {

            var form = $('#turnForm');

             form.submit(function( event ) {
                $.ajax({
                    type: form.attr('method'),
                    url: form.attr('action'),
                    data: 'inputID=' + id
                }).done(function(player) {
                    if($('#' + id).text() != 'X' && $('#' + id).text() != 'O') {
                        $('#' + id).html(String(player));
                        if(player == 'X')
                            $('#currentPlayer').html("Player O it's your turn");
                        else    
                            $('#currentPlayer').html("Player X it's your turn");
                    }
                    $.ajax({
                    type: 'POST',
                    url: '/gameover',
                    data: null
                }).done(function(gameover) {
                    if(gameover == 'true') {
                        for(i = 1; i <= 10; i++) {
                            $('#' + i).html('');
                        }
                        alert('Game over! The winner is '  + String(player)  + "!!!!");
                    }
                    else if(gameover == 'draw') {
                        for(i = 1; i <= 10; i++) {
                            $('#' + i).html('');
                        }
                        alert("Game over! It's a draw! Everybody loses");
                    }

                    $.ajax({
                        type: 'POST',
                        url: '/getWins',
                        data: null
                    }).done(function(wins) {
                        var result = wins.split(" ");
                        $('#Xwins').html("Player X: " + result[0] + " wins");
                        $('#Owins').html("Player O: " + result[1] + " wins");
                        $('#Draws').html("Draws: " + result[2]);
                    });
                });   
                }).fail(function() {
                    $('#results').html('Error, no joke found...').attr('class', 'alert alert-danger');
                });
                
                return false;
            });
    });
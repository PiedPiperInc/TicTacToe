
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
                            $('#currentPlayer').html("Player O it's your turn!");
                        else    
                            $('#currentPlayer').html("Player X it's your turn!");
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
                        $('#results').fadeIn();
                        $('#results').html('Game over! The winner is ' + player + "!!!!").attr('class', 'alert alert-success');
                        $('#results').fadeOut(5000);
                    }
                    else if(gameover == 'draw') {
                        for(i = 1; i <= 10; i++) {
                            $('#' + i).html('');
                        }
                        $('#results').fadeIn();
                        $('#results').html("Game over! It's a draw! Everybody loses").attr('class', 'alert alert-success');
                        $('#results').fadeOut(5000);
                    }
                });   
                }).fail(function() {
                    $('#results').html('Error, no joke found...').attr('class', 'alert alert-danger');
                });
                
                return false;
            });
    });
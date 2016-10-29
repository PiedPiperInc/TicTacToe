
        var id;
        var player;

        function myFunction(clicked_id) {
            id = clicked_id;
            $('#turnForm').submit();
        };

        function anothaOne() {
                for(i = 1; i <= 10; i++) {
                    $('#' + i).html('');
                    $('#' + i).val('');
                }
        }


        function gameOver(gameover) {
            if(gameover == 'true') {
                $('#currentPlayer').html("Player X it's your turn");
                $('#playAgain').html('<button onclick="anothaOne()" >Play again?</button>');
                var audioElement = document.createElement('audio');
                audioElement.setAttribute('src', 'win.mp3');
                audioElement.setAttribute('autoplay', 'autoplay');
                $.get();
                audioElement.play();
                alert('Game over! The winner is '  + String(player)  + "!!!!");
            }

            else if(gameover == 'draw') {
                $('#currentPlayer').html("Player X it's your turn");
                var audioElement = document.createElement('audio');
                audioElement.setAttribute('src', 'draw.mp3');
                audioElement.setAttribute('autoplay', 'autoplay');
                $.get();
                audioElement.play();
                alert("Game over! It's a draw! Everybody loses");
                $('#playAgain').html('<button onclick="anothaOne()" >Play again?</button>');
            }
            if(gameover == 'true' || gameover == 'draw') {
                $.ajax({
                        type: 'POST',
                        url: '/getWins',
                        data: null
                    }).done(function(wins) {
                        winners(wins);
                    });
            }
        };



        function winners(wins) {
            var result = wins.split(" ");
            $('#Xwins').html(result[0] + " wins");
            $('#Owins').html(result[1] + " wins");
            $('#Draws').html("Draws: " + result[2]);
        };


        function turns() {
            if($('#' + id).val() != 'hannes' && $('#' + id).val() != 'kristo') {
                if(player == 'X') { 
                    $('#' + id).html('<img src="hannes.jpeg"/>');
                    $('#' + id).val('hannes');
                    $('#currentPlayer').html("Player O it's your turn");
                    console.log('x');
                }
                else {
                    $('#' + id).html('<img src="kristo.jpeg"/>');
                    $('#' + id).val('kristo');
                    $('#currentPlayer').html("Player X it's your turn");
                    console.log('o');
                    }
            }          
                 $.ajax({
                    type: 'POST',
                    url: '/gameover',
                    data: null
                }).done(function(gameover) {
                    gameOver(gameover);
                });
        };

        $(document).ready(function() {

            var form = $('#turnForm');

             form.submit(function( event ) {
                $.ajax({
                    type: form.attr('method'),
                    url: form.attr('action'),
                    data: 'inputID=' + id
                }).done(function(thePlayer) {
                    player = thePlayer;
                    turns();
                });
                
                return false;
            });
    });

<?php
    // number 3
    $g = 0;
    for($c=0;$c>=100;$c++){
        if($g%2==0){
            echo $g." is an odd number";
            if($g>85){
                echo "Your score is $g "."you got A <br>";
            }elseif($g>70){
                echo "Your score is $g "."you got B <br>";
            }elseif($g>60){
                echo "Your score is $g "."you got C <br>";
            }elseif($g>50){
                echo "Your score is $g "."you got D <br>";
            }else{
                echo "Your SSscore is $g "."you failed <br>";
            }
        }else{
            echo $g. " ia an even number";
        }$g+=1;
    }

    ?>
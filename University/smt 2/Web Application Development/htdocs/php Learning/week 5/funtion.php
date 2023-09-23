<?php
    // number 3
    function score($c,$x){
        for($d=0;$d<=$c;$d++){
            if($x <=100 && $x>=0){
                if($x==0){
                    echo "This is zero number";
                    if($x>85){
                        echo " your score is $x "."you got A <br>";
                    }elseif($x>70){
                        echo " your score is $x "."you got B <br>";
                    }elseif($x>60){
                        echo " your score is $x "."you got C <br>";
                    }elseif($x>50){
                        echo " your score is $x "."you got D <br>";
                    }else{
                        echo " your score is $x "."you got E <br>";
                    }
                }
                elseif($x%2==0){
                    echo $x." is an even number";
                    if($x>85){
                        echo " your score is $x "."you got A <br>";
                    }elseif($x>70){
                        echo " your score is $x "."you got B <br>";
                    }elseif($x>60){
                        echo " your score is $x "."you got C <br>";
                    }elseif($x>50){
                        echo " your score is $x "."you got D <br>";
                    }else{
                        echo " your score is $x "."you got E <br>";
                    }
                }else{
                    echo $x. " ia an odd number";
                    if($x>85){
                        echo " your score is $x "."you got A <br>";
                    }elseif($x>70){
                        echo " your score is $x "."you got B <br>";
                    }elseif($x>60){
                        echo " your score is $x "."you got C <br>";
                    }elseif($x>50){
                        echo " your score is $x "."you got D <br>";
                    }else{
                        echo " your score is $x "."you got E <br>";
                    }
                }
            }$x+=1;
        }
    }

    echo score(100,0)
    ?>
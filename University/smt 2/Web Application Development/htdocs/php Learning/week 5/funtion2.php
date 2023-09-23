<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <?php
        function getgrade($x,$d){
            if($x <=100 && $x>=0){
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
        }
        function getscore($c,$x,$t){
            for($d=1; $d <= $c;$d++){
                if($x <=100 && $x>=0){
                    echo $d . ". ";
                    if($x==0){
                        echo $x." is a null number and";
                        echo getgrade($x,$d);
                    }elseif($x%2==0){
                        echo $x." is a even number and";
                        echo getgrade($x,$d);
                    }else{ 
                        echo $x." is a odd number and";
                        echo getgrade($x,$d);
                    }
                }$x += $t;
            }
        }
    ?>
    <?php
    echo getscore(11, 0, 10); // getscore(loops, start from, add  ?)
    ?>
</body>
</html>
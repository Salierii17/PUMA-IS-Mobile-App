<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <h1>Quiz</h1>
    <h1>Sulthan Zimran Alrazzaq_012202200052</h1>
    
    <?php
    // numeber 1
    $a = 10;
    for($c=0;$c<=5;$c++){
        echo $a." is an even number <br>";
        $a+=2;
    }echo "<br>";
    $a = 20;
    for($c=0;$c<=5;$c++){
        echo $a." is an even number <br>";
        $a-=2;
    }echo "<br>"
    ?>
    <?php
    // number 2
    $s = 0;
    for($c=0;$c<=50;$c++){
        if($s==0){
            echo $s." is a null number <br>";
        }elseif($s%2==0){
            echo $s." is a even number <br>";
        }else{ 
            echo $s." is a odd number <br>";
        }$s+=1;
    }
    ?>
    <?php
    // number 3
    $x = 0;
    for($c=0;$c>=100;$c++){
        if($x%2==0){
            echo $x." is an even number";
            if($x>85){
                echo "Your score is $x "."you got A <br>";
            }elseif($x>70){
                echo "Your score is $x "."you got B <br>";
            }elseif($x>60){
                echo "Your score is $x "."you got C <br>";
            }elseif($x>50){
                echo "Your score is $x "."you got D <br>";
            }else{
                echo "Your SSscore is $x "."you failed <br>";
            }
        }else{
            echo $x. " ia an odd number";
        }$x+=1;
    }

    ?>
</body>
</html>
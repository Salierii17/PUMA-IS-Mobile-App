<!DOCTYPE html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <h1>if else</h1>
    <?php
    $a = 5;
    if($a=10){
        echo "This is true";
    }else{
        echo "This is false";
    }
    ?>
    <h1>grade and score</h1> 
    <?php
        $b = 0;
        for($c=0;$c<=10;$c++){
            if($b>85){
                echo "Your score is $b "."you got A <br>";
            }elseif($b>70){
                echo "Your score is $b "."you got B <br>";
            }elseif($b>60){
                echo "Your score is $b "."you got C <br>";
            }elseif($b>50){
                echo "Your score is $b "."you got D <br>";
            }else{
                echo "Your score is $b "."you failed <br>";
            }$b+=10;
        }
    ?>
    
</body>
</html>
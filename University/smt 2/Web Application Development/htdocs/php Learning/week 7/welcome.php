
<html>
<body>
    <?php
    $x = $_POST["fn"];
    $y = $_POST["ln"];
    $n1 = $_POST["num1"];
    $n2 = $_POST["num2"];
    $str = $_POST["start"];
    $count = $_POST["count"];
    $a = $_POST["x"];
    $b = $_POST["y"];

    if(isset($_POST["FullName"])){
        echo "welcome your highnest ". $x." ".$y."<br>";
    }
    if(isset($_POST["add"])){
        echo  "$n1 + $n2 = ".$n1+$n2."<br>";
    }
    if(isset($_POST["sub"])){
        echo "$n1 - $n2 = ".$n1-$n2."<br>";
    }
    if(isset($_POST["multi"])){
        echo  "$n1 * $n2 = ".$n1*$n2."<br>";
    }
    if(isset($_POST["div"])){
        echo  "$n1 / $n2 = ".$n1/$n2."<br>";
    }
    if(isset($_POST["loop"])){
        for($c =0;$c<=$count;$c++){
            echo $str."<br>";
            $str+=1;
        }
    }
 
    if(isset($_POST["square"])){
        for($c=0;$c<=5;$c++){ 
            for($d=0;$d<                          $c;$d++){
                echo "O";
            }echo "<br>";
        }
    }
    if(isset($_POST["pyramid"])){
        echo "\t1 <br>";
        for($c=0;$c<$a;$c++){
            for($d=0;$c<$d;$d++){
                echo "1";
            }echo "<br>";
        }
    }

    ?>
    
    <a href="http://localhost/php%20Learning/week%207/index.php" type="button"value="return"></a>
</body>
</html>
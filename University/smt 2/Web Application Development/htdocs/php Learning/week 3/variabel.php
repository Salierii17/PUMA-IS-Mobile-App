<!DOCTYPE html>
<html lang="en">

<head>
    <title>Document</title>
</head>

<body>
    <h1>Declare variabel</h1>

        <?php
        $a = 10;
        $b = 7;
        $c = $a + $b;
        $fname = "Sulthan";
        $lname = "Zimran";

        echo "$a + $b = " . $c . "<br>";
        echo "my name is $fname $lname";
        ?>

    <h1> loops </h1>
    <?php
    for($p=1;$p<6;$p++){
        for($q=0;$q<$p;$q++){
            echo "*";
        }echo"<br>";
    }
    ?>
</body>

</html>
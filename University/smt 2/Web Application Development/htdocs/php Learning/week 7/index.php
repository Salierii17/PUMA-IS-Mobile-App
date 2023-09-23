<!DOCTYPE html>
<html lang="en">
<head> 
    <title>Document</title>
</head>
<body>
    <form action="welcome.php" method="post">
        First Name: <input type="text"name="fn"><br>
        Last Name : <input type="text"name="ln"><br>
        <input type = "submit" value="enter"name="FullName"><br>
    </form>

    <h1> operation</h1>
    <form action="welcome.php" method="post">
        number1 : <input type="text"name="num1"><br>
        number2 : <input type="text"name="num2"><br>
        <input type = "submit" value="+"name="add">
        <input type = "submit" value="-"name="sub">
        <input type = "submit" value="*"name="multi">
        <input type = "submit" value="/"name="div">
    </form>

    <h1> looping</h1>
    <form action="welcome.php" method="post">
        startnumber : <input type="text"name="start"><br>
        num of loop : <input type="text"name="count"><br>
        <input type = "submit" value="loop"name="loop">
    </form>

    <h1> create a square</h1>
    <form action="welcome.php" method="post">
        x axix: <input type="text"name="x"><br>
        y axix : <input type="text"name="y"><br>
        <input type = "submit" value="create square"name="square">
    </form>

    <h1> create a table</h1>
    <form action="welcome.php" method="post">
        row : <input type="text"name="x"><br>
        y  : <input type="text"name="y"><br>
        <input type = "submit" value="create square"name="square">
    </form>

    <h1> create a pyramid</h1>
    <form action="welcome.php" method="post">
        x axix: <input type="text"name="x"><br>
        <input type = "submit" value="create pyramid"name="pyramid">
    </form>
</body>
</html>
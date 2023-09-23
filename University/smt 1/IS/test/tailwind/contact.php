<?php
// database connection code

if(isset($_POST['txtName']))
{
// $con = mysqli_connect('localhost', 'database_user', 'database_password','database');
$con = mysqli_connect('localhost', 'root', '','db_contact');

// get the post records

$txtName = $_POST['txtName'];
$txtEmail = $_POST['txtEmail'];
$txtPhone = $_POST['txtPhone'];
@@ -19,4 +21,10 @@
{
	echo "Contact Records Inserted";
}
}
else
{
	echo "Are you a genuine visitor?";

}
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Contact Form - PHP/MySQL Demo Code</title>
</head>

<body>
    <fieldset>
        <legend>Contact Form</legend>
        <form name="frmContact" method="post" action="contact.php">
    <p>
        <label for="Name">Name </label>
        <input type="text" name="txtName" id="txtName">
    </p>
    <p>
        <label for="email">Email</label>
        <input type="text" name="txtEmail" id="txtEmail">
    </p>
    <p>
        <label for="phone">Phone</label>
        <input type="text" name="txtPhone" id="txtPhone">
    </p>
    <p>
        <label for="message">Message</label>
        <textarea name="txtMessage" id="txtMessage"></textarea>
    </p>
        <p>&nbsp;</p>
    <p>
        <input type="submit" name="Submit" id="Submit" value="Submit">
    </p>
</form>
</fieldset>
</body>
</html>
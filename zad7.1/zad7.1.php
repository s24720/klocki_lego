<!DOCTYPE html>
<?php
error_reporting(0);
?>
<html>
<head>
    <title>zad 7.1</title>
</head>
<body>
<?php
$wizyty=1;
if(isset($_POST["reset"]))
{
   unset($_COOKIE['wizyty']);
}
if(isset($_COOKIE['wizyty']))
{
    $wizyty=$_COOKIE['wizyty'];
    $wizyty++;

}
setcookie('wizyty',$wizyty);
echo "Byłeś tutaj ".$wizyty." razy";
?>
<form method="post" action="">
    <input type="submit" value="reset" name="reset"/>
    <input type="submit" value="odswiez" name="odswiez"/>

</form>
</body>
</html>
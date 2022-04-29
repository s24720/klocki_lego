<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<?php
error_reporting(0);
if($_POST['glos'])
{
    $glos=$_POST['glos'];
    setcookie('glos',$glos);
}

if(!isset($_COOKIE['glos'])) {
    echo "<form method=" . '"' . "post" . '"' . " action=" . '"' . "" . '"' . ">";
    echo "<span>Na kogo chcesz oddać swój głos</span></br>";
    echo "<select name=" . '"' . "glos" . '"' . ">";
    echo "<option value=" . '"' . "mariusz" . '"' . ">" . "Mariusz Pudzianowski" . "</option>";
    echo "<option value=" . '"' . "krzysztof" . '"' . ">" . "Krzysztof Kononowicz" . "</option>";
    echo "<option value=" . '"' . "adam" . '"' . ">" . "Adam Małysz" . "</option>";
    echo "</option></br>";
    echo "<input type=" . '"' . "submit" . '"' . "value=" . '"' . "oddaj glos" . '"' . ">";
}else
    echo"oddano juz glos";
?>
</body>
</html>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>BABYMETAL</title>
	<link rel="stylesheet" type="text/css" href="http://localhost:81/style.css">
	<link href="https://fonts.googleapis.com/css?family=Bubbler+One" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Playfair+Display" rel="stylesheet"> 
</head>
<body id="target">
<header>
<?php
  echo file_get_contents("index/header.txt");
	echo file_get_contents("button.html");
 ?>
</header>
<nav>
  <?php
    echo file_get_contents("index/list.txt");
   ?>
</nav>
<article id="article">
  <?php
  if( empty($_GET['id']) == false) {
    echo file_get_contents("index/".$_GET['id'].".txt");
  } else {
    echo file_get_contents("index/1.txt");
  }
   ?>
</article>
</body>
</html>

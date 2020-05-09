<?php
	$conn = mysqli_connect("localhost", "root", k4580123);
	mysqli_select_db($conn,"opentutorials");
	$result = mysqli_query($conn,"SELECT * FROM topic");
 ?>
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
	 <ol>
	 <?php
	 while($row = mysqli_fetch_assoc($result)) {
		 echo '<li><a class="a" href="http://localhost:81/opentutorials.php/index?id='.$row['id'].'">'.$row['title'].'</a></li>';
	 }
	 ?>
 </ol>
</nav>
<article id="form">
<form action="process.php" method="post">
	<p>
		TITLE : <br/><input type="text" name="title" value="">
	</p>
	<p>
		AUTHOR : <br/><input type="text" name="author" value="">
	</p>
	<p>
		DESCRIPTION : <br/><textarea name="description" rows="8" cols="80"></textarea>
	</p>
	<p>
		<input type="submit" name="submit" value="뿌직">
	</p>
</form>
</article>
</body>
</html>

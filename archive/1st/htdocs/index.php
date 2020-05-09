<?php
	$conn = mysqli_connect("localhost", "root", k4580123);
	mysqli_select_db($conn, "babymetal");
	$result = mysqli_query($conn,"SELECT * FROM topic");
 ?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>BABYMETAL</title>
	<link href="http://localhost:81/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
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
	 <h2>FUCK MY LIFE</h2>
	 <ol>
	 <?php
	 while($row = mysqli_fetch_assoc($result)) {
		 echo '<li><a class="a" href="http://localhost:81/index.php/index?id='.$row['id'].'">'.$row['title'].'</a></li>';
	 }
	 ?>
 </ol>
</nav>
<article id="article">
  <?php
	if(empty($_GET['id']) === false ) {
      $sql = 'SELECT * FROM topic WHERE id='.$_GET['id'];
      $result = mysqli_query($conn, $sql);
      $row = mysqli_fetch_assoc($result);
      echo '<h2>'.$row['title'].'</h2>';
			echo 'by '.$row['author'].'<br/><br/>';
      echo '<p>'.$row['description'].'</p>';
} else{
	  echo file_get_contents("index/1.txt");
}
?>
</article>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="http://localhost:81/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>

<?php
	$conn = mysqli_connect("localhost", "root", k4580123);
	mysqli_select_db($conn, "opentutorials");
	$sql = "select*from user where name='".$_POST['author']."'";
	$result = mysqli_query($conn, $sql);
	if ($result->num_rows == 0) {
		$sql= "insert into user (name,password) values('".$_POST['author']."', '111111')";
		mysqli_query($conn, $sql);
		$user_id=mysqli_insert_id($conn);
	} else {
		$row = mysqli_fetch_assoc($result);
		$user_id=$row['id'];
	}
	$sql = "INSERT INTO topic (title,description,author,created) VALUES('".$_POST['title']."', '".$_POST['description']."', '".$user_id."', now())";
	 $result = mysqli_query($conn,$sql);
	 header('Location: http://localhost:81/opentutorials.php');
#존나시펄ㅎㅎ;
?>

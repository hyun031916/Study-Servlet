<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/ServletPrj/login">
		<p> 아이디: <input type="text" name="id"/> </p>
		<p> 비밀번호: <input type="password" name="pass"/> </p>
		<p> 이름: <input type="text" name="name"/> </p>
		<p> 취미: </p>
		<input type="checkbox" name="hobby" value="climbing"/>등산
		<input type="checkbox" name="hobby" value="swim"/>수영
		<input type="checkbox" name="hobby" value="reading"/>독서
		<input type="checkbox" name="hobby" value="music"/>음악
		<br>
		<p> 성별: </p>
		<input type="radio" name="gender" value="female"/> 여성
		<input type="radio" name="gender" value="male"/> 남성
		<br>
		<select name="job" id="job">
			<option value="student">학생</option>
			<option value="teacher">선생님</option>
			<option value="nojob">무직</option>
		</select>
		<br>
		<p>할 말: </p>
		<input type="textarea" name="t"/>
		<button type="submit">Login</button>
	</form>
</body>
</html>
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
		<p> ���̵�: <input type="text" name="id"/> </p>
		<p> ��й�ȣ: <input type="password" name="pass"/> </p>
		<p> �̸�: <input type="text" name="name"/> </p>
		<p> ���: </p>
		<input type="checkbox" name="hobby" value="climbing"/>���
		<input type="checkbox" name="hobby" value="swim"/>����
		<input type="checkbox" name="hobby" value="reading"/>����
		<input type="checkbox" name="hobby" value="music"/>����
		<br>
		<p> ����: </p>
		<input type="radio" name="gender" value="female"/> ����
		<input type="radio" name="gender" value="male"/> ����
		<br>
		<select name="job" id="job">
			<option value="student">�л�</option>
			<option value="teacher">������</option>
			<option value="nojob">����</option>
		</select>
		<br>
		<p>�� ��: </p>
		<input type="textarea" name="t"/>
		<button type="submit">Login</button>
	</form>
</body>
</html>
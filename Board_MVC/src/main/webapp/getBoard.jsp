<%@ page import="mvc.board.impl.BoardDAOSpring" %>
<%@ page import="mvc.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ��</title>
</head>
<body>
<center>
	<h1>�� ��</h1>
	<a href="logout.do">Log-out</a>
	<hr>
	<form action="updateBoard.do" method="post">
	<input name="seq" type="hidden" value="${board.seq }"/>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="green" width="70">����</td>
			<td align="left"><input name="title" type="text" value="${board.title }"/></td>
		</tr>
		<tr>
			<td bgcolor="green">�ۼ���</td>
			<td align="left">${board.writer }</td>
		</tr>
		<tr>
			<td bgcolor="green">����</td>
			<td align="left"><textarea name="content" rows="10" cols="40">${board.content }</textarea></td>
		</tr>
		<tr>
			<td bgcolor="green">�����</td>
			<td align="left">${board.regDate }</td>
		</tr>
		<tr>
			<td bgcolor="green">��ȸ��</td>
			<td align="left">${board.cnt }</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="�� ����"/>
			</td>
		</tr>	
	</table>
	</form> 
	<hr>
	<a href="insertBoard.jsp">�۵��</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq }">�ۻ���</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">�۸��</a>
</center>
</body>
</html>
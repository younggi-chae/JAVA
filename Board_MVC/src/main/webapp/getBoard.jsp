<%@ page import="mvc.board.impl.BoardDAO" %>
<%@ page import="mvc.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
    
<%
	
	//���ǿ� ����� �Խñ� ������ ������.
	BoardDTO board = (BoardDTO) session.getAttribute("board");

%>


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
	<input name="seq" type="hidden" value="<%= board.getSeq() %>"/>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="green" width="70">����</td>
			<td align="left"><input name="title" type="text" value="<%= board.getTitle() %>"/></td>
		</tr>
		<tr>
			<td bgcolor="green">�ۼ���</td>
			<td align="left"><%= board.getWriter() %></td>
		</tr>
		<tr>
			<td bgcolor="green">����</td>
			<td align="left"><textarea name="content" rows="10" cols="40"><%= board.getContent() %></textarea></td>
		</tr>
		<tr>
			<td bgcolor="green">�����</td>
			<td align="left"><%= board.getRegDate() %></td>
		</tr>
		<tr>
			<td bgcolor="green">��ȸ��</td>
			<td align="left"><%= board.getCnt() %></td>
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
	<a href="deleteBoard.do?seq=<%= board.getSeq() %>">�ۻ���</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">�۸��</a>
</center>
</body>
</html>
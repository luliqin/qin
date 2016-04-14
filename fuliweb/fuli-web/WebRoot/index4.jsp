<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@page import="sun.management.counter.Variability"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index1.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
form {
	text-align: center;
}
</style>
</head>

<body bgcolor="#39F">
	<div align="center">
		<p>
		<a href="index4.jsp">求存款时长</a></p>
	</div>
	<form name="form1" method="post" action="">
		<table width="400" border="2" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<th width="235" height="30" align="right" bgcolor="#00FFFF">你所存入的本金：</th>
				<th width="165" bgcolor="#00FFFF"><input name="benjin"
					type="text" id="benjin"></th>
			</tr>
			<tr>
				<th height="30" align="right" bgcolor="#00FFFF">你所存的报酬率%：</th>
				<th bgcolor="#00FFFF"><input name="lilv" type="text" id="lilv">
				</th>
			</tr>
			<tr>
				<th height="30" align="right" bgcolor="#00FFFF"> 到最后期望的金额：</th>
				<th bgcolor="#00FFFF"><input name="year" type="text" id="year">
				</th>
			</tr>
		</table>
		<table width="400" border="2" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td height="30" align="center" bgcolor="#00FFFF"><input
					type="submit" name="button" id="button" value="提交"></td>
			</tr>
		</table>
	</form>
	<p>
	  <%

  		String p = request.getParameter("benjin");
  		String i = request.getParameter("lilv");
  		String n = request.getParameter("year");
  		double P=0,I=0;
  		int N=0;
  	if(p==null){
		p="0";
		i="0";
		n="0";
		}
		try{P=Double.valueOf(p).doubleValue();
		I=Double.valueOf(i).doubleValue();
		N=Integer.valueOf(n).intValue();
		double f=72/I;
		out.println("<div align='center'>你所存入的本金："+P);
		out.println("<div align='center'>你所存的报酬率："+I);
		out.println("<div align='center'>到最后期望的金额："+N);	
		out.println("<div align='center'><strong>通过复利的股票型存款，得到期望金额大概所需要的年份："+f);
		}
		catch(NumberFormatException e){
		out.print("<br>"+"请输入数字字符");
		}
   %>
</p>
	<form name="form2" method="post" action="">
	  	<a href="index.jsp">返回首页 </a>
</form>
	<p>&nbsp;</p>
</body>
</html>

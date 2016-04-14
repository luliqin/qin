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

<body bgcolor="#CF0">
	<div align="center">
		<p>
		<a href="index8.jsp">投资比较记录</a></p>
	</div>
	<form name="form1" method="post" action="">
		<table width="400" border="2" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
			  <th height="30" align="right" bgcolor="#00FFFF">请输入投资数量：</th>
			  <th bgcolor="#00FFFF"><label for="count"></label>
		      <input type="text" name="count" id="count"></th>
		  </tr>
			<tr>
			  <th height="30" align="right" bgcolor="#00FFFF">请选择投资类型：</th>
			  <th bgcolor="#00FFFF"><table width="200">
			    <tr>
			      <td><label>
			        <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_0">
			        复利计算</label></td>
		        </tr>
			    <tr>
			      <td><label>
			        <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_1">
			        单利计算</label></td>
		        </tr>
		      </table></th>
		  </tr>
			<tr>
				<th width="235" height="30" align="right" bgcolor="#00FFFF">你所存入的本金：</th>
				<th width="165" bgcolor="#00FFFF"><input name="benjin"
					type="text" id="benjin"></th>
			</tr>
			<tr>
				<th height="30" align="right" bgcolor="#00FFFF"><p>你所存的年利率比 </p>
			    <p>（周期利息）：</p></th>
				<th bgcolor="#00FFFF"><input name="lilv" type="text" id="lilv">
				</th>
			</tr>
			<tr>
				<th height="30" align="right" bgcolor="#00FFFF"><p>你所存的年限</p>
			    <p>（周期数）：</p></th>
				<th bgcolor="#00FFFF"><input name="year" type="text" id="year">
				</th>
			</tr>
			<tr>
				<th height="30" align="right" bgcolor="#00FFFF"><p>你所存的复利次数：</p>
			    <p>（若为单利不填）</p></th>
				<th bgcolor="#00FFFF"><input name="cishu" type="text"
					id="cishu"></th>
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
	  	    String a = request.getParameter("count");				//投资数量 
	    		String p = request.getParameter("benjin");			//本金
	    		String i = request.getParameter("lilv");			//利率
	    		String n = request.getParameter("year");			//年限
	    		String k = request.getParameter("cishu");			//复利次数
	    		double P=0,I=0;
	    		int N=0,K=0,A=0;
	    	if(p==null){
	    		a="0";
	  		p="0";
	  		i="0";
	  		n="0";
	  		k="0";
	  		}
	  		try{P=Double.valueOf(p).doubleValue();
	  		I=Double.valueOf(i).doubleValue();
	  		N=Integer.valueOf(n).intValue();
	  		K=Integer.valueOf(k).intValue();
	  		A=Integer.valueOf(a).intValue();
	  		double f=P*Math.pow(I/K+1,K*N);
	  		out.println("<div align='center'>你所存入的本金："+P);
	  		out.println("<div align='center'>你所存的年利率比："+I);
	  		out.println("<div align='center'>你所存的年限："+N);	
	  		out.println("<div align='center'>你所存的复利次数："+K);	
	  		out.println("<div align='center'><strong>你所获得的金额为："+String.format("%.2f", f));
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

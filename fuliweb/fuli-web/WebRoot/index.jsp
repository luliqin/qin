<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style type="text/css">
  #titlesize {
	font-size: 24px;
	font-family: "微软雅黑 Light";
	color: #F00;
	font-style: italic;
}
  table {
	color: #F33;
}
  </style>
  </head>
   <%
		String str=request.getParameter("movie");
  %> 
  <body bgcolor="#23CCCC">
  <blockquote>
    <p id="titlesize">请选择计算类型：</p>
    <form name="form1" method="post" action="">
      <blockquote>
        <blockquote>
          <table width="200">
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <a href="index1.jsp">
                <input name="RadioGroup1" type="radio" id="RadioGroup1_0" value="单选" onclick="index1()">
<script type="text/javascript" ">
function index1() {
	window.location.href = "index1.jsp";
}
</script>
<script type="text/javascript" ">
function index2() {
	window.location.href = "index2.jsp";
}
</script>
<script type="text/javascript" ">
function index3() {
	window.location.href = "index3.jsp";
}
</script>
<script type="text/javascript" ">
function index4() {
	window.location.href = "index4.jsp";
}
</script>
<script type="text/javascript" ">
function index5() {
	window.location.href = "index5.jsp";
}
</script>
<script type="text/javascript" ">
function index6() {
	window.location.href = "index6.jsp";
}
</script>
<script type="text/javascript" ">
function index7() {
	window.location.href = "index7.jsp";
}
</script>
<script type="text/javascript" ">
function index8() {
	window.location.href = "index8.jsp";
}
</script>
                </a>                <a href="index1.jsp">1.复利计算</a></label></td>
            </tr>
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_1" onclick="index2()">
                <a href="index2.jsp">2.单利计算</a><a href="index3.jsp"></a></label></td>
            </tr>
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_2" onclick="index3()">
                <a href="index3.jsp">3.计算本金</a></label></td>
            </tr>
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_3" onclick="index4()">
                <a href="index4.jsp">4.求存款时长</a></label></td>
            </tr>
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_4" onclick="index5()">
                <a href="index5.jsp">5.求报酬率</a></label></td>
            </tr>
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_5" onclick="index6()">
                <a href="index6.jsp">6.一定年份资金总额</a></label></td>
            </tr>
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_6" onclick="index7()">
                <a href="index7.jsp">7.月等额本息还款计算</a></label></td>
            </tr>
            <tr>
              <td height="30" bgcolor="#CCFFFF"><label>
                <input type="radio" name="RadioGroup1" value="单选" id="RadioGroup1_7" onclick="index8()">
              <a href="index8.jsp">8.投资比较记录</a></label></td>
            </tr>
          </table>
          <p>&nbsp;          </p>
          <p>
          <embed pluginspage="http://www.macromedia.com/go/getflashplayer" 
menu="true" loop="true" play="true" type="application/x-shockwave-flash" 
style="z-index:-1;"
src="http://player.youku.com/player.php/sid/XMTQ5MTI0NTQzNg==/v.swf">
</embed>
          </p>
          <p>&nbsp;</p>
        </blockquote>
      </blockquote>
    </form>
    <p><br>
    </p>
  </blockquote>
  </body>
</html>

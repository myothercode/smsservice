<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../../../staticResource/images/left.gif);
}
-->
</style>
    <link href="/smsservice/staticResource/css/css.css" rel="stylesheet" type="text/css" />
</head>
<SCRIPT language=JavaScript>
function tupian(idt){
    var nametu="xiaotu"+idt;
    var tp = document.getElementById(nametu);
    tp.src="/smsservice/staticResource/images/ico05.gif";//图片ico04为白色的正方形
	
	for(var i=1;i<30;i++)
	{
	  
	  var nametu2="xiaotu"+i;
	  if(i!=idt*1)
	  {
	    var tp2=document.getElementById('xiaotu'+i);
		if(tp2!=undefined)
	    {tp2.src="/smsservice/staticResource/images/ico06.gif";}//图片ico06为蓝色的正方形
	  }
	}
}

function list(idstr){
	var name1="subtree"+idstr;
	var name2="img"+idstr;
	var objectobj=document.all(name1);
	var imgobj=document.all(name2);
	
	
	//alert(imgobj);
	
	if(objectobj.style.display=="none"){
		for(i=1;i<10;i++){
			var name3="img"+i;
			var name="subtree"+i;
			var o=document.all(name);
			if(o!=undefined){
				o.style.display="none";
				var image=document.all(name3);
				//alert(image);
				image.src="/smsservice/staticResource/images/ico04.gif";
			}
		}
		objectobj.style.display="";
		imgobj.src="/smsservice/staticResource/images/ico03.gif";
	}
	else{
		objectobj.style.display="none";
		imgobj.src="/smsservice/staticResource/images/ico04.gif";
	}
}

</SCRIPT>

<body>
<table width="198" border="0" cellpadding="0" cellspacing="0" class="left-table01">
  <tr>
    <TD>
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="207" height="55" background="/smsservice/staticResource/images/nav01.gif">
				<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
				  <tr>
					<td width="25%" rowspan="2"><img src="/smsservice/staticResource/images/ico02.gif" width="35" height="35" /></td>
					<td width="75%" height="22" class="left-font01">您好，<span class="left-font02"></span></td>
				  </tr>
				  <tr>
					<td height="22" class="left-font01">
						</td>
				  </tr>
				</table>
			</td>
		  </tr>
		</table>
		


		<!--  任务系统开始    -->
		<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img8" id="img8" src="/smsservice/staticResource/images/ico04.gif" width="8" height="11" /></td>
						<td width="92%">
								<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('8');" >短信管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
        <table id="subtree8" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0"
               cellspacing="0" class="left-table02">
            <tr>
                <td width="9%" height="20" ><img id="xiaotu16" src="/smsservice/staticResource/images/ico06.gif" width="8" height="12" /></td>
                <td width="91%"><a href="/smsservice/sms/smsPage" target="mainFrame" class="left-font03" onClick="tupian('16');">短信发送</a></td>
            </tr>
            <tr>
                <td width="9%" height="20" ><img id="xiaotu17" src="/smsservice/staticResource/images/ico06.gif" width="8" height="12" /></td>
                <td width="91%"><a href="/smsservice/mms/mmsPage" target="mainFrame" class="left-font03" onClick="tupian('17');">彩信发送</a></td>
            </tr>

        </table>

		<!--  任务系统结束    -->

		

		<%--<!--  消息系统开始    -->
		<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img7" id="img7" src="/smsservice/staticResource/images/ico04.gif" width="8" height="11" /></td>
						<td width="92%">
								<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('7');" >业务管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
		<table id="subtree7" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" 
				cellspacing="0" class="left-table02">
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu17" src="/smsservice/staticResource/images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%">
						<a href="sendxiaoxi.htm" target="mainFrame" class="left-font03" onClick="tupian('17');">添加业务</a></td>
				</tr>

      </table>
		<!--  消息系统结束    -->--%>


	  </TD>
  </tr>
  
</table>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALL demo </title>
	<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/common/ueditor1_4_3-utf8-jsp/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/common/ueditor1_4_3-utf8-jsp/ueditor.all.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/common/ueditor1_4_3-utf8-jsp/themes/default/css/ueditor.css" />
</head>
	<body>
		<form name="myForm" method="post"action="upload">
			<input type="hidden" name="myEditors" id="myEditors">
			<div id="myEditor"></div>
			<input type="button" onclick="javascript:SureSubmit(this.form);" value="提交"/>
		</form>
		<script type="text/javascript">
			//var ue = UE.getEditor('myEditor');
			//初始化
		    var ue = UE.getEditor('myEditor', {
		        //toolbars:[['Undo', 'Redo','|','Bold', 'italic', 'underline','strikethrough','removeformat','formatmatch',
		        //           'forecolor','backcolor','insertorderedlist','insertunorderedlist','|',
		        //           'fontfamily','fontsize','justifyleft','justifyright','justifycenter','justifyjustify','|',
		        //          'insertimage','insertvideo','|','preview','searchreplace','FullScreen']],
		        //关闭字数统计
		        wordCount:true,
		        maximumWords:2000,
		        autoHeightEnabled: true,
		        //关闭elementPath
		        elementPathEnabled:false,
		        //默认的编辑区域高度
		        initialFrameHeight:300
		        //更多其他参数，请参考ueditor.config.js中的配置项
		    });
		    function SureSubmit(objForm){
			   	objForm.myEditors.value = UE.getEditor('myEditor').getContent();
			   	objForm.submit();
		    } 
		</script>

</body>
</html>
ueditor
=======

Create By Xie Xianbin, Package for ueditor and aliyun's OSS.


最近发现Ueditor 1.4.3 jsp utf-8版，存在图片上传功能不能直接使用的Bug，修复方法如下：

1. 修改com.baidu.ueditor.hunter.FileManager类下的getPath方法，参考如下：

源代码：
<code>

private String getPath ( File file ) {

	String path = file.getAbsolutePath();

	return path.replace( this.rootPath, "/" );

}

</code>

修改为：

<code>

private String getPath ( File file ) {
   String path = file.getAbsolutePath();
   String str=path.replace(this.rootPath.replaceAll("\\/", "\\\\"), "\\" );
   return str;
}
</code>

（会导致“在线管理”下的图片不能显示Bug）





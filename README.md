UEditor-for-aliyun-OSS
=======

Create By Xie Xianbin, Package for ueditor and aliyun's OSS.


ueditor 1.4.3 jsp utf-8版，存在图片上传功能不能直接使用的Bug，修复方法如下：

#####1. 修改com.baidu.ueditor.hunter.FileManager类下的getPath方法，参考如下：


源代码：
```
private String getPath ( File file ) {

	String path = file.getAbsolutePath();

	return path.replace( this.rootPath, "/" );

}
```

修改为：

```
private String getPath ( File file ) {
   String path = file.getAbsolutePath();
   String str=path.replace(this.rootPath.replaceAll("\\/", "\\\\"), "\\" );
   return str;
}
```

（会导致“在线管理”下的图片不能显示Bug）

#####2. 修改image.js文件，有两处的图片地址设置有问题，这里导致的问题是上传的图片在编辑器中不能显示图片。


######（1）：需要自定义一个方法，获取当前项目的地址（方法比较笨，可自行修改）


```
function getRootPath(){
    //获取当前网址，如： http://localhost/ueditor/index.jsp
    var curWwwPath=window.document.location.href;
	var pathName=window.document.location.pathname;
	var pos=curWwwPath.indexOf(pathName);
	var localhostPaht=curWwwPath.substring(0,pos);
	var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
	return localhostPaht + projectName;
}
```
######（2）分别在以下两个地方添加刚才获取的项目地址


776行：
```
src: getRootPath() + prefix + data.url,
_src: getRootPath() + prefix + data.url,
```
912行
```
img.setAttribute('src', getRootPath() + urlPrefix + list[i].url + (list[i].url.indexOf('?') == -1 ? '?noCache=':'&noCache=') + (+new Date()).toString(36) );
img.setAttribute('_src', getRootPath() + urlPrefix + list[i].url);
```


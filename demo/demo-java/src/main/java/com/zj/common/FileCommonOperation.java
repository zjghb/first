package main.java.com.zj.common;

import java.io.File;

public class FileCommonOperation {
/*
* //获取src/ClassPath下的文件 111.txt 的绝对路径
		System.out.println(Test.class.getClassLoader().getResource("111.txt").getPath());

		//获取 src/ClassPath的绝对路径
		System.out.println(Test.class.getClassLoader().getResource(".").getPath());
		//获取 src/ClassPath的绝对路径
		System.out.println(Test.class.getClassLoader().getResource("").getPath());
		//获取 src/ClassPath的绝对路径
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(".").getPath());
		//获取 src/ClassPath的绝对路径
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());

		//获取项目的绝对路径
		System.out.println(System.getProperty("user.dir"));

		//获取当前类文件的绝对目录，不包括自己的上级目录
		System.out.println(Test.class.getResource(".").getPath());
		//获取当前类文件的绝对目录，不包括自己的上级目录
		System.out.println(Test.class.getResource("").getPath());

		//获取webRoot下文件（主要是通过上下文获取和通过request）
//		System.out.println(request.getSession().getServletContext().getRealPath("/resource"));

* */
public static void main(String[] args) {

}
    public static File getFile(String fileName){
        String path = FileCommonOperation.class.getClassLoader().getResource("").getFile();
        return new File(path+File.separator+fileName);
    }

}

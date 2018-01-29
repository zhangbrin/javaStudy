package io;

/**
 * io流--文件字节流
 * FileInputStream类与 FileOutputStream 综合应用：图片拷贝
 */
import java.io.*;
public class Io04 {
	public static void main(String[] args) {
		//先将图片读入到内存，再将内存中的图片写入到某个文件
		//因为二进制文件只能拿使用字节流来处理
		//输入流
		FileInputStream fis=null;
		//输出流
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("d:\\pic.jpg");     //源头
			fos=new FileOutputStream("d:\\a4.jpg");     //目标、
			
			byte buf[]=new byte[1024];  //字节数组作为缓冲
			
			int n=0;//记录实际读取到的字节数
			while((n=fis.read(buf))!=-1){   //循环读取图片
				fos.write(buf); //输出到指定文件
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//一定要关闭打开的文件流
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


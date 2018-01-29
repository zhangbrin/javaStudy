package io;

/**
 * io流--文件字节流：文件输出流
 * FileOutputStream
 */
import java.io.*;
public class Io03 {
	public static void main(String[] args) {
		File f=new File("d:\\ss.txt");//直接覆盖写同一个文件
				//字节输出流
		FileOutputStream fos=null;
		if(f.exists()){
			System.out.println("文件已存在");
		}else{
			try {
				fos=new FileOutputStream(f);
				String s="hello,world!\r\n";
				String s1="中国人";
				fos.write(s.getBytes());
				fos.write(s1.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					fos.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}

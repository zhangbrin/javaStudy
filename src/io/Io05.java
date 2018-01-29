package io;

/**
 * io流--文件字符流，只能用于完全为字符的文件
 * TXT文件拷贝--FileReader类与 FileWriter类
 */
import java.io.*;
public class Io05 {
	public static void main(String[] args) {
		
		FileReader fr=null;   //文件取出字符流对象(输入流)
		FileWriter fw=null;   //写入到文件(输出流)
		
		try {  
			fr=new FileReader("d:\\test.txt"); //创建fr对象
			fw=new FileWriter("d:\\gaol.txt"); //创建输出对象
			
			
			char c[]=new char[1024];  //创建字符数组 作为缓存
			
			int n=0;//读入到内存
			while((n=fr.read(c))!=-1){
				String s=new String(c,0,n);
				System.out.println(s); //控制台输出TXT文件内容
				fw.write(c, 0, n);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

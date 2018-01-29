package io;


/*
* io流--缓冲字符流,可以按照行处理
* BufferedReader类与BufferedWriter类
*/



import java.io.*;
public class Io06 {
	public static void main(String[] args) {
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			//先创建FileReader对象，再升级为BufferedReader
			FileReader fr=new FileReader("d:\\test.txt");
			br=new BufferedReader(fr);
			
			//创建FileWriter对象
			FileWriter fw=new FileWriter("d:\\testRes.txt");
			bw=new BufferedWriter(fw);
			
			//循环读取
			String s="";
			while((s=br.readLine())!=null){  //不读取换行符
				//输出到磁盘
				System.out.println(s);  //println自带换行符
				bw.write(s+"\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

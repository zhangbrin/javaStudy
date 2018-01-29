package io;

/**
 * File类的基本用法
 */
import java.io.*;//必需加载IO包

public class Io01 {
	public static void main(String[] args) {
		
		//创建一个文件对象
		File f1=new File("e:\\aa.txt");
		//得到文件的路径
		System.out.println("文件路径"+f1.getAbsolutePath());
		//得到文件的大小,字节数
		System.out.println("文件的大小"+f1.length());
		
		
		
		
		//创建文件夹
		File f3=new File("e:\\ff");
		//判断文件夹是否存在
		if(f3.isDirectory()){
			System.out.println("文件夹存在，不能创建!");
		}else{
			//创建文件夹
			f3.mkdir();
		}

		//创建文件和创建文件夹
		File f2=new File("e:\\ff\\hsp.txt");
		//判断文件是否存在
		if(!f2.exists()){
			//可以创建
			try {
				f2.createNewFile();//创建一个新文件
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else{
			System.out.println("文件存在，不能创建!");
		}
		
		//列出一个文件夹下面的所有文件
		File f4=new File("e:\\ff");
		//判断文件夹是事存在
		if(f4.isDirectory()){
			//将文件夹的文件，传给lists数组
			File lists[]=f4.listFiles();
			//遍历数组
			for(int i=0;i<lists.length;i++){
				//输出文件夹下所有文件文件名
				System.out.println("显示出文件名是"+lists[i].getName());
			}
		}
	}
}

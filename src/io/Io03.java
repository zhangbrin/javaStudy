package io;

/**
 * io��--�ļ��ֽ������ļ������
 * FileOutputStream
 */
import java.io.*;
public class Io03 {
	public static void main(String[] args) {
		File f=new File("d:\\ss.txt");//ֱ�Ӹ���дͬһ���ļ�
				//�ֽ������
		FileOutputStream fos=null;
		if(f.exists()){
			System.out.println("�ļ��Ѵ���");
		}else{
			try {
				fos=new FileOutputStream(f);
				String s="hello,world!\r\n";
				String s1="�й���";
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

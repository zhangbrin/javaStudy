package io;

/**
 * io��--�ļ��ַ�����ֻ��������ȫΪ�ַ����ļ�
 * TXT�ļ�����--FileReader���� FileWriter��
 */
import java.io.*;
public class Io05 {
	public static void main(String[] args) {
		
		FileReader fr=null;   //�ļ�ȡ���ַ�������(������)
		FileWriter fw=null;   //д�뵽�ļ�(�����)
		
		try {  
			fr=new FileReader("d:\\test.txt"); //����fr����
			fw=new FileWriter("d:\\gaol.txt"); //�����������
			
			
			char c[]=new char[1024];  //�����ַ����� ��Ϊ����
			
			int n=0;//���뵽�ڴ�
			while((n=fr.read(c))!=-1){
				String s=new String(c,0,n);
				System.out.println(s); //����̨���TXT�ļ�����
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

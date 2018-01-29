package io;


/*
* io��--�����ַ���,���԰����д���
* BufferedReader����BufferedWriter��
*/



import java.io.*;
public class Io06 {
	public static void main(String[] args) {
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			//�ȴ���FileReader����������ΪBufferedReader
			FileReader fr=new FileReader("d:\\test.txt");
			br=new BufferedReader(fr);
			
			//����FileWriter����
			FileWriter fw=new FileWriter("d:\\testRes.txt");
			bw=new BufferedWriter(fw);
			
			//ѭ����ȡ
			String s="";
			while((s=br.readLine())!=null){  //����ȡ���з�
				//���������
				System.out.println(s);  //println�Դ����з�
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

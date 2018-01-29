package io;

/**
 * io��--�ļ��ֽ���
 * FileInputStream���� FileOutputStream �ۺ�Ӧ�ã�ͼƬ����
 */
import java.io.*;
public class Io04 {
	public static void main(String[] args) {
		//�Ƚ�ͼƬ���뵽�ڴ棬�ٽ��ڴ��е�ͼƬд�뵽ĳ���ļ�
		//��Ϊ�������ļ�ֻ����ʹ���ֽ���������
		//������
		FileInputStream fis=null;
		//�����
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("d:\\pic.jpg");     //Դͷ
			fos=new FileOutputStream("d:\\a4.jpg");     //Ŀ�ꡢ
			
			byte buf[]=new byte[1024];  //�ֽ�������Ϊ����
			
			int n=0;//��¼ʵ�ʶ�ȡ�����ֽ���
			while((n=fis.read(buf))!=-1){   //ѭ����ȡͼƬ
				fos.write(buf); //�����ָ���ļ�
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//һ��Ҫ�رմ򿪵��ļ���
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


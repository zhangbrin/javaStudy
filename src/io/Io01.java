package io;

/**
 * File��Ļ����÷�
 */
import java.io.*;//�������IO��

public class Io01 {
	public static void main(String[] args) {
		
		//����һ���ļ�����
		File f1=new File("e:\\aa.txt");
		//�õ��ļ���·��
		System.out.println("�ļ�·��"+f1.getAbsolutePath());
		//�õ��ļ��Ĵ�С,�ֽ���
		System.out.println("�ļ��Ĵ�С"+f1.length());
		
		
		
		
		//�����ļ���
		File f3=new File("e:\\ff");
		//�ж��ļ����Ƿ����
		if(f3.isDirectory()){
			System.out.println("�ļ��д��ڣ����ܴ���!");
		}else{
			//�����ļ���
			f3.mkdir();
		}

		//�����ļ��ʹ����ļ���
		File f2=new File("e:\\ff\\hsp.txt");
		//�ж��ļ��Ƿ����
		if(!f2.exists()){
			//���Դ���
			try {
				f2.createNewFile();//����һ�����ļ�
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else{
			System.out.println("�ļ����ڣ����ܴ���!");
		}
		
		//�г�һ���ļ�������������ļ�
		File f4=new File("e:\\ff");
		//�ж��ļ������´���
		if(f4.isDirectory()){
			//���ļ��е��ļ�������lists����
			File lists[]=f4.listFiles();
			//��������
			for(int i=0;i<lists.length;i++){
				//����ļ����������ļ��ļ���
				System.out.println("��ʾ���ļ�����"+lists[i].getName());
			}
		}
	}
}

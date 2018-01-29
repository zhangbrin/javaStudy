package collections;

//TreeSet�������ʹ��[Demo146.java]
import java.util.*;
public class Demo147{
	public static void main(String[] args){
		//����һ���Ƚ�����ʵ�����Լ�������ʽ
		TreeSet tr =new TreeSet(new Student.StudentComparator());
		tr.add(new Student(301,"����"));//��ѧ������д��TreeSet�������tr��
		tr.add(new Student(201,"���"));
		tr.add(new Student(101,"����"));
		tr.add(new Student(101,"��һ"));
		Iterator it=tr.iterator();//������������
		while(it.hasNext()){//�ж��Ƿ�����һ��Ԫ��
			System.out.println(it.next());
		}
	}
}
//����Strudentѧ���ಢʵ��Comparable��Comparator�ӿ�
class Student implements Comparable,Comparator{
	private int num;//����ѧ��
	private String name;//��������
	public Student(int num,String name){
		this.num=num;
		this.name=name;
	}
	public int compareTo(Object o){
		Student st=(Student)o;
		int result;
		result=num>st.num?1:(num==st.num?0:-1);//�ж�ѧ���Ƿ���ͬ������result��ֵ
		//���ѧ����ȣ��Ͱ���������
	/*	if(result==0){
			return name.compareTo(st.name);
		}*/
		return result;
	}
	//ʵ��Comparator�ӿڲ�ʵ�����ĳ��󷽷�
	public int compare(Object o1,Object o2){
		Student st1 =(Student)o1;
		Student st2 =(Student)o2;
		return st1.name.compareTo(st2.name);//�Ƚ������Ƿ���ͬ
	}
	//��дtoString()��������Ϊ�������д����ӡ��������16���ƴ���
	public String toString(){
		return "num="+num+"; name="+name;
	}
	public static class StudentComparator implements Comparator{//����һ����̬StudentComparator�ಢʵ��Comparator�ӿ�
		public int compare(Object o1,Object o2){
			Student st1 =(Student)o1;
			Student st2 =(Student)o2;
			int result;
			result=st1.num>st2.num?1:(st1.num==st2.num?0:-1);//�ж�ѧ���Ƿ���ͬ��������
			if(result==0){//���ѧ����� �ͽ�����������
				result=st1.name.compareTo(st2.name);
			}
			return result;
		}
	}
}


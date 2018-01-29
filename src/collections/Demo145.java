package collections;

//Hashtable�������ʹ��(Hashtable����ͬ���ԣ��̰߳�ȫ)

import java.util.*;
public class Demo145{
	public static void main(String []args){
		Hashtable ht=new Hashtable();//Hashtable��HsahMap���÷���һ��
		Emp7 emp4=new Emp7("s101","a1",2.2f);
		Emp7 emp5=new Emp7("s102","a2",1.2f);
		Emp7 emp6=new Emp7("s103","a3",4.2f);
		ht.put("s101", emp4);
		ht.put("s102", emp5);
		ht.put("s103", emp6);
		//����
		for(Iterator it=ht.keySet().iterator();it.hasNext();){
			String key=it.next().toString();
			Emp7 emp=(Emp7)ht.get(key);
			System.out.println("���֣�"+emp.getName()+"\t���ʣ�"+emp.getSal());
		}
	}
}
//����Ա����
class Emp7{
	//�����Ա�������š�������нˮ
	private String empNo;
	private String name;
	private float sal;
	//�������캯������ʼ����Ա����
	public Emp7(String empNo,String name,float sal){
		this.empNo=empNo;
		this.name=name;
		this.sal=sal;
	}
	//ʹ��set��get�����������ݴ���
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
}

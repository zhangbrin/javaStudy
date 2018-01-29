package collections;

//Hashtable集合类的使用(Hashtable具有同步性，线程安全)

import java.util.*;
public class Demo145{
	public static void main(String []args){
		Hashtable ht=new Hashtable();//Hashtable与HsahMap在用法上一致
		Emp7 emp4=new Emp7("s101","a1",2.2f);
		Emp7 emp5=new Emp7("s102","a2",1.2f);
		Emp7 emp6=new Emp7("s103","a3",4.2f);
		ht.put("s101", emp4);
		ht.put("s102", emp5);
		ht.put("s103", emp6);
		//遍历
		for(Iterator it=ht.keySet().iterator();it.hasNext();){
			String key=it.next().toString();
			Emp7 emp=(Emp7)ht.get(key);
			System.out.println("名字："+emp.getName()+"\t工资："+emp.getSal());
		}
	}
}
//创建员工类
class Emp7{
	//定义成员变量工号、姓名、薪水
	private String empNo;
	private String name;
	private float sal;
	//创建构造函数，初始化成员变量
	public Emp7(String empNo,String name,float sal){
		this.empNo=empNo;
		this.name=name;
		this.sal=sal;
	}
	//使用set、get方法进行数据传递
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

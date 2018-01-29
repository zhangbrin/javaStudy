package collections;

//HashMap类，Hashtable类
//HashMap集合类的使用[Demo143.java]
//HashMap集合类的使用


import java.util.*;
public class Demo144 {
	public static void main(String[] args) {
		//创建HashMap对象
		HashMap hm=new HashMap();
		Emp6 emp1=new Emp6("s001","aa",3.4f);
		Emp6 emp2=new Emp6("s002","bb",5.6f);
		Emp6 emp3=new Emp6("s003","cc",1.2f);
		//将emp放入到hm中
		//hm.put(null,null);//可以放空值
		hm.put("s001", emp1);
		hm.put("s002", emp2);
		hm.put("s002", emp3);//不允许key重复,所以emp3会覆盖emp2
		//如果你要查找编号是s002
		if(hm.containsKey("s002")){//取键值containsKey
			System.out.println("有该员工");
			//如何取出，键<key>值
			Emp6 emp=(Emp6)hm.get("s002");
			System.out.println("名字"+emp.getName());
		}else{
			System.out.println("没该员工");
		}
		//遍历HashMap中所有的key和value值
		//Iterator迭代
		Iterator it=hm.keySet().iterator();
		//hasNext返回一个boolean值
		while(it.hasNext()){
			//如果有下一个取出key值
			String key=it.next().toString();
			//通过key取出value
			Emp6 emp=(Emp6)hm.get(key);
			System.out.println("名字："+emp.getName());
			System.out.println("工资："+emp.getSal());
		}
	}
}
//创建员工类
class Emp6{
	//定义成员变量工号、姓名、薪水
	private String empNo;
	private String name;
	private float sal;
	//创建构造函数，初始化成员变量
	public Emp6(String empNo,String name,float sal){
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

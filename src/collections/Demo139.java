package collections;

//java集合类用法--List结构--ArrayList类


//List结构的集合类:   ArrayList类，LinkedList类，Vector类，Stack类
//ArrayList类的使用(无同步性，线程不安全)[Demo139.java]


import java.util.*;//集合类基本上在util包中
public class Demo139 {
	public static void main(String[] args) {
		//定义ArrayList对象
		ArrayList al=new ArrayList();
		//显示大小
		System.out.println("al大小:"+al.size());
		//向all中加入数据(类型是Object)
		//创建一个职员
		Clerk clerk1=new Clerk("宋江",50,1000);
		Clerk clerk2=new Clerk("吴用",45,1200);
		Clerk clerk3=new Clerk("林冲",35,1300);
		//将clerk1加入到al中
		al.add(clerk1);
		al.add(clerk2);
		al.add(clerk3);
		//可不可以放入同样的对象？
		al.add(clerk1);
		//显示大小
		System.out.println("al大小:"+al.size());
		//如何访问al中的对象(数据)
		//访问第一个对象
		//Clerk temp=(Clerk)al.get(0);
		
		//System.out.println("第一个人的名字是："+temp.getName());
		
		//遍历al所有的对象(数据)
		for(int i=0;i<al.size();i++){
			Clerk temp=(Clerk)al.get(i);
			System.out.println("名字："+temp.getName());
		}
		//如何从al中删除一个对象
		al.remove(1);
		System.out.println("===删除吴用===");
		//遍历al所有的对象(数据)
		for(int i=0;i<al.size();i++){
			Clerk temp=(Clerk)al.get(i);
			System.out.println("名字："+temp.getName());
		}
	}
}
//定义一个员工类
class Clerk{
	private String name;
	private int age;
	private float sal;
	public Clerk(String name,int age,float sal){
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
}


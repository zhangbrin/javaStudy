package collections;

//TreeSet集合类的使用[Demo146.java]
import java.util.*;
public class Demo147{
	public static void main(String[] args){
		//传递一个比较器来实现你自己的排序方式
		TreeSet tr =new TreeSet(new Student.StudentComparator());
		tr.add(new Student(301,"张三"));//将学生数据写入TreeSet集合类的tr中
		tr.add(new Student(201,"李二"));
		tr.add(new Student(101,"王五"));
		tr.add(new Student(101,"穷一"));
		Iterator it=tr.iterator();//迭代器，遍历
		while(it.hasNext()){//判断是否有下一个元素
			System.out.println(it.next());
		}
	}
}
//创建Strudent学生类并实现Comparable与Comparator接口
class Student implements Comparable,Comparator{
	private int num;//定义学号
	private String name;//定义名字
	public Student(int num,String name){
		this.num=num;
		this.name=name;
	}
	public int compareTo(Object o){
		Student st=(Student)o;
		int result;
		result=num>st.num?1:(num==st.num?0:-1);//判断学号是否相同并返回result的值
		//如果学号相等，就按姓名排列
	/*	if(result==0){
			return name.compareTo(st.name);
		}*/
		return result;
	}
	//实现Comparator接口并实现它的抽象方法
	public int compare(Object o1,Object o2){
		Student st1 =(Student)o1;
		Student st2 =(Student)o2;
		return st1.name.compareTo(st2.name);//比较姓名是否相同
	}
	//重写toString()方法，因为如果不重写，打印出来的是16进制代码
	public String toString(){
		return "num="+num+"; name="+name;
	}
	public static class StudentComparator implements Comparator{//定义一个静态StudentComparator类并实现Comparator接口
		public int compare(Object o1,Object o2){
			Student st1 =(Student)o1;
			Student st2 =(Student)o2;
			int result;
			result=st1.num>st2.num?1:(st1.num==st2.num?0:-1);//判断学号是否相同进行排序
			if(result==0){//如果学号相等 就进行名字排序
				result=st1.name.compareTo(st2.name);
			}
			return result;
		}
	}
}


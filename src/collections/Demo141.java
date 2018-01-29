package collections;

                // --LinkedList集合类的使用方法[Demo141.java]
	        	//LinkedList集合类的使用
		import java.util.*;
		public class Demo141 {
			public static void main(String[] args) {
				LinkedList ll=new LinkedList();
				Empp emp1=new Empp("sa01","aa",1.2f);
				Empp emp2=new Empp("sa02","bb",1.2f);
				Empp emp3=new Empp("sa03","cc",1.2f);
				//addFirst表示把emp1加载(链表)队列的最前面
				ll.addFirst(emp1);//addFirst方法是可以插入在数组之前
				ll.addFirst(emp2);//也可以理解为addFirst方法是后进先出的方法
				//addLast表示把emp3加载(链表)队列的后面
				ll.addLast(emp3);
				System.out.println("测试LinkedList集合类中的addFist及addLast方法");
				for(int i=0;i<ll.size();i++){
					System.out.println(((Empp)ll.get(i)).getName());
				}
				//remove表示将某一条数据进行删除
				ll.remove(emp1);//将ll中的emp1数据删除
				System.out.println("测试LinkedList集合类中的remove方法");
				for(int i=0;i<ll.size();i++){
					System.out.println(((Empp)ll.get(i)).getName());
				}
				ll.removeAll(ll);//清除整个链表
				System.out.println("测试LinkedList集合类中的remmoveall方法");
				for(int i=0;i<ll.size();i++){
					System.out.println(((Empp)ll.get(i)).getName());
				}
			}
		}
		//创建员工类
		class Empp{//在同一个包中的类，可以同包中的其它class文件直接访问或调用
			//定义成员变量工号、姓名、薪水
			private String empNo;
			private String name;
			private float sal;
			//创建构造函数，初始化成员变量
			public Empp(String empNo,String name,float sal){
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


package collections;

        //--Stack集合类(栈)的使用[Demo143.java]
		//Stack集合类(栈)的使用方法
		import java.util.*;
		public class Demo143 {
			public static void main(String[] args) {
				//Stack的用法
				Stack stack=new Stack();
				AEmp3 emp1=new AEmp3("s1","aa",1.2f);
				AEmp3 emp2=new AEmp3("s2","bb",1.2f);
				stack.add(emp1);
				stack.add(emp2);
				for(int i=0;i<stack.size();i++){
					System.out.println(((AEmp3)stack.get(i)).getName());
				}
			}
		}
		//创建员工类
		class AEmp3{
			//定义成员变量工号、姓名、薪水
			private String empNo;
			private String name;
			private float sal;
			//创建构造函数，初始化成员变量
			public AEmp3(String empNo,String name,float sal){
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

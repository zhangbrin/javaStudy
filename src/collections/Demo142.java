package collections;

        //--Vector集合类的使用(线程安全具有同步性) [Demo142.java]
		//Vector集合类(向量)的使用方法
		import java.util.*;
		public class Demo142 {
			public static void main(String[] args) {
				//Vector的用法
				Vector vv=new Vector();
				AEmp emp1=new AEmp("1","aa",1.2f);
				AEmp emp2=new AEmp("2","bb",1.2f);
				AEmp emp3=new AEmp("3","cc",1.2f);
				vv.add(emp1);
				vv.add(emp2);
				vv.add(emp3);
				//遍历
				for(int i=0;i<vv.size();i++){
					AEmp emp=(AEmp)vv.get(i);
					System.out.println(emp.getName());
				}
			}
		}
		//创建员工类
		class AEmp{
			//定义成员变量工号、姓名、薪水
			private String empNo;
			private String name;
			private float sal;
			//创建构造函数，初始化成员变量
			public AEmp(String empNo,String name,float sal){
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

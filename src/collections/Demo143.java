package collections;

        //--Stack������(ջ)��ʹ��[Demo143.java]
		//Stack������(ջ)��ʹ�÷���
		import java.util.*;
		public class Demo143 {
			public static void main(String[] args) {
				//Stack���÷�
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
		//����Ա����
		class AEmp3{
			//�����Ա�������š�������нˮ
			private String empNo;
			private String name;
			private float sal;
			//�������캯������ʼ����Ա����
			public AEmp3(String empNo,String name,float sal){
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

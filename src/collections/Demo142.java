package collections;

        //--Vector�������ʹ��(�̰߳�ȫ����ͬ����) [Demo142.java]
		//Vector������(����)��ʹ�÷���
		import java.util.*;
		public class Demo142 {
			public static void main(String[] args) {
				//Vector���÷�
				Vector vv=new Vector();
				AEmp emp1=new AEmp("1","aa",1.2f);
				AEmp emp2=new AEmp("2","bb",1.2f);
				AEmp emp3=new AEmp("3","cc",1.2f);
				vv.add(emp1);
				vv.add(emp2);
				vv.add(emp3);
				//����
				for(int i=0;i<vv.size();i++){
					AEmp emp=(AEmp)vv.get(i);
					System.out.println(emp.getName());
				}
			}
		}
		//����Ա����
		class AEmp{
			//�����Ա�������š�������нˮ
			private String empNo;
			private String name;
			private float sal;
			//�������캯������ʼ����Ա����
			public AEmp(String empNo,String name,float sal){
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

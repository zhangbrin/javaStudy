package collections;

                // --LinkedList�������ʹ�÷���[Demo141.java]
	        	//LinkedList�������ʹ��
		import java.util.*;
		public class Demo141 {
			public static void main(String[] args) {
				LinkedList ll=new LinkedList();
				Empp emp1=new Empp("sa01","aa",1.2f);
				Empp emp2=new Empp("sa02","bb",1.2f);
				Empp emp3=new Empp("sa03","cc",1.2f);
				//addFirst��ʾ��emp1����(����)���е���ǰ��
				ll.addFirst(emp1);//addFirst�����ǿ��Բ���������֮ǰ
				ll.addFirst(emp2);//Ҳ�������ΪaddFirst�����Ǻ���ȳ��ķ���
				//addLast��ʾ��emp3����(����)���еĺ���
				ll.addLast(emp3);
				System.out.println("����LinkedList�������е�addFist��addLast����");
				for(int i=0;i<ll.size();i++){
					System.out.println(((Empp)ll.get(i)).getName());
				}
				//remove��ʾ��ĳһ�����ݽ���ɾ��
				ll.remove(emp1);//��ll�е�emp1����ɾ��
				System.out.println("����LinkedList�������е�remove����");
				for(int i=0;i<ll.size();i++){
					System.out.println(((Empp)ll.get(i)).getName());
				}
				ll.removeAll(ll);//�����������
				System.out.println("����LinkedList�������е�remmoveall����");
				for(int i=0;i<ll.size();i++){
					System.out.println(((Empp)ll.get(i)).getName());
				}
			}
		}
		//����Ա����
		class Empp{//��ͬһ�����е��࣬����ͬ���е�����class�ļ�ֱ�ӷ��ʻ����
			//�����Ա�������š�������нˮ
			private String empNo;
			private String name;
			private float sal;
			//�������캯������ʼ����Ա����
			public Empp(String empNo,String name,float sal){
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


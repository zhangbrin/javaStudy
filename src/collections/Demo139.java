package collections;

//java�������÷�--List�ṹ--ArrayList��


//List�ṹ�ļ�����:   ArrayList�࣬LinkedList�࣬Vector�࣬Stack��
//ArrayList���ʹ��(��ͬ���ԣ��̲߳���ȫ)[Demo139.java]


import java.util.*;//�������������util����
public class Demo139 {
	public static void main(String[] args) {
		//����ArrayList����
		ArrayList al=new ArrayList();
		//��ʾ��С
		System.out.println("al��С:"+al.size());
		//��all�м�������(������Object)
		//����һ��ְԱ
		Clerk clerk1=new Clerk("�ν�",50,1000);
		Clerk clerk2=new Clerk("����",45,1200);
		Clerk clerk3=new Clerk("�ֳ�",35,1300);
		//��clerk1���뵽al��
		al.add(clerk1);
		al.add(clerk2);
		al.add(clerk3);
		//�ɲ����Է���ͬ���Ķ���
		al.add(clerk1);
		//��ʾ��С
		System.out.println("al��С:"+al.size());
		//��η���al�еĶ���(����)
		//���ʵ�һ������
		//Clerk temp=(Clerk)al.get(0);
		
		//System.out.println("��һ���˵������ǣ�"+temp.getName());
		
		//����al���еĶ���(����)
		for(int i=0;i<al.size();i++){
			Clerk temp=(Clerk)al.get(i);
			System.out.println("���֣�"+temp.getName());
		}
		//��δ�al��ɾ��һ������
		al.remove(1);
		System.out.println("===ɾ������===");
		//����al���еĶ���(����)
		for(int i=0;i<al.size();i++){
			Clerk temp=(Clerk)al.get(i);
			System.out.println("���֣�"+temp.getName());
		}
	}
}
//����һ��Ա����
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


package collections;

//HashSet��ʹ�÷���[Demo145.java]
import java.util.*;
public class Demo146{
	public static void main(String []args){
		HashSet<Emp8> hs=new HashSet<Emp8>();
		Emp8 emp1=new Emp8("s001","aa",1.2f);
		Emp8 emp2=new Emp8("s002","bb",1.6f);
		Emp8 emp3=new Emp8("s003","cc",1.8f);
		Emp8 emp4=new Emp8("s001","aa",1.2f);
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp1);//�ظ���emp1,HashSet���Զ�ȥ��
		System.out.println("HashSet_size="+hs.size());
		System.out.println();
		ArrayList<Emp8> al=new ArrayList<Emp8>();
		Emp8 emp5=new Emp8("s004","dd",1.0f);
		Emp8 emp6=new Emp8("s005","ee",2.5f);
		al.add(emp5);
		al.add(emp6);
		//al.add(emp1);
		hs.addAll(al);//��al�е�ֵ�ӵ�hs�У���ȥ���ظ���emp1
		System.out.println("HashSet_ArrayList_size="+hs.size());
		System.out.println();
		//ת������o[]�����������HashSet�е�����
		Object o[]=hs.toArray();
		for(int i=0;i<o.length;i++){
			System.out.println("����:"+((Emp8)o[i]).getEmpNo()+"\t����:"+((Emp8)o[i]).getName()+"\t����:"+((Emp8)o[i]).getSal());
		}
	}
}
class Emp8{
	private String empNo;
	private String name;
	private float sal;
	public Emp8(String empNo,String name,float sal){
		this.empNo=empNo;
		this.name=name;
		this.sal=sal;
	}
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

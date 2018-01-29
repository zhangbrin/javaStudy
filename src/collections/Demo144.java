package collections;

//HashMap�࣬Hashtable��
//HashMap�������ʹ��[Demo143.java]
//HashMap�������ʹ��


import java.util.*;
public class Demo144 {
	public static void main(String[] args) {
		//����HashMap����
		HashMap hm=new HashMap();
		Emp6 emp1=new Emp6("s001","aa",3.4f);
		Emp6 emp2=new Emp6("s002","bb",5.6f);
		Emp6 emp3=new Emp6("s003","cc",1.2f);
		//��emp���뵽hm��
		//hm.put(null,null);//���Էſ�ֵ
		hm.put("s001", emp1);
		hm.put("s002", emp2);
		hm.put("s002", emp3);//������key�ظ�,����emp3�Ḳ��emp2
		//�����Ҫ���ұ����s002
		if(hm.containsKey("s002")){//ȡ��ֵcontainsKey
			System.out.println("�и�Ա��");
			//���ȡ������<key>ֵ
			Emp6 emp=(Emp6)hm.get("s002");
			System.out.println("����"+emp.getName());
		}else{
			System.out.println("û��Ա��");
		}
		//����HashMap�����е�key��valueֵ
		//Iterator����
		Iterator it=hm.keySet().iterator();
		//hasNext����һ��booleanֵ
		while(it.hasNext()){
			//�������һ��ȡ��keyֵ
			String key=it.next().toString();
			//ͨ��keyȡ��value
			Emp6 emp=(Emp6)hm.get(key);
			System.out.println("���֣�"+emp.getName());
			System.out.println("���ʣ�"+emp.getSal());
		}
	}
}
//����Ա����
class Emp6{
	//�����Ա�������š�������нˮ
	private String empNo;
	private String name;
	private float sal;
	//�������캯������ʼ����Ա����
	public Emp6(String empNo,String name,float sal){
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

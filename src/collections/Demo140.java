package collections;



/*
 * 
����һ����˾ְԱнˮ����ϵͳ��Ҫ��������¹��ܣ�
1��������Ա��ʱ������Ա�����뵽����ϵͳ
2�����Ը���Ա���ţ���ʾ��Ա������Ϣ
3��������ʾ����Ա����Ϣ
4�������޸�Ա����нˮ
5����Ա����ְʱ������Ա���ӹ���ϵͳ��ɾ��
6�����԰���нˮ�ӵ͵���˳������[˼����]
7������ͳ��Ա����ƽ�����ʺ���ͺ���߹���
 * 
 * 1.ʹ��ArrayListʵ��Ա����Ϣ�Ĺ����ܣ�
 * 2.����̨�����û������뼰������Ϣ��
 * 
//ArrayList�������ʹ��
//��˾ְԱнˮ����ϵͳ

 * 
 */


import java.util.*;
public class Demo140 {
	public static void main(String[] args) {
		//����EmpManage����
		EmpManage em=new EmpManage();
		Scanner sr=new Scanner(System.in);
		//����һ���˵�
		while(true){
			System.out.println("��˾ְԱнˮ����ϵͳ");
			System.out.println("1��¼����Ա��");
			System.out.println("2�����ݹ��Ų�ѯ��Ϣ");
			System.out.println("3����ѯ����Ա����Ϣ");
			System.out.println("4��ͨ�������޸�Ա��нˮ");
			System.out.println("5��ɾ��Ա����Ϣ");
			System.out.println("6����нˮ�ߵ�����");
			System.out.println("7������ƽ�����ʼ����(��)����");
			System.out.println("0���˳�ϵͳ");
			System.out.print("�������Ӧ�����ֽ��в�����");
			int sel=sr.nextInt();
			if(sel==1){
				System.out.println("��¼����Ա������Ϣ");
				System.out.print("����:");
				String empNo=sr.next();
				System.out.print("����:");
				String name=sr.next();
				System.out.print("����:");
				float sal=sr.nextFloat();
				//����emp����
				Emp emp=new Emp(empNo,name,sal);
				//��empNo,name,sal��ֵ�������캯��Emp
				em.addEmp(emp);
				System.out.println("������Ա��"+name+"�ɹ�!");
			}else if(sel==2){
				System.out.println("��¼��Ա�����ţ�");
				String empNo=sr.next();
				em.showInfo(empNo);
			}
			else if(sel==3){
				System.out.println("��˾����Ա����Ϣ���£�");
				em.AllInfo();
			}
			else if(sel==4){
				System.out.println("�����빤�ţ�");
				String empNo=sr.next();
				System.out.println("�������޸�Ϊ��");
				float newSal=sr.nextFloat();
				em.updateSal(empNo, newSal);
			}
			else if(sel==5){
				System.out.println("������Ҫɾ����Ա�Ĺ��ţ�");
				String empNo=sr.next();
				em.delEmp(empNo);
			}
			else if(sel==6){
				System.out.println("�Ѱ�н�ʸߵͽ����������£�");
				em.SortSal();
			}
			else if(sel==7){
				System.out.println("��ʾƽ�����ʼ���ߡ���͹�����Ա��Ϣ���£�");
				em.Average();
			}
			else if(sel==0){
				System.out.println("�������˳�!");
				System.exit(0);
			}else{
				System.out.println("�����������������!");
			}
		}
	}
}




//����Ա��������
class EmpManage{
	private ArrayList<Emp> al=null;
	//�������캯������ʼ����Ա����
	public EmpManage(){
		al=new ArrayList<Emp>();
	}
	
	//����Ա��
	public void addEmp(Emp emp){//����Ա����Ϣ
		al.add(emp);
	}
	
	//����Ա��������ʾԱ���������Ϣ
	public void showInfo(String empNo){//�����Ŵ���showInfo������
		//��������ArrayList
		for(int i=0;i<al.size();i++){
			//ȡ��Emp����
			Emp emp=(Emp)al.get(i);
			//�Ƚϱ��
			if(emp.getEmpNo().equals(empNo)){//����empNo����ΪString������Ҫʹ��equals�������ݱȽϣ�������ʹ��==��ַ�Ƚ�
				System.out.println("�ҵ���Ա����������Ϣ�ǣ�");
				System.out.println("����:"+empNo+"\t�պ�:"+emp.getName()+"\tнˮ:"+emp.getSal());
			}else{
				System.out.println("���Ų����ڻ��޴���!");
			}
		}
	}
	
	//��ʾ����Ա����Ϣ
	public void AllInfo(){
		for(int i=0;i<al.size()-1;i++){//ArrayList�������al��С������ѭ��
			for(int j=1;j<al.size()-i;j++){//��al�е�ֵ����ѭ���Ƚ�
				Emp emp1=(Emp)al.get(j-1);
				Emp emp2=(Emp)al.get(j);
//ʹ��compareTo��������Sting����ֵ�Ƚ�
				if(emp1.getEmpNo().compareTo(emp2.getEmpNo())>0){
					al.set(j,emp1);//����ֵ����д��al��
					al.set(j-1,emp2);//����ֵ����д��al��
				}
			}
		}
		for(Emp emp:al){
			System.out.println("���ţ�"+emp.getEmpNo()+"\t������"+emp.getName()+"\t���ʣ�"+emp.getSal());
		}
	}
	
	//�޸�Ա����нˮ
	public void updateSal(String empNo,float newSal){
		//��������ArrayList
		for(int i=0;i<al.size();i++){
			//ȡ��Emp����
			Emp emp=(Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				//�޸���ˮ
				emp.setSal(newSal);//setSal�Ὣ�޸ĵ�нˮ����ArrayList��
				System.out.println("�ѽ�"+emp.getName()+"����Ϊ:"+newSal);
			}
		}
		System.out.println("���Ų����ڻ��޴��ˣ��޷�������Ӧ����!");
	}
	
	//Ա����ְɾ��ָ��Ա��
	public void delEmp(String empNo){
		//��������ArrayList
		for(int i=0;i<al.size();i++){
			//ȡ��Emp����
			Emp emp=(Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				//������ɾ��
				al.remove(i);//Ҳ����ʹ��al.remove(emp);
				System.out.println("�ѽ�"+emp.getName()+"��Ϣ���!");
			}
		}
	}

	//��нˮ�ߵ�����
	public void SortSal(){
		for(int i=0;i<al.size()-1;i++){//ArrayList�������al��С������ѭ��
			for(int j=1;j<al.size()-i;j++){//��al�е�ֵ����ѭ���Ƚ�
				Emp emp1=(Emp)al.get(j-1);
				Emp emp2=(Emp)al.get(j);
				if(emp1.getSal()<emp2.getSal()){//�Ƚ�sal��ֵ��С
					al.set(j,emp1);//����ֵ����д��al��
					al.set(j-1,emp2);//����ֵ����д��al��
				}
			}
		}
		for(Emp emp:al){
			System.out.println("���ţ�"+emp.getEmpNo()+"\t������"+emp.getName()+"\t���ʣ�"+emp.getSal());
		}
	}
	
	//����ƽ�����ʲ��ҳ���߹��ʺ���͹��ʵ�Ա��
	public void Average(){
		float sum=0f,ave=0f;
		//��������ArrayList
		for(int k=0;k<al.size();k++){
			//ȡ��Emp����
			Emp emp=(Emp)al.get(k);
			sum=emp.getSal()+sum;
		}
		ave=sum/al.size();
		System.out.println("����Ա��"+al.size()+"��\t�ܹ���Ϊ��"+sum+"\tƽ������Ϊ��"+ave);
		
		//�ҳ���߹��������ʽ��
		for(int i=0;i<al.size()-1;i++){//ArrayList�������al��С������ѭ��
			for(int j=1;j<al.size()-i;j++){//��al�е�ֵ����ѭ���Ƚ�
				Emp emp1=(Emp)al.get(j-1);
				Emp emp2=(Emp)al.get(j);
				if(emp1.getSal()<emp2.getSal()){//�Ƚ�sal��ֵ��С
					al.set(j,emp1);//����ֵ����д��al��
					al.set(j-1,emp2);//����ֵ����д��al��
				}
			}
		}
		for(int i=0;i<al.size();i++){
			if(i==0){
				Emp emp=(Emp)al.get(i);
				System.out.println("������ߵ���Ա�ǣ�"+emp.getName()+"\tнˮ�ǣ�"+emp.getSal());
			}else if(i==al.size()-1){
				Emp emp=(Emp)al.get(i);
				System.out.println("������͵���Ա�ǣ�"+emp.getName()+"\tнˮ�ǣ�"+emp.getSal());
			}
		}
	}
}
//����Ա����
class Emp{
	//�����Ա�������š�������нˮ
	private String empNo;
	private String name;
	private float sal;
	//�������캯������ʼ����Ա����
	public Emp(String empNo,String name,float sal){
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

package collections;



/*
 * 
请做一个公司职员薪水管理系统，要求完成如下功能：
1、当有新员工时，将该员工加入到管理系统
2、可以根据员工号，显示该员工的信息
3、可以显示所有员工信息
4、可以修改员工的薪水
5、当员工离职时，将该员工从管理系统中删除
6、可以按照薪水从低到高顺序排序[思考题]
7、可以统计员工的平均工资和最低和最高工资
 * 
 * 1.使用ArrayList实现员工信息的管理功能；
 * 2.控制台接受用户的输入及操作信息；
 * 
//ArrayList集合类的使用
//公司职员薪水管理系统

 * 
 */


import java.util.*;
public class Demo140 {
	public static void main(String[] args) {
		//创建EmpManage对象
		EmpManage em=new EmpManage();
		Scanner sr=new Scanner(System.in);
		//作出一个菜单
		while(true){
			System.out.println("公司职员薪水管理系统");
			System.out.println("1、录入新员工");
			System.out.println("2、根据工号查询信息");
			System.out.println("3、查询所有员工信息");
			System.out.println("4、通过工号修改员工薪水");
			System.out.println("5、删除员工信息");
			System.out.println("6、按薪水高低排序");
			System.out.println("7、计算平均工资及最高(低)工资");
			System.out.println("0、退出系统");
			System.out.print("请输入对应的数字进行操作：");
			int sel=sr.nextInt();
			if(sel==1){
				System.out.println("请录入新员工的信息");
				System.out.print("工号:");
				String empNo=sr.next();
				System.out.print("姓名:");
				String name=sr.next();
				System.out.print("工资:");
				float sal=sr.nextFloat();
				//构建emp对象
				Emp emp=new Emp(empNo,name,sal);
				//将empNo,name,sal的值传给构造函数Emp
				em.addEmp(emp);
				System.out.println("创建新员工"+name+"成功!");
			}else if(sel==2){
				System.out.println("请录入员工工号：");
				String empNo=sr.next();
				em.showInfo(empNo);
			}
			else if(sel==3){
				System.out.println("公司所有员工信息如下：");
				em.AllInfo();
			}
			else if(sel==4){
				System.out.println("请输入工号：");
				String empNo=sr.next();
				System.out.println("将工资修改为：");
				float newSal=sr.nextFloat();
				em.updateSal(empNo, newSal);
			}
			else if(sel==5){
				System.out.println("请输入要删除人员的工号：");
				String empNo=sr.next();
				em.delEmp(empNo);
			}
			else if(sel==6){
				System.out.println("已按薪资高低进行排序如下：");
				em.SortSal();
			}
			else if(sel==7){
				System.out.println("显示平均工资及最高、最低工资人员信息如下：");
				em.Average();
			}
			else if(sel==0){
				System.out.println("已正常退出!");
				System.exit(0);
			}else{
				System.out.println("输入错误，请重新输入!");
			}
		}
	}
}




//创建员工管理类
class EmpManage{
	private ArrayList<Emp> al=null;
	//创建构造函数，初始化成员变量
	public EmpManage(){
		al=new ArrayList<Emp>();
	}
	
	//加入员工
	public void addEmp(Emp emp){//传入员工信息
		al.add(emp);
	}
	
	//根据员工工号显示员工的相关信息
	public void showInfo(String empNo){//将工号传入showInfo方法中
		//遍历整个ArrayList
		for(int i=0;i<al.size();i++){
			//取出Emp对象
			Emp emp=(Emp)al.get(i);
			//比较编号
			if(emp.getEmpNo().equals(empNo)){//由于empNo类型为String，所以要使用equals进行内容比较，不可以使用==地址比较
				System.out.println("找到该员工，他的信息是：");
				System.out.println("工号:"+empNo+"\t姓号:"+emp.getName()+"\t薪水:"+emp.getSal());
			}else{
				System.out.println("工号不存在或无此人!");
			}
		}
	}
	
	//显示所有员工信息
	public void AllInfo(){
		for(int i=0;i<al.size()-1;i++){//ArrayList集合类的al大小，控制循环
			for(int j=1;j<al.size()-i;j++){//将al中的值进行循环比较
				Emp emp1=(Emp)al.get(j-1);
				Emp emp2=(Emp)al.get(j);
//使用compareTo方法进行Sting类型值比较
				if(emp1.getEmpNo().compareTo(emp2.getEmpNo())>0){
					al.set(j,emp1);//交换值并重写入al中
					al.set(j-1,emp2);//交换值并重写入al中
				}
			}
		}
		for(Emp emp:al){
			System.out.println("工号："+emp.getEmpNo()+"\t姓名："+emp.getName()+"\t工资："+emp.getSal());
		}
	}
	
	//修改员工的薪水
	public void updateSal(String empNo,float newSal){
		//遍历整个ArrayList
		for(int i=0;i<al.size();i++){
			//取出Emp对象
			Emp emp=(Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				//修改新水
				emp.setSal(newSal);//setSal会将修改的薪水传和ArrayList中
				System.out.println("已将"+emp.getName()+"调整为:"+newSal);
			}
		}
		System.out.println("工号不存在或无此人，无法进行相应操作!");
	}
	
	//员工离职删除指定员工
	public void delEmp(String empNo){
		//遍历整个ArrayList
		for(int i=0;i<al.size();i++){
			//取出Emp对象
			Emp emp=(Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)){
				//按工号删除
				al.remove(i);//也可以使用al.remove(emp);
				System.out.println("已将"+emp.getName()+"信息清除!");
			}
		}
	}

	//按薪水高低排序
	public void SortSal(){
		for(int i=0;i<al.size()-1;i++){//ArrayList集合类的al大小，控制循环
			for(int j=1;j<al.size()-i;j++){//将al中的值进行循环比较
				Emp emp1=(Emp)al.get(j-1);
				Emp emp2=(Emp)al.get(j);
				if(emp1.getSal()<emp2.getSal()){//比较sal的值大小
					al.set(j,emp1);//交换值并重写入al中
					al.set(j-1,emp2);//交换值并重写入al中
				}
			}
		}
		for(Emp emp:al){
			System.out.println("工号："+emp.getEmpNo()+"\t姓名："+emp.getName()+"\t工资："+emp.getSal());
		}
	}
	
	//计算平均工资并找出最高工资和最低工资的员工
	public void Average(){
		float sum=0f,ave=0f;
		//遍历整个ArrayList
		for(int k=0;k<al.size();k++){
			//取出Emp对象
			Emp emp=(Emp)al.get(k);
			sum=emp.getSal()+sum;
		}
		ave=sum/al.size();
		System.out.println("共有员工"+al.size()+"人\t总工资为："+sum+"\t平均工资为："+ave);
		
		//找出最高工资与最低式资
		for(int i=0;i<al.size()-1;i++){//ArrayList集合类的al大小，控制循环
			for(int j=1;j<al.size()-i;j++){//将al中的值进行循环比较
				Emp emp1=(Emp)al.get(j-1);
				Emp emp2=(Emp)al.get(j);
				if(emp1.getSal()<emp2.getSal()){//比较sal的值大小
					al.set(j,emp1);//交换值并重写入al中
					al.set(j-1,emp2);//交换值并重写入al中
				}
			}
		}
		for(int i=0;i<al.size();i++){
			if(i==0){
				Emp emp=(Emp)al.get(i);
				System.out.println("工资最高的人员是："+emp.getName()+"\t薪水是："+emp.getSal());
			}else if(i==al.size()-1){
				Emp emp=(Emp)al.get(i);
				System.out.println("工资最低的人员是："+emp.getName()+"\t薪水是："+emp.getSal());
			}
		}
	}
}
//创建员工类
class Emp{
	//定义成员变量工号、姓名、薪水
	private String empNo;
	private String name;
	private float sal;
	//创建构造函数，初始化成员变量
	public Emp(String empNo,String name,float sal){
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

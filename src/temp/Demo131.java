package temp;

/*
数组
请思考，既然int,float,double..等都可以有数组，那么可不可以有对象数组呢？
对前面的养鸡场的题，进行升级，题要求如下：
一个养狗场有4只狗，分别是：
名字	体重
花花	4.5kg
白白	5.6kg
黑黑	78kg
红红	9.0kg
请编写一个程序，可以计算他们的平均体重，可以找出体重最大和最小的狗的名字，可以通过输入狗的名字，查找它的体重。

*/
//对象数组的使用[Demo131.java]
//import java.io.*;
import java.util.*;
public class Demo131 {
	public static void main(String[] args) throws Exception {//throws Exception将输入错误踢除程序块
		//定义一个对象数组可以存放四只狗的对象数组
		Dog dogs[]=new Dog[4];
		//给各个狗赋初值
	/*	dogs[0]=new Dog();
		dogs[0].setName("花花");
		dogs[0].setWeight(4.5f);
		dogs[]*/
		//从控制台输入各个狗的信息
	//	InputStreamReader isr=new InputStreamReader(System.in);
	//	BufferedReader br=new BufferedReader(isr);
		Scanner sr=new Scanner(System.in);
		for(int i=0;i<4;i++){
			dogs[i]=new Dog();//必需要使用new方法将数组指向Dog类
			System.out.println("请输入第"+(i+1)+"狗名");
			//从控制台读取狗名
			String name=sr.nextLine();
			//将名字赋给对象
			dogs[i].setName(name);//将狗名使用set方法传入Dog类中
			System.out.println("请输入"+(i+1)+"狗的体重");
			String s_weight=sr.nextLine();
			float weight=Float.parseFloat(s_weight);
			//将名字赋给对象
			dogs[i].setWeight(weight);//将狗体重使用set方法传入Dog类中
		}
		//计算总体重
		float allWeight=0;
		for(int i=0;i<4;i++){
			allWeight+=dogs[i].getWeight();//将dogs数组中的狗体重从Dog类中取出并累加赋值给总体重
		}
		//计算平均体重
		float avgWeight=allWeight/dogs.length;
		System.out.println("总体重="+allWeight+"\t平均体重="+avgWeight);
		
		//找出体重最大的狗
		//假设第一狗体重最大
		float maxWeight=dogs[0].getWeight();
		int maxIndex=0;//定义用于比较体重的下标
		//依次和第一只狗比较体重
		for(int i=1;i<dogs.length;i++){
			if(maxWeight<dogs[i].getWeight()){
				//如何比较的狗体重大于第一只狗的体重则进行修改
				maxWeight=dogs[i].getWeight();
				maxIndex=i;
			}
		}
		//找出体重最小的狗
		float minWeight=dogs[0].getWeight();
		int minIndex=0;
		for(int j=1;j<dogs.length;j++){
			if(minWeight>dogs[j].getWeight()){
				//如何比较的狗体重小于第一只狗的体重则进行修改
				minWeight=dogs[j].getWeight();
				minIndex=j;
			}
		}
		System.out.println("体重大的狗是第"+(maxIndex+1)+"狗，名字叫："+dogs[maxIndex].getName()+"\t体重是"+maxWeight);
		System.out.println("体重小的狗是第"+(minIndex+1)+"狗，名字叫："+dogs[minIndex].getName()+"\t体重是"+minWeight);
		//输入狗的名字查狗的体重
		System.out.println("请输入你要找的狗的名字：");
		String cname=sr.nextLine();
		int cIndex=0;
		for(int k=0;k<dogs.length;k++){
			if(cname.equals(dogs[k].getName())){//对比狗名。变量名.equals()方法用于字符串比较内容是否一致。
				System.out.println("你要找狗名"+ dogs[cIndex].getName()+"\t体重是"+dogs[cIndex].getWeight());
			}
		}
	}
}
//定义一个狗类
class Dog{
	private String name;
	private float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}




/**
 一维数组--小结
1、数组可存放同一类型数据；
2、简单数据类型(int,float)数组，可直接赋值；
3、对象数组在定义后，赋值时需要再次为每个对象分配空间[即：new 对象]；
4、数组大小必须事先指定；
5、数组名可以理解为指向数组首地址的引用；
6、数组的下标是从0开始编号的。

 * 
 */

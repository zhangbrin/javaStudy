package temp;

/*
查找
在java中，常用的查找方式有两种：
1、顺序查找(最简单，效率最低)
2、二分查找
*/

//功能：二分查找[Demo136.java]
import java.util.*;
public class Demo136 {
	public static void main(String[] args) {
		int arr[]={2,5,7,12,25};//定义arr数组并赋值
		System.out.print("请输入你需要查找的数：");
		Scanner sr=new Scanner(System.in);
		int a=sr.nextInt();
		BinaryFind bf=new BinaryFind();//创建BinaryFind对象
		bf.find(0,arr.length-1,a,arr);//调用find方法，并将数据传给方法
	}
}
//二分法
class BinaryFind{
	public void find(int leftIndex,int rightIndex,int val,int arr[]){
		//首先找到中间的数
		int midIndex=((rightIndex+leftIndex)/2);
		int midVal=arr[midIndex];
		if(rightIndex>=leftIndex){
			//如果要找的数比midVal大
			if(midVal>val){
				//在arr数组左边数列中找
				find(leftIndex,midIndex-1,val,arr);
			}else if(midVal<val){
				//在arr数组右边数列中找
				find(midIndex+1,rightIndex,val,arr);
			}else if(midVal==val){
				System.out.println("数组arr["+midIndex+"]中的数字是"+arr[midIndex]);
			}
		}else{
			System.out.println("没有找到你要找的数!");
		}
	}
}

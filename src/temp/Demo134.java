package temp;

//插入式排序法[Demo134.java]排序10万数据用时2秒
public class Demo134{
	public static void main(String []args){
	int arr[]={23,15,-13,62,5,-23,0,17};
		for(int i=1;i<arr.length;i++){
			int insertVal=arr[i];
			//insertVal准备和前一个数比较
			int index=i-1;
			while(index>=0&&insertVal<arr[index]){
				//将把arr[index]向后移动一位
				arr[index+1]=arr[index];
				//让index向前移动一位
				index--;
			}
			//将insertVal插入到适当位置
			arr[index+1]=insertVal;
		}
		//输出最后结果
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}	
	}
}




/*
插入式排序法--插入排序法
插入式排序属于内部排序法，是对于欲排序的元素以插入的方式找寻该元素的适当位置，以达到排序的目的。
插入式排序法又可分为3种：
1、插入排序法(Insertion Sorting)
2、谢耳排序法(Shell Sorting)(欧洲人员喜欢使用)
3、二叉树排序法(Binary-tree Sorting)

插入排序(Insertion Sorting)的基本思想是：把n个待排序的元素看成为一个有序表和一个无序表，开始有序表只包含一个元素，无序表中包含有n-1个元素，排序过程中每次从无序表中取出第一个元素，把它的排序码依次与有序表元素的排序码进行比较，将它插入到有序表中的适当位置，使之成为新的有序表。
*/
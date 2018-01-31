package temp;

//快速排序法[Demo135.java]排序1亿数据用时14秒
public class Demo135{
	public static void main(String []args){
		int arr[]={-1,-5,6,2,0,9,-3,-8,12,7};
		QuickSort qs=new QuickSort();
		qs.sort(0, arr.length-1, arr);
		//输出最后结果
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
class QuickSort{
	public void sort(int left,int right,int [] arr){
		int l=left;
		int r=right;
		int pivot=arr[(left+right)/2];//找中间值
		int temp=0;
		while(l<r){
			while(arr[l]<pivot) l++;
			while(arr[r]>pivot) r--;
			if(l>=r) break;
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			if(arr[l]==pivot) --r;
			if(arr[r]==pivot) ++l;
		}
		if(l==r){
			l++;
			r--;
		}
		if(left<r) sort(left,r,arr);
		if(right>l) sort(l,right,arr);
	}
}


/*
交换式排序法--快速排序法
快速排序(QuickSorting)是对冒泡排序的一种改进，由C.A.R.Hoare在1962年提出。
它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
其中一部分的所有数据都比另外一部分的所有数据都要小，
然后再按此方法对这两部数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
*/
package temp;

//演示冒泡排序法
public class Demo132 {
	public static void main(String[] args) {
		int arr[]={1,6,0,-1,9,-100,90};
		int temp=0;
		//排序
		//外层循环，可以决定一共走几趟
		for(int i=0;i<arr.length-1;i++){
			//内层循环，开始逐个比较，如果发现前一个数比后一个数大则交换
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					//换位
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//输出最后结果
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}

/**
冒泡排序(Bubble Sorting)的基本思想是：通过对待排序序列从后向前(从下标较大的元素开始)，
依次比较相邻元素的排序码，若发现逆序则交换，使排序码较小的元素逐渐从后部移向前部(从下标较大的单元移向下标较小的单元)，
就象水底下的气泡一样逐渐向上冒。
 因为排序的过程中，各元素不断接近自己的位置，如果一趟比较下来没有进行过交换，就说明序列有序，
 因此要在排序过程中设置一个标志flag判断元素是否进行过交换。从而减少不必要的比较。
 */
 

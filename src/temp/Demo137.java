package temp;

//合并排序法[Demo137.java]
public class Demo137{
  public static void main(String[] args) 
  {
      Merge m=new Merge();
      int a[]={5,4,10,8,7,9};
      m.merge_sort(a,0,a.length-1);
  }
}
class Merge{
  //递归分成小部分
  public void merge_sort(int[] arrays,int start,int end){
      if(start<end){
          int m=(start+end)/2;
          merge_sort(arrays,start,m);
          merge_sort(arrays,m+1,end);
          combin_arrays(arrays,start,m,end);    
      }
  }
  //合并数组
  public void combin_arrays(int[] arrays,int start,int m,int end){
      int length=end-start+1;
      int temp[]=new int[length];//用来存放比较的数组，用完复制回到原来的数组
      int i=start;
      int j=m+1;
      int c=0;
      while(i<=m &&j<=end){
          if(arrays[i]<arrays[j]){
              temp[c]=arrays[i];
              i++;
              c++;
          }else{
              temp[c]=arrays[j];
              j++;
              c++;
          }
      }
      while(i<=m){
          temp[c]=arrays[i];
          i++;
      }
      while(j<=end){
      temp[c]=arrays[j];
      j++;
      }
      c=0;
      for(int t=start;t<=end;t++,c++){
          arrays[t]=temp[c];
      }
      snp(arrays);
  }
  //打印数组
  public void snp(int[] arrays){
      for(int i=0;i<arrays.length;i++){
      System.out.print(arrays[i]+" ");
      }
      System.out.println();
  }
}



/*
合并排序法(Merge Sorting)是外部排序最常使用的排序方法。
若数据量太大无法一次完全加载内存，可使用外部辅助内存来处理排序数据，主要应用在文件排序。
排序方法：
   将欲排序的数据分别存在数个文件大小可加载内存的文件中，再针对各个文件分别使用“内部排序法”将文件中的数据排序好写回文件。
   再对所有已排序好的文件两两合并，直到所有文件合并成一个文件后，则数据排序完成。
 
1、将已排序好的A、B合并成E，C、D合并成F，E、F的内部数据分别均已排好序
2、将已排序好的E、F合并成G，G的内部数据已排好序

 */
 

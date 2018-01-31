package temp;



/*
 * 
多维数组
多维数组--二维数组
多维数组我们只介绍二维数组
1、定义
	语法：类型 数组名[][]=new 类型[大小][大小];
比如：int a[][]=new int[2][3];
2、分析
二维数组在内存中存在的形式
3、案例，请用二维数组输出如下图形
0 0 0 0 0 0
0 0 1 0 0 0
0 2 0 3 0 0
0 0 0 0 0 0

 * 
 * 
 * */
//二维数组演示[Demo138.java]
public class Demo138 {
	public static void main(String[] args) {
		int a[][]=new int[4][6];//定义二维数组a4行6列
		a[1][2]=1;
		a[2][1]=2;
		a[2][3]=3;
		//把图形输出
		for(int i=0;i<4;i++){//控制行
			for(int j=0;j<6;j++){//控制列
				System.out.print(a[i][j]+"\t");//输出数组
			}
			System.out.println();//换行
		}
	}
}

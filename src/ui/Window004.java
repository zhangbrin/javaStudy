package ui;

/**
 * 网格布局GridLayout使用演示
 * 1、继承JFrame
 * 2、定义你需要的各个组件
 * 3、创建组件(在构造函数中组件)
 * 4、添加组件
 * 5、对窗体设置
 * 6、显示窗体
 */
import java.awt.*;
import javax.swing.*;
public class Window004 extends JFrame{
	//定义组件
	int size=9;
	JButton jbs[]=new JButton[size];
	
	public static void main(String[] args) {
			Window004 win=new Window004();
	}
	
	public Window004(){
		//创建组件
		for(int i=0;i<size;i++){
			jbs[i]=new JButton(String.valueOf(i+1));
		}
		
		//添加各个组件
		for(int i=0;i<size;i++){
			this.add(jbs[i]);
		}
		
		//设置网格布局管理器
		this.setLayout(new GridLayout(3,3,10,10));//new GridLayout(行,列)设置布局有几行几列
		
		//设置窗体属性
		this.setTitle("网格布局演示");//窗体标题名称
		this.setSize(300, 200);//窗体尺寸
		this.setLocation(200, 200);//窗体在屏幕打开时的初始位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出窗体后将JFrame同时关闭
		
		//禁止用户改变窗体大小
		this.setResizable(false);
		
		//显示窗体
		this.setVisible(true);
	}
}


/*
网格布局GridLayout--注意事项
1、组件的相对位置不随容器的缩放而变化，但大小会变化；
2、所有组件的大小相同；
3、可以通过GridLayout(int rows,int cols,int hgap,int vgap)来指定网格的行/列，水平间隙/垂直间隙。
参数说明：rows:行数/cols:列数/hgap:垂直间隙/vgap:水平间隙


三大常用布局管理器--小结
开发GUI程序步骤
1、继承JFrame
2、定义需要的组件
3、创建组件
4、设置布局管理器
5、添加组件
6、显示窗体


 */


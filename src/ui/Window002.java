package ui;

/**
 * 边界布局BorderLayout:
 * 1、继承JFrame
 * 2、定义你需要的各个组件
 * 3、创建组件(在构造函数中组件)
 * 4、添加组件
 * 5、对窗体设置
 * 6、显示窗体
 */



import java.awt.*;
import javax.swing.*;
public class Window002 extends JFrame{
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args) {
			Window002 win=new Window002();

	}
	
	public Window002(){
		//创建组件
		jb1=new JButton("中部");
		jb2=new JButton("北部");
		jb3=new JButton("东部");
		jb4=new JButton("南部");
		jb5=new JButton("西部");
		
		//添加各个组件
		this.add(jb1, BorderLayout.CENTER);//BorderLayout.CENTER添加到中部
		this.add(jb2, BorderLayout.NORTH);//BorderLayout.NORTH添加到北部
		this.add(jb3, BorderLayout.EAST);//BorderLayout.EAST添加到东部
		this.add(jb4, BorderLayout.SOUTH);//BorderLayout.SOUTH添加到南部
		this.add(jb5, BorderLayout.WEST);//BorderLayout.WEST添加到西部
		
		//设置窗体属性
		this.setTitle("边界布局演示");//窗体标题名称
		this.setSize(300, 200);//窗体尺寸
		this.setLocation(200, 200);//窗体在屏幕打开时的初始位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出窗体后将JFrame同时关闭

		//显示窗体
		this.setVisible(true);
	}
}

/*
 * 边界布局BorderLayout--注意事项:
1、不是五个部分都必需添加；
2、中部组件会自动调节大小；
3、JFrame，Jdialog默认布局管理器就是BorderLayout
 * 
 */

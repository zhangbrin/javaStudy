package ui;

/**
 * 多种布局管理器，面板组件(JPanel)--使用
 */



import java.awt.*;
import javax.swing.*;
public class Window005 extends JFrame{
	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args) {
		Window005 win=new Window005();
	}
	//构造函数
	public Window005(){
		//创建组件
		jp1=new JPanel();//JPanel布局默认是FlowLayout流布局
		jp2=new JPanel();
		
		jb1=new JButton("西瓜");
		jb2=new JButton("苹果");
		jb3=new JButton("荔枝");
		jb4=new JButton("葡萄");
		jb5=new JButton("桔子");
		jb6=new JButton("香蕉");
		
		//设置布局管理器(Jpanel默认流布局)
		
		//添加JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//把Panel加入JFrame
		this.add(jp1, BorderLayout.NORTH);
		this.add(jb6, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		//设置窗体
		this.setSize(300, 250);//窗体大小
		this.setLocation(200, 200);//屏幕显示初始位置
		this.setVisible(true);//显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出窗体后将JFrame同时关闭
	}
}


/*
 * 面板组件(JPanel)--介绍
在图形用户界面编程中，如果只是普通的组件布局，我们用前面讲的三种布局管理器就可以解决，
但在比较复杂的布局要求时，就需要使用布局管理器的组合使用。

面板组件(JPanel)--使用[Window005.java]
JPanel：面板组件，非顶层容器，一个界面只可以有一个JFrame窗体组件，
但可以有多个JPanel面板组件，而JPanel上也可以使用FlowLayout、BorderLayout、GirdLayout等各种布局管理器，
这样可以组合使用达到较为复杂的布局效果。

面板(JPanel)组件--注意事项
1、JPanel是JComponent的子类；
2、属于容器类组件，可以加入别的组件；
3、默认布局管理器是流式布局(FlowLayout)


 */
 

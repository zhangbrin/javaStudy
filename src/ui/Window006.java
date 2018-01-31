package ui;

/**
 * Swing组件--文本框(JTextField)/密码框(JPasswordField)/标签(JLable)组件使用
 */
import java.awt.*;
import javax.swing.*;
public class Window006 extends JFrame{
	//定义组件
	JPanel jp1,jp2,jp3;//面板
	JLabel jlb1,jlb2;//标签
	JButton jb1,jb2;//按钮
	JTextField jtf;//文本
	JPasswordField jpf;//密码
	public static void main(String[] args) {
		Window006 win=new Window006();
	}
	
	//构造函数
	public Window006(){
		//创建面板
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		//创建标签
		jlb1=new JLabel("用户名");
		jlb2=new JLabel("密    码");
		//创建按钮
		jb1=new JButton("登录");
		jb2=new JButton("取消");
		//创建文本框
		jtf=new JTextField(10);
		//创建密码框
		jpf=new JPasswordField(10);
		
		//设置布局管理
		this.setLayout(new GridLayout(3, 1));//网格式布局
		
		//加入各个组件
		jp1.add(jlb1);
		jp1.add(jtf);
		
		jp2.add(jlb2);
		jp2.add(jpf);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//加入到JFrame
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//设置窗体
		this.setTitle("用户登录");//窗体标签
		this.setSize(300, 150);//窗体大小
		this.setLocationRelativeTo(null);//在屏幕中间显示(居中显示)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出关闭JFrame
		this.setVisible(true);//显示窗体
		
		//锁定窗体
		this.setResizable(false);
	}
}


/*
 * 
5.Swing组件--文本框/密码框/标签组件[Window006.java]
几个常用组件
在图形用户界面编程中，我们常常会提供用户登录界面，比如登录到会员管理系统，登录到工资管理系统、仓库管理系统等。这时候我们就会用到：
1、文本框(JTextField)
2、密码框(JPasswordField)
3、标签(JLable)

 * 
 */


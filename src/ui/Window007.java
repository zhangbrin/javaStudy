package ui;

/**
 * 复选框组件(JCheckBox)和单选框组件(JRadioButton)使用
 */


import java.awt.*;
import javax.swing.*;
public class Window007 extends JFrame{
	//定义组件
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	JCheckBox jcb1,jcb2,jcb3;
	JRadioButton jrb1,jrb2;
	ButtonGroup bg;
	JButton jb1,jb2;
	
	public static void main(String[] args) {
		Window007 win=new Window007();
	}
	//构造函数
	public Window007(){
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jl1=new JLabel("你最喜欢的运功:");
		jl2=new JLabel("你的性别:");
		
		jcb1=new JCheckBox("足球");
		jcb2=new JCheckBox("篮球");
		jcb3=new JCheckBox("网球");
		
		jrb1=new JRadioButton("男");
		jrb2=new JRadioButton("女");
		
		jb1=new JButton("注册用户");
		jb2=new JButton("取消注册");
		
		//一定要把jrb1与jrb2放入到一个ButtonGroup中
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		
		//创建布局
		this.setLayout(new GridLayout(3, 1));
		
		//加入组件
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);

		//设置窗体
		this.setTitle("用户注册");
		this.setSize(300, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}


/*
Swing组件--复选框/单选框组件[Window007.java]
几个常用组件
在图形用户界面编程中，我们常常会提供用户注册界面，这时候我们就会用到：
1、复选框组件(JCheckBox)
2、单选框组件(JRadioBuutton)
特别说明：
    同一组单选按钮必需先创建ButtonGroup，然后把单选框组件放入到ButtonGroup中
 */


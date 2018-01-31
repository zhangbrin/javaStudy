package ui;

/**
 * 拆分窗格(JSplitPane)的使用 
         金山词霸2007
 */
import java.awt.*;
import javax.swing.*;
public class Window009 extends JFrame{
	//定义组件
	JSplitPane jsp;
	JList jl;
	JLabel jlb;
	public static void main(String[] args) {
		Window009 win=new Window009();
}
	//构造函数
	public Window009(){
		//建立组件
		String[] words={"boy","girl","bird","close"};
		jl=new JList(words);
		
		jlb=new JLabel(new ImageIcon("images/cp.jpg"));//访问时路径\\或/
		//拆分窗格
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jl,jlb);
		//可以收缩变化
		jsp.setOneTouchExpandable(true);
		
		//设定布局管理器(JFrame本身就是BorderLayout布局)
		
		//加入组件
		this.add(jsp);
				
		//设置窗体
		this.setTitle("金山词霸2007");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

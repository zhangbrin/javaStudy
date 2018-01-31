package ui;

/**
 * 功能:事件处理机制
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Window016 extends JFrame implements ActionListener{
	//定义组件
	JPanel mp=null;
	JButton jb1,jb2;
	public static void main(String[] args) {
		Window016 win=new Window016();
	}
	//构造函数
	public Window016(){
		//创建组件
		mp=new JPanel();
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		//设定布局管理器
		
		//加入组件
		mp.setBackground(Color.black);
		this.add(mp);
		this.add(jb1,BorderLayout.NORTH);
		this.add(jb2,BorderLayout.SOUTH);
		
		//猫类在监听
		Cat mycat1=new Cat();
		jb1.addActionListener(mycat1);
		jb2.addActionListener(mycat1);
		//注册监听
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		//指定action命令
		jb1.setActionCommand("黑色");
		jb2.setActionCommand("红色");
		
		//JFrame窗体设置
		this.setTitle("事件处理机制");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//对事件处理的方法
	public void actionPerformed(ActionEvent e) {
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("黑色")){
			System.out.println("点击了黑色按钮");
			mp.setBackground(Color.BLACK);
		}else if(e.getActionCommand().equals("红色")){
			System.out.println("点击了红色按钮");
			mp.setBackground(Color.RED);
		}else{
			System.out.println("不知道");
		}
	}
}

class Cat implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("黑色")){
			System.out.println("Cat也知道你按下了黑色按钮");
		}else if(arg0.getActionCommand().equals("红色")){
			System.out.println("Cat也知道你按下了红色按钮");
		}else {
			System.out.println("Cat也不知道");
		}
	}
}


/*
java事件处理是采取“委派事件模型”。所谓“委派事件模型”是指当事件发生时，产生事件的对象(即事件源)，
会把此“信息”传递给“事件的监听者”处理的一种方式，而这里所说的“信息”实际上就是java.awt.event事件类库里某个类所创建的对象，
我们暂时把它称为“事件的对象”。

比如：当按下按钮时，就会在按钮触发一个“事件”，程序就会产生一个“事件对象”来表示这个事件，
并把这个“事件对象”传递给“事件的监听者”，
“事件的监听者”再根据“事件对象”的类型进行相应处理。
为了让“产生事件的对象”[比如按钮]知道要把事件传递给哪一个“事件监听者”，
我们必需先把“事件监听者”在“产生事件的对象”注册，这个操作也就是要告知“产生事件的对象”要把事件传递给它。

 */
 

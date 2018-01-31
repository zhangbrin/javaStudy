package ui;

/**
 * 多行文本框(JTextArea)组件使用
 */


import java.awt.*;
import javax.swing.*;
public class Window010 extends JFrame{
	//定义组件
	JTextArea jta=null;
	JScrollPane jsp=null;
	JPanel jp1=null;
	JComboBox jcb=null;
	JTextField jtf=null;
	JButton jb=null;
	public static void main(String[] args) {
		Window010 win=new Window010();
	}
	//构造函数
	public Window010(){
		//构建组件
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		jp1=new JPanel();
		String[] chatter={"布什","拉登"};
		jcb=new JComboBox(chatter);
		jtf=new JTextField(10);
		jb=new JButton("发送");
		//设定布局管理器
		
		//加入组件
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		this.add(jsp);
		this.add(jp1,BorderLayout.SOUTH);
		
		//设定窗体
		this.setTitle("QQ聊天窗口");
		this.setIconImage((new ImageIcon("images\\cp.jpg")).getImage());//设置标题栏内图标
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}

package ui;

/**
 * 单事件源、多事件监听，多事件处理
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Window018 extends JFrame{
	//设定组件
	MyPanel18 mp=null;
	
	public static void main(String[] args) {
		Window018 win=new Window018();
	}

	public Window018(){
		//创建组件
		mp=new MyPanel18();
		
		//注册监听
		this.addMouseListener(mp);
		this.addMouseMotionListener(mp);
		this.addKeyListener(mp);
		this.addWindowListener(mp);
		
		//加入组件
		this.add(mp);
		//设置窗体
		this.setTitle("事件多监听多处理");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//1、让MyPanel知道鼠标按下的消息，并且知道点击的位置(x,y)
//2、让MyPanel知道哪个键按下了

class MyPanel18 extends JPanel implements MouseListener, MouseMotionListener,KeyListener,WindowListener{
	public void paint(Graphics g){
		super.paint(g);
	}

	//鼠标点击(mouseClicked)
	public void mouseClicked(MouseEvent e) {
		System.out.println("鼠标点击了x="+e.getX()+"y="+e.getY());
	}

	//鼠标移动到MyPanel(mouseEntered)
	public void mouseEntered(MouseEvent e) {
		System.out.println("鼠标移动到MyPanel上了");
	}

	//鼠标离开MyPanel(mouseExited)
	public void mouseExited(MouseEvent e) {
		System.out.println("鼠标离开MyPanel上了");
	}
	
	//鼠标按下去(mousePressed)
	public void mousePressed(MouseEvent e) {
		System.out.println("鼠标被按下了");
	}

	//鼠标松开(mouseReleased)
	public void mouseReleased(MouseEvent e) {
		System.out.println("鼠标被松开了");
	}

	//鼠标拖拽(mouseDragged)
	public void mouseDragged(MouseEvent e) {
		System.out.println("鼠标拖拽x="+e.getX()+"y="+e.getY());
	}

	//鼠标移动(mouseMoved)
	public void mouseMoved(MouseEvent e) {
		System.out.println("鼠标移动时X="+e.getX()+"Y="+e.getY());
	}

	//键输入值(keyTyped)，F(1-12)无响应
	public void keyTyped(KeyEvent e) {
		System.out.println("按下了"+e.getKeyChar()+"键");
	}

	//键按下(keyPressed)
	public void keyPressed(KeyEvent e) {
		System.out.println("按下了"+e.getKeyChar()+"键");
	}

	//键松开(keyReleased)
	public void keyReleased(KeyEvent e) {
		System.out.println("按下了"+e.getKeyChar()+"键");
	}

	//打开窗口(windowOpened)
	public void windowOpened(WindowEvent e) {
		System.out.println("打开窗口(windowOpened)");
	}

	//窗口关闭(windowClosing)
	public void windowClosing(WindowEvent e) {
		System.out.println("窗口关闭(windowClosing)");
	}

	//窗口关闭(windowClosed)
	public void windowClosed(WindowEvent e) {
		System.out.println("窗口关闭(windowClosed)");
	}

	//窗口最小化(windowIconified)
	public void windowIconified(WindowEvent e) {
		System.out.println("窗口最小化(windowIconified)");
	}

	//恢复窗口(windowDeiconified)
	public void windowDeiconified(WindowEvent e) {
		System.out.println("恢复窗口(windowDeiconified)");
	}

	//激活窗口，使用窗口(windowActivated)
	public void windowActivated(WindowEvent e) {
		System.out.println("激活窗口(windowActivated)");
	}

	//窗口停用,切换窗口(windowDeactivated)
	public void windowDeactivated(WindowEvent e) {
		System.out.println("窗口停用(windowDeactivated)");
	}
}




/*
总结--事件编程步骤：
1、编写事件处理类(事件监听者)
2、根据需求给事件处理类实现监听器接口
3、在事件处理中重写(实现)其事件处理的函数
4、在事件源类中指定该事件的监听器(响应者)是谁

注意事项：
1、java采用委托机制处理事件
2、java中的事件是分类的，比如对窗体事件、鼠标事件、按键事件、操作事件[按按钮]
3、java中一个类要监听某个事件，则必需实现相应的事件监听接口
4、事件监听接口有多种，程序员应当针对不同的情况，实现不同的监听接口，
比如监听鼠标事件就应当实现MouseListener;要监听键盘事件，就应当实现KeyListener..
5、在实现监听接口的类(事件监听类/者)中，需要重写处理函数，比如实现了ActionListener接口，
就应当重写actionPerformed(ActionEvent e),可以参考前面的事件监听器接口表格
6、在事件源中需要注册事件监听类。否则事件监听类接收不到事件源发生的事件。

一个类要实现监听的步骤：
a、实现相应的接口[KeyListener/MouseListener/ActionListener/WindowListener]
b、把接口的处理方法根据需要重新编写(Override)
c、在事件源上注册监听
d、事件传递是靠事件(类)对象

 */
  

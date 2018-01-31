package ui;

//画图Graphics画图类--画图片--画字[Window015.java]
import java.awt.*;
import javax.swing.*;
public class Window015 extends JFrame{
	//定义组件
	MyPanel15 mp=null;
	public static void main(String[] args) {
		Window015 th=new Window015();
	}
	public Window015(){
		//构建组件
		mp=new MyPanel15();
		//加入组件
		this.add(mp);
		//设置窗体
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//定义一个MyPanel(我自己的面板是用于绘图和显示绘图的区域)
class MyPanel15 extends JPanel{
	//重写(覆盖)JPanel的paint方法
	public void paint(Graphics g){//Graphics是绘图的重要类，可以把它理解成一只画笔
		//1、调用父类函数，完成初始化任务
		super.paint(g);
		
		//在面板上画出图片
		//path  不以’/'开头时，默认是从此类所在的包下取资源；
		//path  以’/'开头时，则是从ClassPath根下获取；    images/cp.jpg
//	    Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/F22.jpg"));
//		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/images/cp.jpg"));

		//实现
		g.drawImage(null, 0, 0, 300, 200, this);
		
		//如何画出字
		g.setColor(Color.red);
		g.setFont(new Font("黑体",Font.BOLD,40));
		g.drawString("祖国万岁", 100, 100);
		//画弧形
		g.drawArc(100, 100, 120, 200, -50, -100);
	}
}

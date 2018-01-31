package ui;

/**
 * 功能：java绘图原理
 */
import java.awt.*;
import javax.swing.*;
public class Window013 extends JFrame{
	//定义组件
	MyPanel mp=null;
	public static void main(String[] args) {
		Window013 th=new Window013();
	}
	public Window013 (){
		//创建组件
		mp=new MyPanel();
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
class MyPanel extends JPanel{
	//重写(覆盖)JPanel的paint方法
	public void paint(Graphics g){//Graphics是绘图的重要类，可以把它理解成一只画笔
		//1、调用父类函数，完成初始化任务
		super.paint(g);//super.paint(g);这句话不能少
		System.out.println("Paint被调用");//用于测试绘图原理2paint调用
		//先画一个圆
		g.drawOval(10, 10, 30, 30);//drawOval方法是画圆
	}
}



/*
 * 
 java绘图坐标体系
绘图坐标本系--介绍
坐标原点位于左上角，以像素为单位。像素是计算机屏幕上最小的显示单位。在java的坐标系中，
第一个是X坐标，表示当前位置为水平方向，距离坐标原点X个像素；第二个是Y坐标，
表示当前位置为垂直方向，距离坐标原点Y个像素。

 * 
 计算机在屏幕上显示的内容都是由屏幕上的每一个像素组成的。
 例如，计算机显示器的分辨率是800×600，表示计算机屏幕上的每一行由800个点组成，共有600行，
 整个计算机屏幕共有480000个像素。现在的计算机可以支持更高的分辨率，也就是说，屏幕上可以显示更多的像素。
 因此，像素是一个密度单位，而厘米是长度单位，两者无法比较。

绘图原理(1)[Window013.java]
Component类提供了两个和绘图相关最重要的方法：
1、paint(Graphics g)绘制组件的外观
2、repaint()刷新组件的外观
当组件第一次在屏幕显示的时候，程序会自动的调用paint()方法来绘制组件

 */



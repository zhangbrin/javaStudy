package ui;

//java画图Graphics绘图类的使用方法
import java.awt.*;

import javax.swing.*;

public class Window014 extends JFrame{
	//定义组件
	MyPanel14 mp=null;
	public static void main(String[] args) {
		Window014 th=new Window014();
	}
	public Window014(){
		//构建组件
		mp=new MyPanel14();
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
class MyPanel14 extends JPanel{
	//重写(覆盖)JPanel的paint方法
	public void paint(Graphics g){//Graphics是绘图的重要类，可以把它理解成一只画笔
		//1、调用父类函数，完成初始化任务
		super.paint(g);
		//画一个直线
		g.drawLine(10, 10, 40, 10);
		//画矩形边框
		g.drawRect(50, 50, 40, 40);
		//画椭圆边框
		g.drawOval(100, 100, 60, 60);
		//画填充矩形
		g.setColor(Color.blue);
		g.fillRect(10, 150, 70, 70);
		//画填充椭圆
		g.setColor(Color.red);//设置画笔颜色
		g.fillOval(200, 50, 80, 80);
	}
}


/**
 * 
在以下情况paint()将会被调用：
1、窗口最小化，再最大化
2、窗口的大小发生变化
3、repaint函数被调用

java绘图技术--Graphics
Graphics类[Window014.java]
Graphics类你可以理解就是画笔，为我们提供了各种绘制图形的方法：[多看jdk帮助文档]
1、画直线 drawLine(int x1,int y1,int x2,int y2);
2、画矩形边框 drawRect(int x,int y,int width,int height);
3、画椭圆边框 drawOval(int x,int y,int width,int height);
4、填充矩形 fillRect(int x,int y,int width,int height);
5、填充椭圆 fillOval(int x,int y,int width,int height);
6、画图片 drawImage(Image img.int x,int y,..);
7、画字符串 drawString(String str,int x,int y);
8、设置画笔的字体 setFont(Font font);
9、设置画笔的颜色 setColor(Color c);

 * 
 */
 

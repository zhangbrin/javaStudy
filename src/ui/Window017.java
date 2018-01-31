package ui;

/* 
功能：加深对事件处理机制的理解
* 1、通过上下左右键，来控制一个小球的移动。
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window017 extends JFrame {
	//设定组件
	MyPanels mp=null;
	public static void main(String[] args) {
		Window017 win=new Window017();
	}
	//构造函数
	public Window017(){
		//构建组件
		mp=new MyPanels();
		
		//监听
		this.addKeyListener(mp);
				
		//加入组件
		this.add(mp);
		//设置窗体
		this.setTitle("键盘事件监听");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//定义自己的面板
class MyPanels extends JPanel implements KeyListener{
	int x=10,y=10;
	public void paint(Graphics g){
		super.paint(g);
		g.fillOval(x, y, 10, 10);
	}

	public void keyPressed(KeyEvent e) {//keyPressed代表键被按下
		System.out.println("被按下"+((char)e.getKeyCode()));
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			System.out.println("向下");
			y++;
		}else if(e.getKeyCode()==KeyEvent.VK_UP){
			System.out.println("向上");
			y--;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			System.out.println("向左");
			x--;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			System.out.println("向右");
			x++;
		}
		
		//调用repaint()函数，来重绘界面
		this.repaint();
	}

	public void keyReleased(KeyEvent e) {//keyReleased代表键被弹起
		
	}
	
	public void keyTyped(KeyEvent e) {//keyTyped代表具体的值被输出
		
	}
}







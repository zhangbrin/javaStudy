package ui;

//功能：GUI界面开发演示[Window001.java]
import java.awt.*;//开发图形要引入java.awt.*包
import javax.swing.*;//开发图形要引入javax.swing.*包
public class Window001 extends JFrame{//继承JFrame顶层容器类(可以添加其它swing组件的类)
	//把需要的swing组件，定义到这里
	JButton jb1=null;
	
	public static void main(String[] args) {
		Window001 win=new Window001();
	}

	//构造函数
	public Window001(){
		//创建一个button按钮
		jb1=new JButton("按钮");
		
		//添加JButton组件
		this.add(jb1);
		
		//给窗体设置标题
		this.setTitle("Hello World!");
		
		//设置窗体大小,按像素设置大小
		this.setSize(500, 500);
		
		//设置窗体初始位置
		this.setLocation(500, 150);
		
		//设置当关闭窗口时，保证JVM也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//显示窗体
		this.setVisible(true);//true显示，false不显示
	}

}

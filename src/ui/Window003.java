package ui;

/**
 * 流式布局FlowLayout:
 * 1、继承JFrame
 * 2、定义你需要的各个组件
 * 3、创建组件(在构造函数中组件)
 * 4、添加组件
 * 5、对窗体设置
 * 6、显示窗体
 */

/*
 * 
 * FlowLayout布局，
 * 按照组件的添加次序将按钮组件(当然也可以是别的组件)从左到右放置在容器中。
 * 当到达容器的边界时，组件将放置到下一行中。
 * FlowLayout可以以左对齐、居中对齐、以右对齐的方式排列组件。
 * 
 */



import java.awt.*;
import javax.swing.*;
public class Window003 extends JFrame{
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
			Window003 win=new Window003();
	}
	
	public Window003(){
		//创建组件
		jb1=new JButton("关羽");
		jb2=new JButton("张飞");
		jb3=new JButton("赵云");
		jb4=new JButton("马超");
		jb5=new JButton("黄忠");
		jb6=new JButton("魏延");
		
		//添加各个组件
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//设置布局管理器,流式布局默认为居中对齐
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//new FlowLayout(FlowLayout.LEFT)流式布局，(FlowLayout.??)??可以设置为不同方式对齐。
		//设置窗体属性
		this.setTitle("流式布局演示");//窗体标题名称
		this.setSize(300, 200);//窗体尺寸
		this.setLocation(200, 200);//窗体在屏幕打开时的初始位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出窗体后将JFrame同时关闭

		//禁止用户改变窗体大小
		this.setResizable(false);

		//显示窗体
		this.setVisible(true);
	}
}


/*
流式布局FlowLayout--注意事项:
1、不限制他所管理的组件大小，允许他们有最佳大小
2、当容器衩缩放时，组件的位置可能变化，但组件的大小不变。
3、默认组件是居中对齐，可以通过FlowLayout(intalign)函数来指定对齐方式。
*/
package ui;

/**
 * 记事本界面（菜单）:
 * 1、菜单组件
    	JMenuBar	菜单条组件	树干
    	JMenu		菜单组件	树枝
    	JMenuItem	菜单项组件	树叶
	2、二级菜单制作
    	JMenu里面可以嵌套JMenu
	3、工具条组件
    	JToolBar	容器类组件
 */
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class Window012 extends JFrame{
	//文件组定义组件
	JMenuBar jmb;//菜单条组件
	JMenu menu1,menu2,menu3,menu4,menu5;//主菜单：文件、编辑、格式、查看、帮助
	JMenuItem item2,item3,item4,item5,item6,item7;//子菜单：新建、打开、保存、另存为、页面设置、打印、退出
	JMenu xinjian;//二级菜单
	JMenuItem file,project;
	
	//编辑组定义组件
	//编辑：撤消、剪切、复制、粘贴、删除、查找、查找下一个、替换、转到、全选、时间/日期
	JMenuItem eitem1,eitem2,eitem3,eitem4,eitem5,eitem6,eitem7,eitem8,eitem9,eitem10,eitem11;
	
	//格式组定义组件
	JMenuItem oitem1,oitem2;//格式：自动换行、字体
	
	//查看组定义组件
	JMenuItem vitem1;//查看：状态栏
	
	//帮助组定义组件
	JMenuItem hitem1,hitem2;//帮助：查看帮助、关于记事本
	
	JTextArea jta;
	//工具条
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8;
	
	public static void main(String[] args) {
		Window012 win=new Window012();
	}
	//构造函数
	public Window012(){
		//构建组件
		//工具条
		jtb=new JToolBar();
		jb1=new JButton(new ImageIcon("images/new.png"));
		jb1.setToolTipText("新建");//设置提示信息
		jb2=new JButton(new ImageIcon("images/open.png"));
		jb2.setToolTipText("打开");
		jb3=new JButton(new ImageIcon("images/save.png"));
		jb3.setToolTipText("保存");
		jb4=new JButton(new ImageIcon("images/copy.jpg"));
		jb4.setToolTipText("复制");
		jb5=new JButton(new ImageIcon("images/delete.jpg"));
		jb5.setToolTipText("删除");
		jb6=new JButton(new ImageIcon("images/modify.jpg"));
		jb6.setToolTipText("编辑");
		jb7=new JButton(new ImageIcon("images/print.jpg"));
		jb7.setToolTipText("打印");
		jb8=new JButton(new ImageIcon("images/close.jpg"));
		jb8.setToolTipText("关闭");
		
		jmb=new JMenuBar();
		//主菜单
		menu1=new JMenu("文件(F)");
		menu1.setMnemonic('F');//设置助记符
		menu2=new JMenu("编辑(E)");
		menu2.setMnemonic('E');
		menu3=new JMenu("格式(O)");
		menu3.setMnemonic('O');
		menu4=new JMenu("查看(V)");
		menu4.setMnemonic('V');
		menu5=new JMenu("帮助(H)");
		menu5.setMnemonic('H');
		
		//文件--新建--子目录
		xinjian=new JMenu("新建");
		file=new JMenuItem("文件");
		project=new JMenuItem("工程");
		
		item2=new JMenuItem("打开(O)");
		item2.setMnemonic('O');
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));//设置ctrl快捷组合键
		item3=new JMenuItem("保存(S)");
		item3.setMnemonic('S');
		item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		item4=new JMenuItem("另存为(A)");
		item4.setMnemonic('A');
		item5=new JMenuItem("页面设置(U)");
		item5.setMnemonic('U');
		item6=new JMenuItem("打印(P)");
		item6.setMnemonic('P');
		item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));
		item7=new JMenuItem("退出(X)");
		item7.setMnemonic('X');
		
		eitem1=new JMenuItem("撤消(U)");
		eitem1.setMnemonic('U');
		eitem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,InputEvent.CTRL_MASK));
		eitem2=new JMenuItem("剪切(T)");
		eitem2.setMnemonic('T');
		eitem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,InputEvent.CTRL_MASK));
		eitem3=new JMenuItem("复制(C)");
		eitem3.setMnemonic('C');
		eitem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
		eitem4=new JMenuItem("粘贴(P)");
		eitem4.setMnemonic('P');
		eitem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));
		eitem5=new JMenuItem("删除(L)");
		eitem5.setMnemonic('L');
		eitem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		eitem6=new JMenuItem("查找(F)");
		eitem6.setMnemonic('F');
		eitem6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));
		eitem7=new JMenuItem("查找下一个(N)");
		eitem7.setMnemonic('N');
		eitem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
		eitem8=new JMenuItem("替换(R)");
		eitem8.setMnemonic('R');
		eitem8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK));
		eitem9=new JMenuItem("转到(G)");
		eitem9.setMnemonic('G');
		eitem9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK));
		eitem10=new JMenuItem("全选(A)");
		eitem10.setMnemonic('A');
		eitem10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
		eitem11=new JMenuItem("时间/日期(D)");
		eitem11.setMnemonic('D');
		eitem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
		
		oitem1=new JMenuItem("自动换行(W)");
		oitem1.setMnemonic('W');
		oitem2=new JMenuItem("字体(F)");
		oitem2.setMnemonic('F');
		
		vitem1=new JMenuItem("状态栏(S)");
		vitem1.setMnemonic('S');
		
		hitem1=new JMenuItem("查看帮助(H)");
		hitem1.setMnemonic('H');
		hitem2=new JMenuItem("关于记事本(A)");
		hitem2.setMnemonic('A');
		
		jta=new JTextArea();
		
		//设定布局管理器
		
		//加入组件
		//将按钮添加到工具条上
		jtb.add(jb1);
		jtb.add(jb2);
		jtb.add(jb3);
		jtb.add(jb4);
		jtb.add(jb5);
		jtb.add(jb6);
		jtb.add(jb7);
		jtb.add(jb8);
		
		//将菜单项添加到菜单上
		xinjian.add(file);
		xinjian.add(project);
		
		menu1.add(xinjian);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.addSeparator();//添加分割线
		menu1.add(item5);
		menu1.add(item6);
		menu1.addSeparator();
		menu1.add(item7);
		
		menu2.add(eitem1);
		menu2.addSeparator();
		menu2.add(eitem2);
		menu2.add(eitem3);
		menu2.add(eitem4);
		menu2.add(eitem5);
		menu2.addSeparator();
		menu2.add(eitem6);
		menu2.add(eitem7);
		menu2.add(eitem8);
		menu2.add(eitem9);
		menu2.addSeparator();
		menu2.add(eitem10);
		menu2.add(eitem11);
		
		menu3.add(oitem1);
		menu3.add(oitem2);
		
		menu4.add(vitem1);
		
		menu5.add(hitem1);
		menu5.addSeparator();
		menu5.add(hitem2);
		
		//将菜单添加到菜单条上
		jmb.add(menu1);
		jmb.add(menu2);
		jmb.add(menu3);
		jmb.add(menu4);
		jmb.add(menu5);
		
		//将菜单条添加到窗体上
		this.setJMenuBar(jmb);
		
		//将工具条添加到窗体上
		this.add(jtb,BorderLayout.NORTH);
		
		JScrollPane jsp=new JScrollPane(jta);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(jsp);
		
		//窗体设置
		this.setTitle("Java记事本");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}


package thread;

/**
 * 演示如何通过继承Thread来开发线程
 */
public class Thread01 {
	
	public static void main(String[] args) {
		//创建一个 Cat对象
		Cat cat=new Cat();
		//启动线程
		cat.start();//.start()会导致run函数运行
	}
}

class Cat extends Thread{
	int times=0;
	
	//重写run函数
	public void run(){
		while(true){
			//休眠一秒
			//1000表示1000毫秒
			try {
				Thread.sleep(1000);//sleep就会让该线程进入到Blocked阻塞状态,并释放资源。
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			times++;
			System.out.println("hello,world!"+times);
			
			if(times==10){
				break;//退出线程
			}

		}
	}
}

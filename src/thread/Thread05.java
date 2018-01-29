package thread;

/**
 * 功能:使用线程的注意事项
 * 线程并发同步锁synchronized(Object){}的使用
 */
public class Thread05 {
	public static void main(String[] args) {
		//定义一个售票窗口
		TicketWindow tw1=new TicketWindow();
		
		//使用三个线程同时启动
		Thread t1=new Thread(tw1);
		Thread t2=new Thread(tw1);
		Thread t3=new Thread(tw1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

//售票窗口类
class TicketWindow implements Runnable {
	//共有2000张票
	private int nums=2000;
	private Dog3 myDog=new Dog3();

	public void run() {
		while(true){
			//出票速度是1秒出一张
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			//认为if else要保证其原子性
			//先判断是否还有票
			synchronized(myDog){//synchronized(this){}为同步代码块
				if(nums>0){
					//显示售票信息
					//Thread.currentThread().getName()得到当前线程的名字
					System.out.println(Thread.currentThread().getName()+"正在售出第"+nums+"张票");
					nums--;
				}else{
					//售票结束
					break;
				}
			}
		}
	}
}

class Dog3{
}

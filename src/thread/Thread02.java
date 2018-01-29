package thread;

/**
 * 演示如何通过实现Runnable接口来开发线程
 */
public class Thread02{
	public static void main(String []args){
		Dog dog=new Dog();
		//创建线程
		Thread t=new Thread(dog);
		//启动线程
		t.start();
	}
}

class Dog implements Runnable{//创建Runnable接口
	public void run(){//重写run函数
		int times=0;
		while(true){
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			System.out.println("hello,wrold!"+times);
			if(times==10){
				break;
			}
		}
	}
}

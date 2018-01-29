package thread;

/**
 * 功能:使用线程的注意事项
 * 不论继承Thread或实现Rnunable接口都不能使用start启同一个线程2次
 */
public class Thread04 {
	public static void main(String[] args) {
		Cat1 cat1=new Cat1();
		cat1.start();
		//cat1.start();同一个线程，不能启动2次
		
		Dog1 dog1=new Dog1();
		Thread t=new Thread(dog1);
		t.start();
		//t.start();同一个线程，不能启动2次
	}
}

//猫类
class Cat1 extends Thread{
	public void run(){
		System.out.println("11");
	}
}

//狗类
class Dog1 implements Runnable{
	public void run(){
		System.out.println("2");
	}
}

package thread;

/**
 * ����:ʹ���̵߳�ע������
 * ���ۼ̳�Thread��ʵ��Rnunable�ӿڶ�����ʹ��start��ͬһ���߳�2��
 */
public class Thread04 {
	public static void main(String[] args) {
		Cat1 cat1=new Cat1();
		cat1.start();
		//cat1.start();ͬһ���̣߳���������2��
		
		Dog1 dog1=new Dog1();
		Thread t=new Thread(dog1);
		t.start();
		//t.start();ͬһ���̣߳���������2��
	}
}

//è��
class Cat1 extends Thread{
	public void run(){
		System.out.println("11");
	}
}

//����
class Dog1 implements Runnable{
	public void run(){
		System.out.println("2");
	}
}

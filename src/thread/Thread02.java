package thread;

/**
 * ��ʾ���ͨ��ʵ��Runnable�ӿ��������߳�
 */
public class Thread02{
	public static void main(String []args){
		Dog dog=new Dog();
		//�����߳�
		Thread t=new Thread(dog);
		//�����߳�
		t.start();
	}
}

class Dog implements Runnable{//����Runnable�ӿ�
	public void run(){//��дrun����
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

package thread;

/**
 *���߳�Threadʹ��
 *1��һ���߳�ͨ������n��ִ��1+..+n�õ���
 *2����һ�߳�ÿ��1�����һ��hello world!
 */

public class Thread03 {
	public static void main(String[] args) {
		Pig pig=new Pig(10);
		Bird bird=new Bird(10);
		//�����߳�
		Thread t1=new Thread(pig);
		Thread t2=new Thread(bird);
		//�����߳�
		t1.start();
		t2.start();
	}
}

//��ӡhello world!
class Pig implements Runnable{
	int n=0;
	int times=0;
	public Pig(int n){
		this.n=n;
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			times++;
			System.out.println("Pig��һ���̣߳����������"+times+"��hello world!");
			if(times==n){
				break;
			}
		}
	}
}

//����ѧ��
class Bird implements Runnable{//���߳�ʱӦʹ��implements�ӿ���ʵ�֣���Ҫʹ��extends�̳�
	int n=0;
	int res=0;
	int times=0;
	public Bird(int n){
		this.n=n;
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			res+=(++times);
			System.out.println("Bird��ǰ����ǣ�"+res);
			if(times==n){
				System.out.println("Bird���Ľ���ǣ�"+res);
				break;
			}
		}
	}
}

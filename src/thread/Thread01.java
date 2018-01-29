package thread;

/**
 * ��ʾ���ͨ���̳�Thread�������߳�
 */
public class Thread01 {
	
	public static void main(String[] args) {
		//����һ�� Cat����
		Cat cat=new Cat();
		//�����߳�
		cat.start();//.start()�ᵼ��run��������
	}
}

class Cat extends Thread{
	int times=0;
	
	//��дrun����
	public void run(){
		while(true){
			//����һ��
			//1000��ʾ1000����
			try {
				Thread.sleep(1000);//sleep�ͻ��ø��߳̽��뵽Blocked����״̬,���ͷ���Դ��
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			times++;
			System.out.println("hello,world!"+times);
			
			if(times==10){
				break;//�˳��߳�
			}

		}
	}
}

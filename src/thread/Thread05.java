package thread;

/**
 * ����:ʹ���̵߳�ע������
 * �̲߳���ͬ����synchronized(Object){}��ʹ��
 */
public class Thread05 {
	public static void main(String[] args) {
		//����һ����Ʊ����
		TicketWindow tw1=new TicketWindow();
		
		//ʹ�������߳�ͬʱ����
		Thread t1=new Thread(tw1);
		Thread t2=new Thread(tw1);
		Thread t3=new Thread(tw1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

//��Ʊ������
class TicketWindow implements Runnable {
	//����2000��Ʊ
	private int nums=2000;
	private Dog3 myDog=new Dog3();

	public void run() {
		while(true){
			//��Ʊ�ٶ���1���һ��
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			//��Ϊif elseҪ��֤��ԭ����
			//���ж��Ƿ���Ʊ
			synchronized(myDog){//synchronized(this){}Ϊͬ�������
				if(nums>0){
					//��ʾ��Ʊ��Ϣ
					//Thread.currentThread().getName()�õ���ǰ�̵߳�����
					System.out.println(Thread.currentThread().getName()+"�����۳���"+nums+"��Ʊ");
					nums--;
				}else{
					//��Ʊ����
					break;
				}
			}
		}
	}
}

class Dog3{
}

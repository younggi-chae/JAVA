package ex.object4;

class Tv {
	boolean power;  //���� on/off
	int channel;    //ä��
	
	void power()       { power = !power; } // power�� ���� true�� false��, false�� true�� �����ϴ� ����
	void channelUp()   {   ++channel;    }
	void channelDown() {   --channel;    }
}

class CaptionTv extends Tv {
	boolean caption;    //ĸ�ǻ��� on/off
	void displayCaption(String text) {
		if(caption) {   //ĸ�� ���°� on(true)�� ���� text�� ������
			System.out.println(text);
		}
	}
}

public class inheritanceEx1 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello world");
		ctv.caption = true; //ĸ�� ��� �۵�
		ctv.displayCaption("Hello world");

	}

}

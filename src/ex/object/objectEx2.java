package ex.object;


public class objectEx2 {

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3]; //���̰� 3�� ��ü�迭 ����
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //tvArr[i]�� channel�� i+10�� ����
		}
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i]�� �޼��带 ȣ��
			System.out.println(tvArr[i].channel);
		}
	}

}


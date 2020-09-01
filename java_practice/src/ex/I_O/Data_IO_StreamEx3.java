package ex.I_O;
import java.io.*;

public class Data_IO_StreamEx3 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
			
		}catch (EOFException e) {  // �� �̻� ���� �����Ͱ� ������ EOFException �߻�
			System.out.println("������ ������  " + sum + "�Դϴ�.");
		}catch (IOException ie) {
			ie.printStackTrace();
		}finally {   // while���� ���ѹݺ��̱� ������ finally�� ���� ��Ʈ���� �ݵ��� ó��
			try {
				if(dis != null)
					dis.close();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}

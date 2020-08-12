package ex.I_O;

import java.io.*;

public class Buffered_IO_StreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fo = new FileOutputStream("123.txt");
            
			//������ ũ�⸦ 5�� �Ѵ�.
			BufferedOutputStream bos = new BufferedOutputStream(fo, 5);

			for (int i = '1'; i <= '9'; i++) {
				bos.write(i); 
			}

			bos.close();   // ���ۿ� ������ ���� �ҽ��� �����ʵ��� flush()�� close()�� ���� ��� ������ ��µǵ��� �Ѵ�.
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

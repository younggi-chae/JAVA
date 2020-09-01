package ex.I_O;

import java.io.*;

public class File_IO_StreamEx1 {
     //���ڱ�ݽ�Ʈ��  FileReader, FileWriter
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);

			int data = 0;  // ī���� ���� ����
			while ((data = fis.read()) != -1) {
				fos.write(data);  // ī��
			}

			fis.close();  //ByteArray�� �޸� close�޼��� ���
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package ex.exception;

import java.io.*;

public class exceptionEx3 {

	public static void main(String[] args) {
		try {  //FileŬ�������� ���ܸ� �Ѱܹ޾� ó��
			File f = createFile(args[0]);
			System.out.println(f.getName() + " ������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}

	static File createFile(String fileName) throws Exception {
           //throwsŰ���带 ���� Exception�� main�޼���� �ѱ��. main�޼��忡�� Exceptionó��
		if (fileName == null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		File f = new File(fileName);  //����Ŭ������ ��ü ����
		f.createNewFile();  //File��ü�� createFile�޼��带 �̿��ؼ� ���� ������ ����
		return f;   // ������ ��ü�� ������ ��ȯ

	}

}

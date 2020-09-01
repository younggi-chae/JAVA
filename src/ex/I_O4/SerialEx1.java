package ex.I_O4;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialEx1 {

	public static void main(String[] args) {
		
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			list.add(u1);
			list.add(u2);
			
			//��ü�� ����ȭ
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("����ȭ�� �� �������ϴ�.");
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}

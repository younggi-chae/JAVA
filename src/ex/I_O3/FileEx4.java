package ex.I_O3;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileEx4 {

	public static void main(String[] args) {
		
		String currDir = System.getProperty("user.dir"); // ������ġ ������ ��´�.
		File dir = new File(currDir);
		
		File [] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute = "DIR";
			}else {
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";  // ���� �� �ִ� �������� Ȯ��
				attribute = f.canWrite() ? "W" : " "; // �� �� �ִ� �������� Ȯ��
				attribute = f.isHidden() ? "H" : " "; // ����Ӽ��� �ִ� �������� Ȯ��
			}
			
			System.out.printf("%s %3s %6s %s\n", df.format(new Date(f.lastModified())), attribute, size, name);
			
		}

	}

}

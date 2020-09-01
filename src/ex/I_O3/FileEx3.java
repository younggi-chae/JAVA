package ex.I_O3;
import java.io.*;
import java.util.*;

public class FileEx3 {

	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java FileEx3 DIRECTOTY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {  //dir�� �������� �ʰų� ���丮�� ���Ե��� �ʴ´ٸ�
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
			
		}
		
		printFileList(dir);
		
		System.out.println();
		System.out.println("�� " + totalFiles + "���� ����");
		System.out.println("�� " + totalDirs + "���� ����");

	}
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath() + " ���丮"); //������ ���
		File[] files = dir.listFiles();  //���� ����Ʈ�� files �迭�� ��´�.
		
		ArrayList subDir = new ArrayList(); //���丮 ���, ���ȣ��
		
		for(int i = 0; i < files.length; i++) {
			String filename = files[i].getName();  //for���� ���� ������ �̸��� �ϳ��� ����
			
			if(files[i].isDirectory()) {  // ������ ���丮�� ���Եȴٸ�
				filename = "[" + filename + "]";
				subDir.add(i+"");  
			}
			System.out.println(filename);
		}
		
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;  // �ߺ����� ����
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "���� ����, " + dirNum + "���� ���丮");
		System.out.println();
		
		for(int i = 0; i < subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
		}
	}

}

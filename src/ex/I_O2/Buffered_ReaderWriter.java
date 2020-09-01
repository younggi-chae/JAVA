package ex.I_O2;
import java.io.*;

public class Buffered_ReaderWriter {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Buffered_ReaderWriter.java");
			BufferedReader br = new BufferedReader(fr);  // ���۸� ���� ������� ȿ���� ���δ�.
			
			String line ="";
			for(int i = 1; (line = br.readLine()) !=null; i++) { // readLine�� ���� ������ ���δ����� �д´�.
				if(line.indexOf(";") != -1)  // ; �ڸ� �����ϰ� �ִ��� Ȯ��
					System.out.println(i + " ; " + line);
			}
			
			br.close();
		}catch(IOException e) {}

	}

}

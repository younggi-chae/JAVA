package ex.I_O;

import java.io.*;
import java.util.*;

public class ByteArray_IO_StreamEx1 {
       //���ڱ�� ��Ʈ��  CharArrayReader, CharArrayWriter
	public static void main(String[] args) {
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] outSrc = null;

		byte[] temp = new byte[4];

		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		try {
			while (input.available() > 0) {   //available = �о�� �� �ִ� �������� ũ�� ��ȯ
				int len = input.read(temp);   // �о� �� �������� ������ ��ȯ
				output.write(temp, 0, len);   // �о� �� ��ŭ�� write�Ѵ�. 
				// System.out.println("temp : " + Arrays.toString(temp));

				outSrc = output.toByteArray();  // output�� byte �迭�� ��� outSrc�� ����

			}
		} catch (IOException e) {
		}

		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}

}

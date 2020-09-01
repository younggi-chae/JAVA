package ex.stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt") };
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map() ���� Stream<File>�� Stream<String>���� ��ȯ
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);
		
		fileStream = Stream.of(fileArr);  // ��Ʈ�� �����
		
		fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1).map(s -> s.substring(s.indexOf('.')+1))
		          .map(String::toUpperCase).distinct().forEach(System.out::print);
		
		System.out.println();
			

	}

}

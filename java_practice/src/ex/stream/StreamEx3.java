package ex.stream;
//package stream;
//
//import java.util.Comparator;
//import java.util.IntSummaryStatistics;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class StreamEx3 {
//
//	public static void main(String[] args) {
//		Student[] stuArr = {new Student("���ڹ�", 3, 300), new Student("���ڹ�", 1, 200),
//				new Student("���ڹ�", 2, 100), new Student("���ڹ�", 2, 150), new Student("���ڹ�", 1, 200),
//				new Student("���ڹ�", 3, 290), new Student("���ڹ�", 3, 180) };
//
//		Stream<Student> stuStream = Stream.of(stuArr);
//		stuStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
//				.forEach(System.out::println);
//		
//		stuStream = Stream.of(stuArr);  //��Ʈ�� �����
//		IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);
//		
//		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
//		System.out.println("count = " + stat.getCount());
//		System.out.println("sum = " + stat.getSum());
//		System.out.printf("average=%.2f%n", stat.getAverage());
//		System.out.println("min = " + stat.getMin());
//		System.out.println("max = " + stat.getMax());
//	}
//
//}
//
//class Student2 implements Comparable<Student> {
//	String name;
//	int ban;
//	int totalScore;
//
//	Student2(String name, int ban, int totalScore) {
//		this.name = name;
//		this.ban = ban;
//		this.totalScore = totalScore;
//	}
//
//	public String toString() {
//		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
//	}
//
//	String getName() {
//		return name;
//	}
//
//	int getBan() {
//		return ban;
//	}
//
//	int getTotalScore() {
//		return totalScore;
//	}
//
//	public int compareTo(Student s) {
//		return s.totalScore - this.totalScore;
//	}
//
//}

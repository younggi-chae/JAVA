package lambda;

import java.util.function.*;

//�ڹ�8 API���� �����ϴ� ��ǥ���� �Լ��� �������̽�
public class Lambda009 {

	public static void main(String[] args) {
		Runnable run = () -> System.out.println("hello");   //������ �� �ִ� �������̽�  (�߻� �޼��� void run())
		Supplier<Integer> sup = () -> 3*3;     // ������ �� �ִ� �������̽�   (�߻�޼��� T get())
		Consumer<Integer> con = num -> System.out.println(num); //�Һ��� �� �ִ� �������̽�  (�߻�޼��� void accept(T t))
		Function<Integer, String> fun = num -> "input : " + num; //�Է��� �޾Ƽ� ����� �� �ִ� �������̽� (�߻�޼��� R apply(T t))
		Predicate<Integer> pre = num -> num > 10;  //�Է��� �޾� ��/������ ������ �� �ִ� �������̽�  (�߻�޼��� Boolean test(T t))
		UnaryOperator<Integer> uOp = num -> num * num; //����(Unary) ������ �� �ִ� �������̽�  (�߻�޼��� T apply(T t))
		
		BiConsumer<String, Integer> bCon = (str, num) -> System.out.println(str+num); //���� �Һ��� �������̽� (�߻�޼��� void accept(T t, U u))
		BiFunction<Integer, Integer, String> bFun = (num1, num2) -> "add result : " + (num1 + num2); //���� �Լ� �������̽� (�߻�޼��� R apply(T t, U u))
		BiPredicate<Integer, Integer> bPre = (num1, num2) -> num1 > num2; //���� ���� �������̽� (�߻�޼��� Boolean test(T t, U u)
		BinaryOperator<Integer> bOp = (num1, num2) -> num1 - num2; //���� ���� �������̽� (�߻�޼��� T apply(T t, T t))
 	}

}

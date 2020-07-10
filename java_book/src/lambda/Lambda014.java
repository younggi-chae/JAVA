package lambda;

//�������̽��� ����Ʈ �޼���� ���� �޼���
public class Lambda014 {

	public static void main(String[] args) {
		System.out.format("���� ��� : %d\n", MyFunctionalInterface2.constant);

		MyFunctionalInterface2.concreteStaticMethod();

		MyFunctionalInterface2 mfi2 = () -> System.out.println("�߻� �ν��Ͻ�  �޼���");

		mfi2.abstractInstanceMethod();
		mfi2.concreteInstanceMethod();

	}

}

@FunctionalInterface
interface MyFunctionalInterface2 {
	// ���� ���
	public static final int constant = 1;

	// �߻� �ν��Ͻ� �޼���
	public abstract void abstractInstanceMethod();

	// JAVA 8 ����Ʈ �޼��� - ��ü �ν��Ͻ� �޼���
	public default void concreteInstanceMethod() {
		System.out.println("����Ʈ �޼��� - ��ü �ν��Ͻ� �޼���");
	}

	// JAVA 8 ���� �޼��� - ��ü ���� �޼���
	public static void concreteStaticMethod() {
		System.out.println("���� �޼��� - ��ü ���� �޼���");
	}
}
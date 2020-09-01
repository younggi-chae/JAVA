package ex.object2;

class MyMath{
	long a, b;
	
	//�ν��Ͻ����� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	long add() { return a+b;} //a, b�� �ν��Ͻ�����
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	long divide() {return a/b;}
	
	//�ν��Ͻ������� ������� �Ű����������� �۾��� �����ϴ�.
	static long add(long a, long b)  {return a+b;} // a, b�� ��������
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static long divide(long a, long b) {return a/b;}
}

public class object2Ex5 {

	public static void main(String[] args) {
		//Ŭ�����޼��� ȣ��. �ν��Ͻ� �������� ȣ�� ����
		System.out.println(MyMath.add(200L,100L));
		System.out.println(MyMath.subtract(200L,100L));
		System.out.println(MyMath.multiply(200L,100L));
		System.out.println(MyMath.divide(200L,100L));
        
		MyMath mm = new MyMath();
		mm.a = 200L;
		mm.b = 100L;
		//�ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ����
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}

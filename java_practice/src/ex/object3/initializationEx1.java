package ex.object3;

class Init {
	static {
		System.out.println("static{ }");   //Ŭ���� �ʱ�ȭ ��
	}                                      //���� ���� ����Ǿ� ȭ�鿡 ���
	{
		System.out.println("{ }");  //�ν��Ͻ� �ʱ�ȭ ��
	}                             
        //�ν��Ͻ� �ʱ�ȭ ���� ���� ����ǰ� �����ڰ� ����ȴ�.
	public Init() {
		System.out.println("������");
	}
}
    
public class initializationEx1 {

	public static void main(String[] args) {
		System.out.println("Init i = new Init();");
		Init i = new Init();

		System.out.println("Init i2 = new Init();");
		Init i2 = new Init();
	}

}

     //Ŭ���� �ʱ�ȭ ���� ó�� �޸𸮿� �ε��� �� �ѹ��� ���������, �ν��Ͻ� �ʱ�ȭ ���� �ν��Ͻ��� ������ ������ ����ȴ�.

package ex.operator;

public class operatorEx6 {

	public static void main(String[] args) {
		//�� ������
		System.out.println(10 == 10.0f);
		System.out.println('0' == 0); //���ڿ� ���ڴ� �ٸ���. false
        System.out.println('A' == 65); //'A'�� �����ڵ� 10������ 65, true
        System.out.println('A' > 'B');
        System.out.println('A'+1 == 'B'); //'B'�� �����ڵ� 10������ 66�̴�.
        
        String str1 = "abc";
        String str2 = new String("abc");
        
        System.out.println("abc" == "abc"); //true
        System.out.println(str1 == "abc"); //true
        System.out.println(str2 == "abc"); //false, str2�� ��ü
        System.out.println(str1 == str2); //false ���� �ٸ� ��ü ��
        System.out.println(str1.equals("abc")); //true 
        System.out.println(str2.equals("abc")); //true
        System.out.println(str2.equals("ABC")); //false, ��ҹ��� ����o
        System.out.println(str2.equalsIgnoreCase("ABC")); //true, ��ҹ��� ���� x
        //equals�� ��ü�� �޶� ������ ���ٸ� true�� ��ȯ�Ѵ�.
	}

}

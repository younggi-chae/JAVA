package java_exam.java1.Variable;

public class Casting {
    
	public static void main(String[] args) {
    	 
		double a= 1.1;
		double b = 1;   //�սǾ���
	    double b2 = (double) 1;
	    
		System.out.println(b);
		
	//	int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;  //0.1 �ս�, ����� ����ȯ
		
		System.out.println(e);
		
		// 1 to String 
        String f = Integer.toString(1);
        System.out.println(f.getClass());
		
    }
}

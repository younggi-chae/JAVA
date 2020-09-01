package ex.enum1;

enum Direction {EAST, SOUTH, WEST, NORTH}

public class EnumEx1 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		  
		
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		System.out.println("d1 == d2 ? " + (d1 == d2));  // == �����ڷ� �� ����
		System.out.println("d1 == d3 ? " + (d1 == d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		//System.out.println("d2 > d3 ? " + (d1 > d3));   //���� >, < ������ ���Ұ�
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3)); // 0 �̸� ����
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2)); // ������ ��������ũ��
		
		switch(d1) {    //enum�� ���� switch���� Ȱ�밡��
		       case EAST : 
		    	   System.out.println("The direction is EAST.");
		    	   break;
		       case SOUTH : 
		    	   System.out.println("The direction is SOUTH.");
		    	   break;
		       case WEST : 
		    	   System.out.println("The direction is WEST.");
		    	   break;
		       case NORTH : 
		    	   System.out.println("The direction is NORTH.");
		    	   break;
		       default : 
		    	   System.out.println("Invalid direction.");
		    	   break;
		}
		
		Direction[] dArr = Direction.values(); // values()�� �������� ��� ����� �迭�� ��� ��ȯ
		
		for(Direction d : dArr)
			System.out.println(d.name() + " = " + d.ordinal()); // ordinal�� ���ǵ� ������ ��ȯ(0���ͽ���)
	}                                                           // �������.. ����� ���� �ұ�Ģ�� ��� ������ �뵵
  
}

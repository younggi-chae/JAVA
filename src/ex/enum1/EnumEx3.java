package ex.enum1;

enum Transportation {
	BUS(100)      { int fare(int distance) { return distance * BASIC_FARE;}},
	TRAIN(150)    { int fare(int distance) { return distance * BASIC_FARE;}},
	SHIP(100)     { int fare(int distance) { return distance * BASIC_FARE;}},
	AIRPORT(300)  { int fare(int distance) { return distance * BASIC_FARE;}};


   protected final int BASIC_FARE; // protected�� �ؾ� �� ������� ���� ����
   
   Transportation(int basicFare) {
	   BASIC_FARE = basicFare;
   }
   public int getBasicFare()  { return BASIC_FARE ;}
   
   abstract int fare(int distance);  // �Ÿ��� ���� ��� ���, ���Ż���� �߻�޼��带 �����ؾ߸� ��
}  
               
public class EnumEx3 {

	public static void main(String[] args) {
		
		System.out.println("bus fare = " + Transportation.BUS.fare(100));
		System.out.println("train fare = " + Transportation.TRAIN.fare(100));
		System.out.println("ship fare = " + Transportation.SHIP.fare(100));
		System.out.println("airport fare = " + Transportation.AIRPORT.fare(100));

	}

}

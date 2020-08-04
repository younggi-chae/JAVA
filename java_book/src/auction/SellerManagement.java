package auction;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SellerManagement extends Account implements Join {

   static Scanner sc = new Scanner(System.in);
   Auction a= new Auction();

   LinkedList<Seller> sellerList = new LinkedList<Seller>();
   static LinkedList<Goods> goodsList = new LinkedList<Goods>();

   Seller s;
   int idx;// ���� �α����� ��
   int count=0;
   
   Auction auction = new Auction();

   @Override
   public Seller join2() {
	  

      System.out.print("�̸�:");
      String name = sc.nextLine();
      System.out.print("��ȭ��ȣ:");
      String phoneNo = sc.nextLine();
      System.out.print("�ּ�:");
      String address = sc.nextLine();
      System.out.print("id:");
      String id = sc.nextLine();
      System.out.print("��й�ȣ:");
      String pwd = sc.nextLine();
      

      sellerList.add(new Seller(name, phoneNo, id, pwd, address));
      System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
	
      return sellerList.get(count++);

   }

   public Seller login() {
      String id = "";
      String pwd = "";

      while(true) {
    	  for (int i = 0; i<sellerList.size();i++) {
    		  System.out.print("id:");
              id = sc.nextLine();
              System.out.print("��й�ȣ:");
              pwd = sc.nextLine();
        	  if((id.equals(sellerList.get(i).getId())) && pwd.equals(sellerList.get(i).getPwd())){
        		  
                  idx = i;
                  return sellerList.get(idx);
      }// System.out.println(sellerList.get(idx).getName() + "�� �ݰ����ϴ�.");
 	 
    	  }

      }

   }
    

   

   public SellerManagement() {
   }

   public LinkedList<Goods> addItem() {

      System.out.print("��ǰ �̸�: ");
      String item_name = sc.nextLine();

      System.out.print("��ǰ�� ���Ѱ�");
      int min = sc.nextInt();
      String str = sc.nextLine();
      System.out.print("��ǰ�� ���Ѱ�");
      int max = sc.nextInt();
      String str2 = sc.nextLine();

      goodsList.add(new Goods(item_name, min, max));

      System.out.println(" ��ǰ�� ��ϵǾ����ϴ�.");
      return goodsList;

   }

   public void printItem() {
      Iterator<Goods> iter = goodsList.iterator(); 
      
      while(iter.hasNext()) {
         iter.next().show();
      }

   }

   public void payCheck() {
      // ������ ������ �˷��ִ� �޼���
	   
	   
	   
	   int max=auction.max;
	   String address=auction.address;
	   
	   

      // successful_price
      System.out.println(max+"���� �����Ǿ����ϴ�.");
      System.out.println("������ �ּ�: "+address);
      
     System.out.print("���¹�ȣ�� �Է��ϼ���:");
      
      
      //System.out.println("�����ڿ� ä���� �Ͻðڽ��ϱ�?");
      

   }
   
 

@Override
public void join(List<Customer> cust) {
	// TODO Auto-generated method stub
	
}

@Override
public Customer join() {
	// TODO Auto-generated method stub
	return null;
}
   

}
package miniProject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SellerManagement extends Account implements Join {

   static Scanner sc = new Scanner(System.in);
   
   Customer customer;
   LinkedList<Seller> sellerList = new LinkedList<Seller>();
   public static LinkedList<Goods> goodsList = new LinkedList<Goods>();

   Seller s;
   int idx;// ?��?�� 로그?��?�� 고객

   @Override
   public void join() {
	   System.out.println("*****ȸ������.*****");
      System.out.print("�̸�:");
      String name = sc.nextLine();
      System.out.print("��ȭ��ȣ:");
      String phoneNo = sc.nextLine();
      System.out.print("�ּ� :");
      String address = sc.nextLine();
      System.out.print("id:");
      String id = sc.nextLine();
      System.out.print("��й�ȣ:");
      String pwd = sc.nextLine();

      sellerList.add(new Seller(name, phoneNo, id, pwd, address));
      System.out.println("*****ȸ�������� �Ϸ�Ǿ����ϴ�..*****");

   }

   public LinkedList<Seller> login() {
      String id = "";
      String pwd = "";

      for (int i = 0; i < sellerList.size(); i++) {
         while (!(id.equals(sellerList.get(i).getId()) && pwd.equals(sellerList.get(i).getPwd()))) {
            System.out.print("id:");
            id = sc.nextLine();
            System.out.print("��й�ȣ :");
            pwd = sc.nextLine();
            if (!(id.equals(sellerList.get(i).getId()) && pwd.equals(sellerList.get(i).getPwd()))) {
               System.out.println("*****�߸��Է��Ͽ����ϴ�..*****");
            }
         }
         System.out.println("*****" + sellerList.get(i).getName() + "�� �ݰ����ϴ�..*****");
         idx = i;

      }
      return sellerList;

   }

   public SellerManagement() {
   }

   public LinkedList<Goods> addItem() {

      System.out.print("��ǰ�̸� : ");
      String item_name = sc.nextLine();

      System.out.print("��ǰ���Ѱ� : ");
      int min = sc.nextInt();
      String str = sc.nextLine();
      System.out.print("��ǰ���Ѱ� : ");
      int max = sc.nextInt();
      String str2 = sc.nextLine();

      goodsList.add(new Goods(item_name, min, max));

      System.out.println("*****��ǰ�� ��ϵǾ����ϴ�.*****");
      return goodsList;

   }

   public void printItem() {
      Iterator<Goods> iter = goodsList.iterator(); 
      
      while(iter.hasNext()) {
         iter.next().show();
      }

   }

   public void payCheck() {
      // ?��찰된 �?격을 ?��?��주는 메서?��
	   System.out.println("?��찰된 금액?? " + customer.getBid() + "?��?��?��.");
	   System.out.println("계좌번호�? ?��?��?��주세?��.");
	   String accountNo = sc.nextLine();
	   Account account = new Account();
	   // successful_price
      System.out.println();

   }
   
   public void logOut() {
	   sellerList = null;
	   System.out.println("*****?��매자 로그?��?��*****");
   }
   

}
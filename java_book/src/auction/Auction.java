package auction;

import java.util.LinkedList;
import java.util.Scanner;

public class Auction {
	
	static Scanner sc = new Scanner(System.in);
	 private int bid;
	   int count;
	   int idx;
	   int cnt;
	   int arr[]= new int[10];
	   static int max;
	   Goods item;
	   int price;
	   static String address;
	   int key;
	
	public Auction() {}
	
	public void purchase() {
		
		
		  System.out.println("�����Ͻ� ��ǰ�� ������ �ּ���.");
		  printGoods();
	      System.out.println("�Է� : ");
	      idx = sc.nextInt();
	      
	      item = SellerManagement.goodsList.get(idx - 1);

	      System.out.println("�����Ͻ� �ݾ��� �Է��ϼ���.");
	      System.out.println("�Է� : ");
	      bid = sc.nextInt();
	      arr[cnt++]=bid;
	      //c.setBid(bid);
	      System.out.println(bid + "���� �����Ǿ����ϴ�.");
	    
	      
	      if(cnt==2) {
	    	  price=compare();
	    	  System.out.println("�������� "+price+"�Դϴ�.");
	    	  
	    	  if(bid<price) {
	    		  System.out.println("������ �����ϼ̽��ϴ�.");
	    		  return;
	    	  }
	    	  else {
	    		 System.out.println("���� ����");
	    		 System.out.print("�����Ͻðڽ��ϱ�? 1:�� 2:�ƴϿ�>>");
	   		  int input = sc.nextInt();
	   		  switch (input) {
	   		case 1:
	   			pay(); 
	   			break;

	   		case 2:
	   			break;
	   		}
	    		 
	    	  }
	      }
	
		
		
	}
	
	
	public void buy() {
		 System.out.print("�����Ͻðڽ��ϱ�? 1:�� 2:�ƴϿ�");
		  int input = sc.nextInt();
		  switch (input) {
		case 1:
			pay(); 
			break;

		case 2:
			break;
		}
		
	}
	
	
	
	
	
	public void pay() {
		System.out.print("ī���ȣ�� �Է��ϼ���: ");
		String cardNo=sc.nextLine();
		
		System.out.print("��й�ȣ�� �Է��ϼ���");
		String pwd=sc.nextLine();
		System.out.println("�����Ǿ����ϴ�.");
		
		System.out.print("�ּҸ� �Է��ϼ���");
		address=sc.nextLine();
	}
	
	 public void printGoods() {	
	      for (int i = 0; i < SellerManagement.goodsList.size(); i++) {
	         System.out.println(i + 1 + "��° ��ǰ ����");     
	         System.out.println(SellerManagement.goodsList.get(i).toString());
	      }
	   }
	 
	
	public int compare() {
		for(int i=0;i<cnt;i++) {
			max=arr[0];
			if(arr[i]>max) {
				max=arr[i];
				key=i;
			}
		}
		return max;
	}
	
	public void listAllItem() {
		
		
	}

}

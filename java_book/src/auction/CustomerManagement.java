package auction;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement extends Account implements Join {

	   List<Customer> cust = new LinkedList<Customer>();
	   
	   int arr[]= new int[10];
	   
	   Scanner sc = new Scanner(System.in);
	   Customer c;
	   Goods g;
	   private int bid;
	   int count;
	   int idx;
	   int cnt;

	   public void name() {
		for(int i=0;i<cust.size();i++) {
			c.setId(cust.get(i).getId());
		}
	}
	   
	   @Override
	   public Customer join() {
	      System.out.println("************ȸ������*************");
	      System.out.println("���̵� �Է����ּ���.");
	      System.out.print("�Է� :");
	      String id = sc.nextLine();
	      System.out.println("��й�ȣ�� �Է����ּ���.");
	      System.out.println("�Է� : ");
	      String password = sc.nextLine();
	      System.out.println("�̸��� �Է����ּ���.");
	      System.out.print("�Է� : ");
	      String name = sc.nextLine();
	      System.out.println("��ȭ��ȣ�� �Է����ּ���.");
	      System.out.println("�Է� : ");
	      String phoneNo = sc.nextLine();
	      System.out.println("�ּҸ� �Է����ּ���.");
	      System.out.println("�Է� : ");
	      String address = sc.nextLine();

	      cust.add(new Customer(id, password, name, phoneNo, address, bid));
	      System.out.println(name + "�� ȸ�������� �Ϸ�Ǿ����ϴ�.");
	      
	      return cust.get(count++);
	   }

	   public Customer logIn() {


		   
		   
		   String id = "";
		      String pwd = "";

		      while(true) {
		    	  for (int i = 0; i<cust.size();i++) {
		    		  System.out.print("id:");
		              id = sc.nextLine();
		              System.out.print("��й�ȣ:");
		              pwd = sc.nextLine();
		        	  if((id.equals(cust.get(i).getId())) && pwd.equals(cust.get(i).getPassword())){
		        		  
		                  idx = i;
		                  return cust.get(idx);
		      }// System.out.println(sellerList.get(idx).getName() + "�� �ݰ����ϴ�.");
		 	 
		    	  }
		    	
		    	 

		      }
		   
	      
	   }
	   
	   

	   
	   
	   
	   
	   


	@Override
	public void join(List<Customer> cust) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller join2() {
		// TODO Auto-generated method stub
		return null;
	}

	}
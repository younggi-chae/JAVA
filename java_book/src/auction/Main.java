package auction;

import java.util.LinkedList;
import java.util.Scanner;

import hotel.Customer;

public class Main {

	public static void main(String[] args) {
		SellerManagement sm = new SellerManagement();
		
		CustomerManagement cm = new CustomerManagement();
		LinkedList<Seller> loginInfo = new LinkedList<Seller>();
		LinkedList<Customer> loginInfo2 = new LinkedList<Customer>();
		Auction auction = new Auction();

		LinkedList login = new LinkedList();
		LinkedList<Goods> itemList = new LinkedList<Goods>();
	
		Scanner sc = new Scanner(System.in);
		Goods g = new Goods();
		
		int idx;
		int a=-1;
		int min=0;

		
		while (true) {
			System.out.println("1:ȸ������   2:�α���");
			String input=sc.nextLine();
			switch (input) {
			case "1":
				System.out.println("1.�Ǹ��ڵ�� 2.�����ڵ��");
				String login1 = sc.next();
				switch (login1) {
				case "1":
					loginInfo.add(sm.join2());
					//System.out.println(loginInfo.toString());
					break;

				case "2":
					cm.join();
					break;
				}
				break;

			case "2"://�α���
				System.out.println("1.�Ǹ��� 2.������");
                String input2 = sc.nextLine();
                switch (input2) {
                case "1"://�Ǹ��ڷα���
                  	login.add(sm.login());
       			//	System.out.println(login.toString());
       		while(a!=1) {
                    System.out.print("1.��ǰ��� 2.��ǰȮ�� 3.����Ȯ�� 4.�α׾ƿ�");
                    String input3 = sc.nextLine();
                    switch (input3) {
                    case "1"://��ǰ���
                    	
                    
                       itemList=sm.addItem();
                      // System.out.println(itemList.toString());
                       break;
                    case "2"://��ǰȮ��
                       sm.printItem();
                       break;
                       
                       
                    case "3"://����Ȯ��
                    	
                    	
                       sm.payCheck();
                       
                
                       break;
                    case "4":
                    	//itemList.clear();
                      	System.out.println("�α׾ƿ�");
                      	login.clear();
                      	a=1;
                      	break;
                     
                    }
			}continue;
                case "2" ://������ �α���
                	login.add(cm.logIn());
                	//System.out.println(login.toString());
                  	a=0;
                	while(a!=2) {
              		
       					
	                        System.out.print("1.��ǰ��ȸ 2.���� 3.�α׾ƿ�");
	                        String input4 = sc.nextLine();
	                        switch (input4) {
	                        case "1"://��ǰ��ȸ
	                        	//cm.printGoods();
	                        	
	                        	System.out.println(itemList.toString());
	                           break;
	                        case "2"://����
	                        
	                        	auction.purchase();
	  
	                        	
	                        	
	                        	
	                            break;
	                            
	                        case "3"://�α׾ƿ�
	                        	a=2;
	                        	login.clear();
	                        	break;
	                    
	                        }
                    
                	}continue;
                	
                }
			}
		}
	}
}
		


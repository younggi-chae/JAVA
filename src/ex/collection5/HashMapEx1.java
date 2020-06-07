package ex.collection5;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");  // �Ʒ� KEY���� �ߺ��ȴ�. key�� �ߺ�x
		map.put("asdf", "1234");  // ���߿� �� value������ �����.

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("id�� passward�� �Է����ּ���.");
			System.out.print("id : ");
			String id = sc.nextLine();

			System.out.println("passward : ");
			String passward = sc.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				if (!map.get(id).equals(passward)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		}

	}

}

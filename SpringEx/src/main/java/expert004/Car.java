package expert004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("tire1")   // id�� ���� ������̼�, Autowired�� ����
	Tire tire;
	
		
	public String getTireBrand() {
		return "������ Ÿ�̾� : " + tire.getBrand();
	}
		
}

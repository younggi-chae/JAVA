package expert005;

import javax.annotation.Resource;

public class Car {

	@Resource(name="tire")
	Tire tire;

	public String getTireBrand() {
		return "������ Ÿ�̾� : " + tire.getBrand();
	}

}

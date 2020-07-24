package templateCallbackPattern;

public class Soldier {
	void runContext(String weaponSound) {
		System.out.println("���� ����");
		executeWeapon(weaponSound).runStrategy();
		System.out.println("���� ����");

	}
	
	private Strategy executeWeapon(final String weaponSound) {
		return new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println(weaponSound);
			}
		};
	}
}

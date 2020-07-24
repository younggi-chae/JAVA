package strategyPattern;

public class Client {

	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();

		// ���� �������� �����ؼ� ������ �����ϰ� �Ѵ�.
		strategy = new StrategyGun();
		rambo.runContext(strategy);

		System.out.println();

		// ���� �������� �����ؼ� ������ �����ϰ� �Ѵ�.
		strategy = new StrategySword();
		rambo.runContext(strategy);

		System.out.println();

		// ���� �������� �����ؼ� ������ �����ϰ� �Ѵ�.
		strategy = new StrategyBow();
		rambo.runContext(strategy);

	}

}

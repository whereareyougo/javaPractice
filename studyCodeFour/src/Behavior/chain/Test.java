package Behavior.chain;

public class Test {

	public static void main(String[] args) {
		OrdinaryEmployee employee = new OrdinaryEmployee();
		employee.setLeaveDay(10);
		employee.setName("����");
		employee.setReason("������ô����Ҫȥ����");
		PerChain perChain = new PerChain();
		perChain.dealLeaveDay(employee);
		
	}

}

package Behavior.chain;

public class Test {

	public static void main(String[] args) {
		OrdinaryEmployee employee = new OrdinaryEmployee();
		employee.setLeaveDay(10);
		employee.setName("张三");
		employee.setReason("世界这么大，我要去走走");
		PerChain perChain = new PerChain();
		perChain.dealLeaveDay(employee);
		
	}

}

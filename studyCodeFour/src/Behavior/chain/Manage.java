package Behavior.chain;

public class Manage implements PersonAction {
	private PersonAction personAction;
	
	@Override
	public boolean dealLeave(OrdinaryEmployee ordinaryEmployee) {
		if (ordinaryEmployee.getLeaveDay() > 7) {
			System.out.println("==经理不能批准7天的以上假期，交给老总处理");
			personAction.dealLeave(ordinaryEmployee);
		}else{
			System.out.println("==经理同意"+ordinaryEmployee.getName()+ordinaryEmployee.getLeaveDay()+","+ordinaryEmployee.getReason());
		}
		return false;
	}

	@Override
	public void setNextLeader(PersonAction personAction) {
		this.personAction = personAction;
	}

}

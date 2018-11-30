package Behavior.chain;

/**
 * 组长
 * @author hello
 *
 */
public class GroupLeader implements PersonAction {
	private PersonAction personAction;
	public GroupLeader() {
	}
	@Override
	public boolean dealLeave(OrdinaryEmployee ordinaryEmployee) {
		if (ordinaryEmployee.getLeaveDay() > 5) {
			System.out.println("==组长不能批准5天的假期，交给经理处理");
			personAction.dealLeave(ordinaryEmployee);
		}else{
			System.out.println("==组长同意"+ordinaryEmployee.getName()+ordinaryEmployee.getLeaveDay()+","+ordinaryEmployee.getReason());
		}
		return false;
	}

	@Override
	public void setNextLeader(PersonAction personAction) {
		this.personAction = personAction;
	}

}

package Behavior.chain;

public class GeneralManage implements PersonAction {

	@Override
	public boolean dealLeave(OrdinaryEmployee ordinaryEmployee) {
		if (ordinaryEmployee.getLeaveDay() > 10) {
			System.out.println("董事不批准"+ordinaryEmployee.getName()+"这么长的假期，最多5天");
		}else{
			System.out.println("总经理同意"+ordinaryEmployee.getName()+ordinaryEmployee.getLeaveDay()+","+ordinaryEmployee.getReason());
		}
		return false;
	}

	@Override
	public void setNextLeader(PersonAction personAction) {
		// TODO Auto-generated method stub

	}

}

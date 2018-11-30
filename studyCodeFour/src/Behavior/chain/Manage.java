package Behavior.chain;

public class Manage implements PersonAction {
	private PersonAction personAction;
	
	@Override
	public boolean dealLeave(OrdinaryEmployee ordinaryEmployee) {
		if (ordinaryEmployee.getLeaveDay() > 7) {
			System.out.println("==��������׼7������ϼ��ڣ��������ܴ���");
			personAction.dealLeave(ordinaryEmployee);
		}else{
			System.out.println("==����ͬ��"+ordinaryEmployee.getName()+ordinaryEmployee.getLeaveDay()+","+ordinaryEmployee.getReason());
		}
		return false;
	}

	@Override
	public void setNextLeader(PersonAction personAction) {
		this.personAction = personAction;
	}

}

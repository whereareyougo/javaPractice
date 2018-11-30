package Behavior.chain;

/**
 * �鳤
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
			System.out.println("==�鳤������׼5��ļ��ڣ�����������");
			personAction.dealLeave(ordinaryEmployee);
		}else{
			System.out.println("==�鳤ͬ��"+ordinaryEmployee.getName()+ordinaryEmployee.getLeaveDay()+","+ordinaryEmployee.getReason());
		}
		return false;
	}

	@Override
	public void setNextLeader(PersonAction personAction) {
		this.personAction = personAction;
	}

}

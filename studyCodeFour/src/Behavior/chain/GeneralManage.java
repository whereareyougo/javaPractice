package Behavior.chain;

public class GeneralManage implements PersonAction {

	@Override
	public boolean dealLeave(OrdinaryEmployee ordinaryEmployee) {
		if (ordinaryEmployee.getLeaveDay() > 10) {
			System.out.println("���²���׼"+ordinaryEmployee.getName()+"��ô���ļ��ڣ����5��");
		}else{
			System.out.println("�ܾ���ͬ��"+ordinaryEmployee.getName()+ordinaryEmployee.getLeaveDay()+","+ordinaryEmployee.getReason());
		}
		return false;
	}

	@Override
	public void setNextLeader(PersonAction personAction) {
		// TODO Auto-generated method stub

	}

}

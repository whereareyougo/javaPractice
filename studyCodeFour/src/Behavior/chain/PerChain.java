package Behavior.chain;
/**
 * ����ٿ��ܾ������˽��й���
 * @author hello
 *
 */
public class PerChain {
	private PersonAction groupLeader,manage,generalManage;
	public PerChain() {
		groupLeader = new GroupLeader();
		manage = new Manage();
		generalManage = new GeneralManage();
		groupLeader.setNextLeader(manage);
		manage.setNextLeader(generalManage);
	}
	
	public void dealLeaveDay(OrdinaryEmployee employee){
		groupLeader.dealLeave(employee);
	}
}

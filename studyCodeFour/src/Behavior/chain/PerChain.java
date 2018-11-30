package Behavior.chain;
/**
 * 将请假可能经过的人进行关联
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

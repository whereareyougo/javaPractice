package Behavior.chain;
/**
 * ��װ��˾��Ա��Ϊ
 * @author hello
 *
 */
public interface PersonAction {
	public boolean dealLeave(OrdinaryEmployee ordinaryEmployee);
	public void setNextLeader(PersonAction personAction);
}

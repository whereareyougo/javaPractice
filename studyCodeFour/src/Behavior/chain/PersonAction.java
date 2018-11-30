package Behavior.chain;
/**
 * 封装公司人员行为
 * @author hello
 *
 */
public interface PersonAction {
	public boolean dealLeave(OrdinaryEmployee ordinaryEmployee);
	public void setNextLeader(PersonAction personAction);
}

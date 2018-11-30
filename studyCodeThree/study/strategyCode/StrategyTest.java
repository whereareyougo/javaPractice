package strategyCode;

public class StrategyTest {

	public static void main(String[] args) {
		//实例化上下文
		StrategyContext strategyContext = new StrategyContext();
		//设置策略
		strategyContext.setStrategy(new StrategyOne());
		//实例化两人
		Person zhang = new Person();
		Person li = new Person();
		zhang.setName("张三");
		li.setName("李四");
		double[] z = {0,1,2,3,4,5};//张三的分数
		double[] l = {3.5,2,4,5,2};//李四的分数
		zhang.setScore(strategyContext.getPersonScore(z));
		li.setScore(strategyContext.getPersonScore(l));
		System.out.println("这是算的总和=="+zhang.getName()+":"+zhang.getScore()+","+li.getName()+":"+li.getScore());
		strategyContext.setStrategy(new StrategyTwo());
		zhang.setScore(strategyContext.getPersonScore(z));
		li.setScore(strategyContext.getPersonScore(l));
		System.out.println("这是算的平均=="+zhang.getName()+":"+zhang.getScore()+","+li.getName()+":"+li.getScore());
	}
	

}

class Person{
	private String name;
	private double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}

package strategyCode;

public class StrategyTest {

	public static void main(String[] args) {
		//ʵ����������
		StrategyContext strategyContext = new StrategyContext();
		//���ò���
		strategyContext.setStrategy(new StrategyOne());
		//ʵ��������
		Person zhang = new Person();
		Person li = new Person();
		zhang.setName("����");
		li.setName("����");
		double[] z = {0,1,2,3,4,5};//�����ķ���
		double[] l = {3.5,2,4,5,2};//���ĵķ���
		zhang.setScore(strategyContext.getPersonScore(z));
		li.setScore(strategyContext.getPersonScore(l));
		System.out.println("��������ܺ�=="+zhang.getName()+":"+zhang.getScore()+","+li.getName()+":"+li.getScore());
		strategyContext.setStrategy(new StrategyTwo());
		zhang.setScore(strategyContext.getPersonScore(z));
		li.setScore(strategyContext.getPersonScore(l));
		System.out.println("�������ƽ��=="+zhang.getName()+":"+zhang.getScore()+","+li.getName()+":"+li.getScore());
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

package strategyCode;
/**
 * 策略上下文
 * @author hello
 *
 */
public class StrategyContext {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double getPersonScore(double[] d){
		if (strategy == null) {
			return 0d;
		}
		return strategy.computerScore(d);
	}
}

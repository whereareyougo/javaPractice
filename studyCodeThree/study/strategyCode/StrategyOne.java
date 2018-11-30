package strategyCode;
/**
 * ÇóºÍ
 * @author hello
 *
 */
public class StrategyOne implements Strategy {
	
	@Override
	public double computerScore(double[] d) {
		double score  = 0d;
		for (int i = 0; i < d.length; i++) {
			score+=d[i];
		}
		return score;
	}

}

package handlerCode.practice;

public class LongFacHandler implements FactorialHandler {
	private FactorialHandler factorialHandler;

	@Override
	public void computingFacHandler(int i) {
		long k = facCom(i);
		if (k == -1) {
			System.out.println("long这里不能计算");
			factorialHandler.computingFacHandler(i);
		}else{
			System.out.println(i+"的阶乘(long)为"+k);
		}
	}

	@Override
	public void setNextFacHandler(FactorialHandler factorialHandler) {
		this.factorialHandler = factorialHandler;
	}
	
	public long facCom(int n){
		long p;
		if (n == 1) {
			return p = n;
		}
		if (n * facCom(n - 1) < 0) {
			return -1;
		}
		p = n * facCom(n - 1);
		return p;
	}

}

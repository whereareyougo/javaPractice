package handlerCode.practice;

public class IntFacHandler implements FactorialHandler {
	
	private FactorialHandler factorialHandler;
	int j  = 0;
	public IntFacHandler() {
		
	}

	@Override
	public void computingFacHandler(int i) {
		int k = facCom(i);
		if (k == -1) {
			System.out.println("int这里不能计算");
			factorialHandler.computingFacHandler(i);
		}else{
			System.out.println(i+"的阶乘(int)为"+k);
		}
	}

	@Override
	public void setNextFacHandler(FactorialHandler factorialHandler) {
		this.factorialHandler = factorialHandler;
	}
	
	public int facCom(int n){
		int p;
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

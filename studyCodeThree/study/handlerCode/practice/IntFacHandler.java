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
			System.out.println("int���ﲻ�ܼ���");
			factorialHandler.computingFacHandler(i);
		}else{
			System.out.println(i+"�Ľ׳�(int)Ϊ"+k);
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

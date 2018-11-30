package handlerCode.practice;

import java.math.BigInteger;

public class BigIntFacHandler implements FactorialHandler {
	private FactorialHandler factorialHandler;
	@Override
	public void computingFacHandler(int i) {
		BigInteger k = facCom(BigInteger.valueOf(i));
		if(k.intValue() == -1){
			System.out.println("���㲻��i�Ľ׳�");
			factorialHandler.computingFacHandler(i);
		}else{
			System.out.println(i+"�Ľ׳�(Big)Ϊ"+k.intValue());
		}
	}

	@Override
	public void setNextFacHandler(FactorialHandler factorialHandler) {
		this.factorialHandler = factorialHandler;
	}
	
	public BigInteger facCom(BigInteger n){
		BigInteger p;
		if (n.intValue() == 1) {
			return p = n;
		}
		p = n.multiply(facCom(BigInteger.valueOf(n.intValue() - 1)));
		if (p.intValue() < 0) {
			return new BigInteger("-1");
		}
		return p;
	}
}

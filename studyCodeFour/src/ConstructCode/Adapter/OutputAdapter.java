package ConstructCode.Adapter;

public class OutputAdapter implements Output5V {
	private Output220V output220V;
	
	public OutputAdapter(Output220V output220V) {
		this.output220V = output220V;
	}
	@Override
	public int output5V() {
		int i = 0;
		if (output220V != null) {
			System.out.println("我是220V的电压");
			i = output220V.output220V()/44;
		}
		System.out.println("适配之后我的电压是"+i);
		return i;
	}

}

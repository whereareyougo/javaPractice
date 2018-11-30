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
			System.out.println("����220V�ĵ�ѹ");
			i = output220V.output220V()/44;
		}
		System.out.println("����֮���ҵĵ�ѹ��"+i);
		return i;
	}

}

package ConstructCode.Adapter;

public class Mobile {
	private int i;
	public Mobile(int i) {
		this.i = i;
	}
	
	public void change(OutputAdapter outputAdapter){
		if (i == 5) {
			System.out.println("我不用转换啦，直接充电");
		}else if (i > 5) {
			outputAdapter.output5V();
		}
	}
}

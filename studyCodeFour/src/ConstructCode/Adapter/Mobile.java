package ConstructCode.Adapter;

public class Mobile {
	private int i;
	public Mobile(int i) {
		this.i = i;
	}
	
	public void change(OutputAdapter outputAdapter){
		if (i == 5) {
			System.out.println("�Ҳ���ת������ֱ�ӳ��");
		}else if (i > 5) {
			outputAdapter.output5V();
		}
	}
}

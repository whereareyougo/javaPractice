package studyCode;

public class PlayStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic t = new TestStatic();
		TestStatic tt = new TestStatic();
	}

}

class TestStatic{
	static {
		System.out.println("我要加载几次呢，你猜一下");
	}
}

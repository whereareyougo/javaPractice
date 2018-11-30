package singleCode;

public class Application {

	public static void main(String[] args) {
		Sun sun = Sun.getInstance();
		System.out.println(sun == Sun.getInstance());

	}

}

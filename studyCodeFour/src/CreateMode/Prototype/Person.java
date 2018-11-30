package CreateMode.Prototype;

public class Person implements ProtoType {
	private String name;
	private String hight;
	private String weight;
	private static int age = 20;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHight() {
		return hight;
	}

	public void setHight(String hight) {
		this.hight = hight;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Person.age = age;
	}

	@Override
	public Person clone() {
		// TODO Auto-generated method stub
		return new Person();
	}

}

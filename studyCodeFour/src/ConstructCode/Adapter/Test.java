package ConstructCode.Adapter;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Mobile mobile = new Mobile(5);
		mobile.change(new OutputAdapter(new Create220V()));
	}

}

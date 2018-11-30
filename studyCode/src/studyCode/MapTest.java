package studyCode;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Map<String,Integer> map = new HashMap<>();
//		for (int i = 0; i < 4; i++) {
//			map.put(i+"", i);
//		}
//	
//			System.out.println((int)(Math.random()*8));
//		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("test.txt")));
		out.write("ssaad".getBytes());
		out.close();
		
	}

}

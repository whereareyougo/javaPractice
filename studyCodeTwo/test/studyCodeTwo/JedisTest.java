package studyCodeTwo;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	private static Jedis jedis;
	static{
		jedis = new Jedis("localhost");
		if (jedis.exists("test")) {
			
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis jedis = new Jedis("localhost");
//		if (jedis.exists("test"))
//			System.out.println("哎呀哎呀，已经有了");
//		jedis.set("test", "这只是一个测试2");
//		System.out.println(jedis.get("test"));
//		jedis.set("test1", "再来一个");
//		jedis.expire("test", 3);
		
		
	}

}

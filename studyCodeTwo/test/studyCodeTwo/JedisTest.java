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
//			System.out.println("��ѽ��ѽ���Ѿ�����");
//		jedis.set("test", "��ֻ��һ������2");
//		System.out.println(jedis.get("test"));
//		jedis.set("test1", "����һ��");
//		jedis.expire("test", 3);
		
		
	}

}

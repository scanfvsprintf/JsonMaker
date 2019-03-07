package jsonMaker;

public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonObject country=new JsonObject();
		country.add("name", "中国");
		
		JsonObject province1=new JsonObject();		
		province1.add("name", "黑龙江");
		JsonObject city1=new JsonObject();
		JsonGroup group1=new JsonGroup();
		group1.add("哈尔滨");
		group1.add("大庆");
		city1.add("city", group1);
		province1.add("citis", city1);
		
		JsonObject province2=new JsonObject();
		province2.add("name", "广东");
		JsonObject city2=new JsonObject();
		JsonGroup group2=new JsonGroup();
		group2.add("广州");
		group2.add("深圳");
		city2.add("city", group2);
		province2.add("citis", city2);
		
		JsonGroup provinces=new JsonGroup();
		provinces.add(province1);
		provinces.add(province2);
		country.add("province", provinces);
		System.out.println(country.Create());

	}

}

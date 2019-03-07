package jsonMaker;

public class JsonString implements JsonItem{
	String text=null;
	JsonString(String t){
		text=t;
	}
	@Override
	public String Create() {
		
		return "\""+text+"\"";
	}
}

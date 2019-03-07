package jsonMaker;
import java.lang.reflect.Array;
import java.util.*;
public class JsonGroup implements JsonItem{
	List<JsonItem> value=null;
	StringBuilder text=null;
	JsonGroup(){
		text=new StringBuilder();
		value=new ArrayList<JsonItem>();
	}
	JsonGroup(List<JsonItem> value){
		text=new StringBuilder();
		this.value=value;
	}
	JsonGroup(JsonItem value[]){
		this();
		for(JsonItem t:value) {
			add(t);
		}
	}
	public void add(JsonItem t) {
		value.add(t);
	}
	public void add(String t) {
		value.add(new JsonString(t));
	}

	@Override
	public String Create() {
		// TODO Auto-generated method stub
		text.append("[");
		for(JsonItem t:value) {
			text.append(t.Create()).append(",");
		}
		if(value.size()>0) {
			text.deleteCharAt(text.length()-1);
		}
		text.append("]");
		return text.toString();
	}

}

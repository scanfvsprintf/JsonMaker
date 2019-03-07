package jsonMaker;

import java.util.*;

public class JsonObject implements JsonItem{
	StringBuilder text=null;
	Map<String,JsonItem> value=null;
	JsonObject(){
		text=new StringBuilder();
		value=new LinkedHashMap<String,JsonItem>();
	}
	public void add(String key,JsonItem value) {
		this.value.put(key, value);
	}
	public void add(String key,String value) {
		this.value.put(key, new JsonString(value));
	}

	@Override
	public String Create() {
		text.append("{\r\n");
		for(String key:value.keySet()) {
			text.append("\""+key+"\""+":").append(value.get(key).Create()).append(",\r\n");
		}
		if(value.keySet().size()>0) {
			text.deleteCharAt(text.length()-3);
		}
		text.append("}");
		return text.toString();
	}

}

# JsonMaker
一个用于生成json文本的java工具类库<br/>
JsonItem为所有用于生成json文本的对象所需实现的接口<br/>
  -create()方法用于返回结果文本。<br/>
JsonObject为实际json对象类。<br/>
  -add(String key,JsonItem value)方法用于为其添加属性<br/>
  -create()方法用于返回结果文本。<br/>
JsonGroup为json对象数组类，<br/>
  -构造方法JsonGroup(JsonItem value[])以其参数为其初始化，其参数也可以传入List<JsonItem> values。什么都不传则构造一个空的json数组。<br/>
  -add(JsonItem value)方法为其添加json对象<br/>
  -create()方法用于返回结果文本。<br/>
JsonString为json纯文本对象，用于作包装。通常不需要用户手动创建此类对象。<br/>
  -在JsonObject和JsonGroup中的add方法可以传入普通的String对象，它会被包装成一个JsonString对象。<br/>
JsonTest为一个测试样例。

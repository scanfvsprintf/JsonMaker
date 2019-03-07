# JsonMaker
一个用于生成json文本的java工具类库
其中,JsonItem为所有用于生成json文本的对象所需实现的接口
  create()方法用于返回结果文本。
JsonObject为实际json对象类。使用
  add(String key,JsonItem value)方法为其添加属性
  create()方法用于返回结果文本。
JsonGroup为json对象数组类，
  JsonGroup(JsonItem value[])为其初始化，其构造方法也可以传入List<JsonItem> values用于初始化。什么都不传则构造一个空的json数组。
  add(JsonItem value)方法为其添加json对象
  create()方法用于返回结果文本。
JsonString为json纯文本对象，用于作包装。通常不需要用户手动创建此类对象。
  在JsonObject和JsonGroup中的add方法可以传入普通的String对象，它会被包装成一个JsonString对象。
JsonTest为一个测试样例。

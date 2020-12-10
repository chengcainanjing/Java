import java.util.*;

class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //添加元素，添加元素，如果出现添加时相同的键，那么后添加的值会覆盖原来的键对应值
        //并put方法会返回被覆盖的值
        System.out.println("put:"+map.put("01", "chengcai1"));
        System.out.println("put:"+map.put("01", "chengcai01"));
        map.put("02", "chengcai2");
        map.put("03", "chengcai3");
        map.put("04", null);

        //先获取map集合的entryset集合，entryset（）
        Set<Map.Entry<String,String>> entryset = map.entrySet();

        //有了set集合，就可以获取其迭代器
        Iterator<Map.Entry<String,String>> it = entryset.iterator();

        while (it.hasNext()) {
            Map.Entry<String,String> me = it.next();

            //
            String key = me.getKey();
            String value = me.getValue();
            System.out.println("key:" + key + ", value:" + value);
        }
    }
}

/*
    Map.Entry 其实Entry也是一个接口，它是Map接口中的一个内部接口
 */
/*
interface Map {
    public static interface Entry {
        public static Object getKey();
        public static Object getValue();
    }
}

class HashMap implements Map {
    class Hahs implements Map.Entry {
        public Object getKey() {}
        public Object getValue() {}
    }
}
 */
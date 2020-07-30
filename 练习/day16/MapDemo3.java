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

        //先获取map集合的所有键的set集合，keyset（）
        Set<String> keyset = map.keySet();

        //有了set集合，就可以获取其迭代器
        Iterator<String> it = keyset.iterator();

        while (it.hasNext()) {
            String key = it.next();

            //有了键可以通过map集合的get方法获取其对应的值
            String value = map.get(key);
            System.out.println("key:" + key + ", value:" + value);
        }




    }
}
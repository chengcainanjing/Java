import java.util.*;

class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //添加元素，添加元素，如果出现添加时相同的键，那么后添加的值会覆盖原来的键对应值
        //并put方法会返回被覆盖的值
        System.out.println("put:"+map.put("01", "chengcai1"));
        System.out.println("put:"+map.put("01", "chengcai01"));
        map.put("02", "chengcai2");
        map.put("03", "chengcai3");
        map.put("04", null);

        //可以通过get方法的返回值来判断一个键是否存在，通过返回null来判断
        System.out.println("get(04):" + map.get("04"));
        //判断map中指定键是否存在
        System.out.println("containsKey:" + map.containsKey("022"));
        //判断map中映射的指定值是否存在
        System.out.println("containsValue:" + map.containsValue("chengcai2"));
        //获取map的键值映射数目
        System.out.println("size:" + map.size());
        //获取map集合
        System.out.println(map);
        //移除map中指定键值对
        System.out.println("remove:" + map.remove("02"));
        //获取map的键值映射数目
        System.out.println("size:" + map.size());
        //获得map指定键映射的值
        System.out.println("get(01):" + map.get("01"));
        //获取map集合
        System.out.println(map);
        //获取map集合中所有的值
        Collection<String> coll = map.values();
        System.out.println(coll);
        System.out.println("values():" + map.values());


    }
}
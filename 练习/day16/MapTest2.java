import java.util.*;

/*
   需求：对学生对象的年龄进行升序排序。

   因为数据是以键值对形式存在的。
   所以要使用可以排序的Map集合。TreeMap
 */
class StuNameComparetor implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int num = s1.getName().compareTo(s2.getName());
        if (num == 0) {
            return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
        }

        return num;
    }
}

class MapTest2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new StuNameComparetor());

        //添加元素，添加元素，如果出现添加时相同的键，那么后添加的值会覆盖原来的键对应值
        //并put方法会返回被覆盖的值
        //Student s01 = new Student("chengcai01",11);
        tm.put(new Student("chengcai01",11), "chengcai1");
        tm.put(new Student("ahengcai02",16), "chengcai2");
        tm.put(new Student("fhengcai03",13), "chengcai3");
        tm.put(new Student("bhengcai04",10), "chengcai3");


        //第二种取出方式:entrySet
        //先获取map集合的entryset集合，entryset（）
        Set<Map.Entry<Student,String>> entryset = tm.entrySet();

        //有了set集合，就可以获取其迭代器
        Iterator<Map.Entry<Student,String>> it1 = entryset.iterator();

        while (it1.hasNext()) {
            Map.Entry<Student,String> me = it1.next();

            Student key = me.getKey();
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
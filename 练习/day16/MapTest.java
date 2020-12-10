import java.util.*;
/*
    学生属性:姓名、年龄
    注意：姓名和年龄相同的视为同一个学生
    保证学生的唯一性

    1、描述学生
    2、定义map容器，将学生作为键，地址作为值，存入
    3、获取map集合中的元素
 */

class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s) {
        int num = new Integer(this.age).compareTo(new Integer(s.age));

        if (num == 0) {
            return this.name.compareTo(s.name);
        }

        return num;
    }

    public int hashCode() {
        return name.hashCode() + age * 37;
    }

    //判断对象是否相等
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            throw new ClassCastException("类型不匹配");
        }


        Student s = (Student) obj;
        System.out.println(this.name + "..euaqls.." + s.name);

        return this.name.equals(s.name) && this.age == s.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAdd() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ":" + age;
    }
}


class MapTest {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<Student, String>();

        //添加元素，添加元素，如果出现添加时相同的键，那么后添加的值会覆盖原来的键对应值
        //并put方法会返回被覆盖的值
        //Student s01 = new Student("chengcai01",11);
        hm.put(new Student("chengcai01",11), "chengcai1");
        hm.put(new Student("chengcai02",13), "chengcai2");
        hm.put(new Student("chengcai03",13), "chengcai3");

        //第一种取出方式
        Set<Student> keyset = hm.keySet();

        Iterator<Student> it = keyset.iterator();

        while (it.hasNext()) {
            Student stu = it.next();
            String add = hm.get(stu);
            System.out.println(stu + "..." + add);
        }


        //第二种取出方式:entrySet
        //先获取map集合的entryset集合，entryset（）
        Set<Map.Entry<Student,String>> entryset = hm.entrySet();

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
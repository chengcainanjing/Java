import java.util.*;

/*
将自定义对象作为元素放到ArrayList集合中，并去除相同元素
比如：存人，同姓名同年龄，视为同一个人，为重复元素

思路：
1、对人描述，将数据封装进人对象
2、定义容器，将人存入
3、取出
 */
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        System.out.println(this.name + "..." + p.name);

        return this.name.equals(p.name) && this.age == p.age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class ArrayListTest2 {
    public static ArrayList singleElement(ArrayList arrayList) {
        ArrayList newal = new ArrayList();

        Iterator it = arrayList.iterator();

        while (it.hasNext()) {
            Object obj = it.next();

            //List集合判断元素是否相同，依据的是元素的equals方法
            if (!newal.contains(obj)) {
                newal.add(obj);
            }
        }

        return newal;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Person("lisi01",30));
        al.add(new Person("lisi02",31));
        al.add(new Person("lisi02",31));
        al.add(new Person("lisi04",33));
        al.add(new Person("lisi05",34));
        al.add(new Person("lisi06",35));
        al.add(new Person("lisi07",36));

        //sop(al);

        sop("remove 04:"+al.remove(new Person("lisi04",33)));
        //去重操作
        al = singleElement(al);

        //迭代器
        Iterator it = al.iterator();

        while (it.hasNext()) {
            Person p = (Person) it.next();
            sop(p.getName() + "::" + p.getAge());
        }

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}

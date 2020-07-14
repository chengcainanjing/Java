import java.util.*;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    //hashCode
    public int hashCode() {
        System.out.println(this.name + "...hashCode");
        return name.hashCode()+age*37;
    }

    //判断对象是否相等
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        System.out.println(this.name + "..equals.." + p.name);

        return this.name.equals(p.name) && this.age == p.age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        sop(hs.add(new Person("A1",33)));
        sop(hs.add(new Person("A2",34)));
        //sop(hs.add(new Person("A2",34)));
        sop(hs.add(new Person("A3",35)));
        sop(hs.add(new Person("A4",36)));

        //判断新添加的对象在HashSet中是否存在
        sop("A3:"+hs.contains(new Person("A3",35)));

        //判断新添加的对象在HashSet中是否存在，如果存在就删除
        hs.remove(new Person("A2", 34));

        //迭代器
        Iterator it = hs.iterator();

        while (it.hasNext()) {
            Person p = (Person) it.next();
            sop(p.getName()+"..."+p.getAge());
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}

import java.util.*;
/*
TreeSet：可以对Set集合中的元素进行排序

需求：
往TreeSet集合中存储自定义队形学生
想按照学生的年龄进行排序

 记住，排序时，当主要条件相同时，一定判断一下次要条件


   |---TreeSet：可以对Set集合中的元素进行排序
                                    底层数据结构是二叉树
                                    保证元素唯一性的依据：
                                    compareTo方法return0
                                    TreeSet排序的第一种方式：让元素自身具备比较性。
                                    元素需要实现Comparable接口，覆盖compareTo方法
                                    这种方式也称为元素的自然顺序，或者叫做默认顺序

                                    TreeSet的第二种排序方式。
                                    当元素自身不具备比较性，或者具备的比较性不是所需的的
                                    这时需要集合自身具备比较性
                                    定义了比较器，将比较器对象作为参数传递给TreeSet集合的构造函数

                                    当两种排序都存在时，以比较器为主

                                    定义比较器，实现Comparetor接口，覆盖compare方法。

 练习：按照字符串长度排序

 字符串本身具备比较性，但他的比较方式不是所需的

 这时需要比较器
 */

class Student implements Comparable{//该接口强制让学生具备比较性
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //比较器
    public int compareTo(Object object) {

        //按add的顺序取出
        //return 1;

        //按add的反顺序取出
        //return -1;

        //仅add第一个，其他扔掉
        //return 0;

        //按age排序，次要条件是name是否相同，相同即扔掉
        if (!(object instanceof Student)) {
            throw new RuntimeException("不是学生对象");
        }

        Student s = (Student) object;

        //System.out.println(this.name + "...compareto..." + s.name);
        if (this.age > s.age) {
            return 1;
        }

        //判断主要条件
        if (this.age == s.age) {
            //判断次要条件
            return this.name.compareTo(s.name);
        }

        return -1;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

//自定义的比较器，需要将该类传给构造函数 TreeSet hs = new TreeSet(new MyCompare());
class MyCompare implements Comparator{
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        int num = s1.getName().compareTo(s2.getName());

        if (num == 0) {
            return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
        }

        return num;
    }
}


class StrLenComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        int num = new Integer(s1.getName().length()).compareTo(s2.getName().length());

        if (num == 0) {
            return s1.getName().compareTo(s2.getName());
        }

        return num;

    }
}


class TreeSetTest {
    public static void main(String[] args) {
        //使用Student类中的compareTo比较方法，比较age的大小，次要比较name是否一致
        TreeSet hs = new TreeSet();

        //使用指定的比较器，StrLenComparator，比较Student的name属性长短，并依次排列，次要条件，当两个name长度一致，比较姓名是否相同
        //TreeSet hs = new TreeSet(new StrLenComparator());

        //使用指定的比较器，MyCompare，比较Student的name属性，按字母表顺序并依次排列，次要条件，当两个人name一样，比较age是否一致
        //TreeSet hs = new TreeSet(new MyCompare());

        hs.add(new Student("chengcai01",38));
        hs.add(new Student("ahengcai001",38));
        hs.add(new Student("shengcai02",32));
        hs.add(new Student("chengcai02",33));
        hs.add(new Student("chengcai03",33));
        hs.add(new Student("chengcai03",33));
        hs.add(new Student("chengcai003",33));
        hs.add(new Student("chengcai04",36));

        //迭代器
        Iterator it = hs.iterator();

        while (it.hasNext()) {
            Student st = (Student) it.next();
            sop(st.getName()+"...."+st.getAge());
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
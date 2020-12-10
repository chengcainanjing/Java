import java.util.*;
/*
    ѧ������:����������
    ע�⣺������������ͬ����Ϊͬһ��ѧ��
    ��֤ѧ����Ψһ��

    1������ѧ��
    2������map��������ѧ����Ϊ������ַ��Ϊֵ������
    3����ȡmap�����е�Ԫ��
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

    //�ж϶����Ƿ����
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            throw new ClassCastException("���Ͳ�ƥ��");
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

        //���Ԫ�أ����Ԫ�أ�����������ʱ��ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ���ļ���Ӧֵ
        //��put�����᷵�ر����ǵ�ֵ
        //Student s01 = new Student("chengcai01",11);
        hm.put(new Student("chengcai01",11), "chengcai1");
        hm.put(new Student("chengcai02",13), "chengcai2");
        hm.put(new Student("chengcai03",13), "chengcai3");

        //��һ��ȡ����ʽ
        Set<Student> keyset = hm.keySet();

        Iterator<Student> it = keyset.iterator();

        while (it.hasNext()) {
            Student stu = it.next();
            String add = hm.get(stu);
            System.out.println(stu + "..." + add);
        }


        //�ڶ���ȡ����ʽ:entrySet
        //�Ȼ�ȡmap���ϵ�entryset���ϣ�entryset����
        Set<Map.Entry<Student,String>> entryset = hm.entrySet();

        //����set���ϣ��Ϳ��Ի�ȡ�������
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
    Map.Entry ��ʵEntryҲ��һ���ӿڣ�����Map�ӿ��е�һ���ڲ��ӿ�
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
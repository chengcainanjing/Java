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

    //�ж϶����Ƿ����
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

        //�ж�����ӵĶ�����HashSet���Ƿ����
        sop("A3:"+hs.contains(new Person("A3",35)));

        //�ж�����ӵĶ�����HashSet���Ƿ���ڣ�������ھ�ɾ��
        hs.remove(new Person("A2", 34));

        //������
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

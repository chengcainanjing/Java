import java.util.*;

/*
���Զ��������ΪԪ�طŵ�ArrayList�����У���ȥ����ͬԪ��
���磺���ˣ�ͬ����ͬ���䣬��Ϊͬһ���ˣ�Ϊ�ظ�Ԫ��

˼·��
1�����������������ݷ�װ���˶���
2���������������˴���
3��ȡ��
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

            //List�����ж�Ԫ���Ƿ���ͬ�����ݵ���Ԫ�ص�equals����
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
        //ȥ�ز���
        al = singleElement(al);

        //������
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

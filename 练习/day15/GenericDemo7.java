import java.util.*;

/*
? ͨ�����Ҳ�������Ϊռλ��
���͵��޶�
�� extends E: ���Խ���E���ͻ���E�������͡�����
�� super E:  ����E���ͻ���E�ĸ����͡�����
 */


/*
class GenericDemo6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("abc1");
        al.add("abc2");
        al.add("abc3");

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(3);

        printColl(al);
        printColl(al1);
    }

    public static <T> void printColl(ArrayList<T> al) {
        Iterator<T> it = al.iterator();
        while (it.hasNext()) {
            T t = it.next();
            System.out.println(t);
        }
    }
}

 */

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person{
    Student(String name) {
        super(name);
    }
}



class Worker extends Person{
    Worker(String name) {
        super(name);
    }
}

//����ķ��Ϳ�����Worker��Student�ĸ�����Person������д��������ķ��ͣ�
//��Ҳ�о���,����������������Ǹ���ķ����������������
class Comp implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

/*
//��������Person����ıȽϣ��������������ָ���ıȽϣ��������������ֵıȽϡ�
class Comp implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}


class Comp implements Comparator<Worker> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
*/


class GenericDemo7 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comp());


        ts.add(new Student("abc01"));
        ts.add(new Student("abc02"));
        ts.add(new Student("abc04"));
        ts.add(new Student("abc06"));
        ts.add(new Student("abc03"));

        Iterator<Student> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }



        TreeSet<Worker> ts1 = new TreeSet<Worker>(new Comp());


        ts1.add(new Worker("wabc01"));
        ts1.add(new Worker("wabc02"));
        ts1.add(new Worker("wabc04"));
        ts1.add(new Worker("wabc06"));
        ts1.add(new Worker("wabc03"));

        Iterator<Worker> it1 = ts1.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next().getName());
        }

    }

}
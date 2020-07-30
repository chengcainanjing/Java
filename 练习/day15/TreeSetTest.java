import java.util.*;
/*
TreeSet�����Զ�Set�����е�Ԫ�ؽ�������

����
��TreeSet�����д洢�Զ������ѧ��
�밴��ѧ���������������

 ��ס������ʱ������Ҫ������ͬʱ��һ���ж�һ�´�Ҫ����


   |---TreeSet�����Զ�Set�����е�Ԫ�ؽ�������
                                    �ײ����ݽṹ�Ƕ�����
                                    ��֤Ԫ��Ψһ�Ե����ݣ�
                                    compareTo����return0
                                    TreeSet����ĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԡ�
                                    Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo����
                                    ���ַ�ʽҲ��ΪԪ�ص���Ȼ˳�򣬻��߽���Ĭ��˳��

                                    TreeSet�ĵڶ�������ʽ��
                                    ��Ԫ�������߱��Ƚ��ԣ����߾߱��ıȽ��Բ�������ĵ�
                                    ��ʱ��Ҫ��������߱��Ƚ���
                                    �����˱Ƚ��������Ƚ���������Ϊ�������ݸ�TreeSet���ϵĹ��캯��

                                    ���������򶼴���ʱ���ԱȽ���Ϊ��

                                    ����Ƚ�����ʵ��Comparetor�ӿڣ�����compare������

 ��ϰ�������ַ�����������

 �ַ�������߱��Ƚ��ԣ������ıȽϷ�ʽ���������

 ��ʱ��Ҫ�Ƚ���
 */

class Student implements Comparable{//�ýӿ�ǿ����ѧ���߱��Ƚ���
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //�Ƚ���
    public int compareTo(Object object) {

        //��add��˳��ȡ��
        //return 1;

        //��add�ķ�˳��ȡ��
        //return -1;

        //��add��һ���������ӵ�
        //return 0;

        //��age���򣬴�Ҫ������name�Ƿ���ͬ����ͬ���ӵ�
        if (!(object instanceof Student)) {
            throw new RuntimeException("����ѧ������");
        }

        Student s = (Student) object;

        //System.out.println(this.name + "...compareto..." + s.name);
        if (this.age > s.age) {
            return 1;
        }

        //�ж���Ҫ����
        if (this.age == s.age) {
            //�жϴ�Ҫ����
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

//�Զ���ıȽ�������Ҫ�����ഫ�����캯�� TreeSet hs = new TreeSet(new MyCompare());
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
        //ʹ��Student���е�compareTo�ȽϷ������Ƚ�age�Ĵ�С����Ҫ�Ƚ�name�Ƿ�һ��
        TreeSet hs = new TreeSet();

        //ʹ��ָ���ıȽ�����StrLenComparator���Ƚ�Student��name���Գ��̣����������У���Ҫ������������name����һ�£��Ƚ������Ƿ���ͬ
        //TreeSet hs = new TreeSet(new StrLenComparator());

        //ʹ��ָ���ıȽ�����MyCompare���Ƚ�Student��name���ԣ�����ĸ��˳���������У���Ҫ��������������nameһ�����Ƚ�age�Ƿ�һ��
        //TreeSet hs = new TreeSet(new MyCompare());

        hs.add(new Student("chengcai01",38));
        hs.add(new Student("ahengcai001",38));
        hs.add(new Student("shengcai02",32));
        hs.add(new Student("chengcai02",33));
        hs.add(new Student("chengcai03",33));
        hs.add(new Student("chengcai03",33));
        hs.add(new Student("chengcai003",33));
        hs.add(new Student("chengcai04",36));

        //������
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
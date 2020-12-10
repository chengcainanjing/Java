import java.util.*;

/*
   ���󣺶�ѧ����������������������

   ��Ϊ�������Լ�ֵ����ʽ���ڵġ�
   ����Ҫʹ�ÿ��������Map���ϡ�TreeMap
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

        //���Ԫ�أ����Ԫ�أ�����������ʱ��ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ���ļ���Ӧֵ
        //��put�����᷵�ر����ǵ�ֵ
        //Student s01 = new Student("chengcai01",11);
        tm.put(new Student("chengcai01",11), "chengcai1");
        tm.put(new Student("ahengcai02",16), "chengcai2");
        tm.put(new Student("fhengcai03",13), "chengcai3");
        tm.put(new Student("bhengcai04",10), "chengcai3");


        //�ڶ���ȡ����ʽ:entrySet
        //�Ȼ�ȡmap���ϵ�entryset���ϣ�entryset����
        Set<Map.Entry<Student,String>> entryset = tm.entrySet();

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
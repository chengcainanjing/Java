import java.util.*;
/*
    1.add�����Ĳ���������Object���Ա��ڽ����������Ͷ���
    2.�����д洢�Ķ��Ƕ�������ã���ַ��
 */


class CollectionDemo {
    public static void main(String[] args) {
        method_3();
    }

    public static void method_3() {
        //����һ������������ʹ��Collection�ӿڵ����࣬ArrayList
        ArrayList al = new ArrayList();

        //1.���Ԫ��
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        //��ȡ������������ȡ�������е�Ԫ��
        Iterator it = al.iterator();

        while (it.hasNext()) {
            sop(it.next());
        }


        //��ӡ����
        //sop("ԭ���ϣ�"+al);


    }




    public static void method_2() {
        ArrayList al1 = new ArrayList();
        al1.add("java01");
        al1.add("java02");
        //al1.add("java03");
        //al1.add("java04");
        al1.add("java05");
        al1.add("java10");

        ArrayList al2 = new ArrayList();
        al2.add("java01");
        al2.add("java02");
        al2.add("java03");
        al2.add("java04");
        al2.add("java05");
        al2.add("java06");
        al2.add("java07");
        al2.add("java08");
        al2.add("java09");

        //al1.retainAll(al2);//ȡ������al1��ֻ���ź�al2����ͬ��Ԫ��
        al1.removeAll(al2);//ȥ����al2����ͬ��Ԫ��

        sop("a11:"+al1);
        sop("a12:"+al2);
    }

    public static void method_1() {
        //����һ������������ʹ��Collection�ӿڵ����࣬ArrayList
        ArrayList al = new ArrayList();

        //1.���Ԫ��
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        //��ӡ����
        sop("ԭ���ϣ�"+al);

        //ɾ������
        al.remove("java03");
        //��ռ���
        //al.clear();

        //2.��ȡ���������ϳ���
        sop("size: "+al.size());

        //��ӡ����
        sop("ɾ���󼯺�"+al);

        //�жϼ���
        sop("java02�Ƿ��ڼ�����"+al.contains("java02"));
        sop("�����Ƿ�Ϊ��"+al.isEmpty());
    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}

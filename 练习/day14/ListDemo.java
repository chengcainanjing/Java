import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        method_1();
        method_2();
    }

    public static void method_2() {
        ArrayList al = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");

        sop(al);

        /*
        List�������еĵ�������ListIterator��Iterator���ӽӿ�

        �ڵ����У�������ͨ�����϶���ķ������������е�Ԫ��
        ��Ϊ�ᷢ��ConcurentModificationException�쳣

        ���Ե�����ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator���������޵�
        ֻ�ܶ�Ԫ�ؽ����жϡ�ȥ����ɾ������
        �����Ҫ�����Ĳ�������ӡ��޸ĵȣ�����Ҫʹ�������ӽӿڣ�ListIterator

        �ýӿ�ֻ��ͨ��List���ϵ�listIterator������ȡ
         */
        ListIterator li = al.listIterator();

        sop("hasPrevious():"+li.hasPrevious());


        while (li.hasNext()) {
            Object obj = li.next();

            if (obj.equals("java02")) {
                li.add("java002");
            }
        }


        while (li.hasPrevious()) {
            sop("pre:" + li.previous());
        }


        sop("hasPrevious():"+li.hasPrevious());
        sop("hasNext():"+li.hasNext());


        sop(al);
    }



    public static void method_1() {
        ArrayList al = new ArrayList();

        //�����Ԫ��
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");
        al.add("java05");

        sop("ԭ�����ǣ�" + al);

        //��ָ��λ�����Ԫ��
        al.add(1, "java07");

        sop("�¼����ǣ�" + al);

        //ɾ��ָ��λ�õ�Ԫ��
        al.remove(4);

        sop("ɾ�����¼����ǣ�" + al);

        //�޸�Ԫ��
        al.set(0, "java0001");

        sop("�޸ĺ���Ԫ���ǣ�" + al);
        
        //��ѯԪ��
        sop("al(1): "+al.get(1));
        
        //����Ԫ��
        for (Iterator it = al.iterator(); it.hasNext();) {
            sop(it.next());
        }

        //ͨ��indexOf��ȡ�����λ��
        sop("index=" + al.indexOf("java02"));

        List sub = al.subList(1, 3);

        sop("sub=" + sub);
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}

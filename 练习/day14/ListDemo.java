import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        method_1();
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
        al.remove(2);

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

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}

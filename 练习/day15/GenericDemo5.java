import java.util.*;

interface Inter<T> {
    void show(T t);
}

/*
//�ڽӿ��϶����ȷ���ķ���
class InterImpl implements Inter<String> {
    public void show(String t) {
        System.out.println("show:" + t);

    }
}

 */



//������δȷ�����͵�ȷ������
class InterImpl<T> implements Inter<T> {
    public void show(T t) {
        System.out.println("show:" + t);

    }
}




class GenericDemo5 {
    public static void main(String[] args) {
        /*
        //�Ѿ�ȷ���÷�������
        InterImpl i = new InterImpl();
        i.show("haha");

         */

        //��ȷ���������ͣ���Ҫ�ڽ�����ʱȷ��
        InterImpl<Integer> i = new InterImpl<Integer>();
        i.show(5);
    }
}
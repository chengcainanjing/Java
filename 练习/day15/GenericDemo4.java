import java.util.*;
/*
//���Ͷ���������
class Demo<T> {
    public void show(T t) {
        System.out.println("show:" + t);
    }

    public<T> void print(T t) {
        System.out.println("print:" + t);
    }
}

 */

//�����ඨ��ķ��ͣ�������������Ч�����������ʹ��
//��ô������Ķ�����ȷҪ�����ľ������ͺ�����Ҫ���������;͹̶�

//Ϊ���ò�ͬ�������Բ�����ͬ���ͣ��������ͻ���ȷ����
//��ô���Խ����Ͷ����ڷ�����

/*
//���Ͷ����ڷ�����
class Demo {
    public<Q> void show(Q q) {
        System.out.println("show:" + q);
    }

    public<T> void print(T t) {
        System.out.println("print:" + t);
    }
}

 */

//���ͼȶ����ڷ������ж���������
//����֮������̬���������Է�λ���϶���ķ���
//�����̬����������Ӧ���������Ͳ�ȷ�������Խ����Ͷ����ڷ�����
class Demo<T> {
    public void show(T t) {
        System.out.println("show:" + t);
    }

    public<Q> void print(Q q) {
        System.out.println("print:" + q);
    }

    //ע��<W>�Ƿ������η����棬����ǰ��
    public static <W> void method(W w) {
        System.out.println("method:" + w);
    }
}


class GenericDemo4 {
    public static void main(String[] args) {
        /*
        //���巺���࣬���еķ������Ͳ����Ըı�
        Demo<String> d = new Demo<String>();
        d.show("haha");
        d.print("hehe");
        */

        /*
        //���巽�������ͣ��������϶�������
        Demo d = new Demo();
        d.show("haha");
        d.show(new Integer(3));
        d.print("hehe");
        d.print(new Integer(4));

         */

        //�ȶ������ϵķ��ͣ��ֶ��巽���ϵķ���
        Demo<String> d = new Demo<String>();
        d.show("hahah");
        d.print(new Integer(5));
        Demo.method("hehehehe");
        d.method("chengcai");

    }
}
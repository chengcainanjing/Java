class StringMethodDemo {
    public static void main(String[] args) {
 /*       //s1��һ�������ͱ�������abc����һ������
        //�ַ�������ص㣺һ������ʼ�����Ͳ����Ըı�
        String s1 = "abc";

        String s2 = new String("abc");
        //s1��s2����
        //s1���ڴ�����һ������
        //s2���ڴ�������������

        System.out.println(s1 == s2);
        //String�ิд��object���е�equals�������÷��������ж��ַ����Ƿ���ͬ
        System.out.println(s1.equals(s2));*/
        method_get();

        method_is();

    }

    public static  void method_is() {
        String str = "StringMethodDemo.java";

        //�ַ������Ƿ����ĳһ���Ӵ�
        sop(str.contains("Demo"));

        //�ַ����Ƿ�������
        sop(str.isEmpty());

        //�ַ����Ƿ�����ָ�����ݿ�ͷ
        sop(str.startsWith("String"));

        //�ַ����Ƿ�����ָ�����ݽ�β
        sop(str.endsWith(".java"));
    }

    public static void method_get() {
        String str = "abcdefgadc";

        //��ȡ�ַ�������
        sop(str.length());

        //����������ȡ�ַ�
        sop(str.charAt(3)); //�����ʵ��ַ����в����ڽǱ�ʱ�ᷢ��StringIndexOutOfBoundsException

        //�����ַ���ȡ����
        sop(str.indexOf('c',3));
    }

    public static void sop(Object object) {
        System.out.println(object);
    }
}

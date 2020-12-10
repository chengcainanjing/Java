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
        //method_get();

        //method_is();

        //method_trans();

        //method_replace();

        //method_split();

        //method_sub();

        method_compare();

    }

    public static void method_compare() {
        String s1 = "    hello java   ";

        //תΪ��д
        sop(s1.toUpperCase());
        //תΪСд
        sop(s1.toLowerCase());
        //ȥ���ַ������˵Ķ���ո�
        sop(s1.trim());

        String s2 = "ada";
        String s3 = "acd";

        //�������ַ���������Ȼ˳��Ƚ�
        sop(s2.compareTo(s3));

    }
    public static void method_sub() {
        String s1 = "abcdfghikjlmn";

        sop(s1.substring(2));
        sop(s1.substring(2, 5));
    }

    public static void method_split() {
        String s1 = "abcd,efgh,ijkl,mn";

        String[] arr1 = s1.split(",");

        for (int i = 0; i < arr1.length; i++) {
            sop("arr[" + i + "]= " + arr1[i]);
        }
    }

    public static void method_replace() {
        String s1 = "abcdefghijklmn";
        sop("s1=" + s1);

        String s2 = s1.replace("abcd", "dcba");
        sop("s2=" + s2);
    }

    public static void method_trans() {
        char[] arr = {'a', 'b', 'c', 'd', 'f'};
        String s1 = new String(arr);
        sop(s1);

        String s2 = new String(arr, 1, 3);
        sop(s2);

        String s3 = "acdealskfjklf";
        char[] a2 = s3.toCharArray();

        for (int i = 0; i < a2.length; i++) {
            sop("a2[" + i + "]=" + a2[i]);
        }
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

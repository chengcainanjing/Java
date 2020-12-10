class StringMethodDemo {
    public static void main(String[] args) {
 /*       //s1是一个类类型变量，“abc”是一个对象
        //字符串最大特点：一旦被初始化，就不可以改变
        String s1 = "abc";

        String s2 = new String("abc");
        //s1与s2区别？
        //s1在内存中有一个对象
        //s2在内存中有两个对象

        System.out.println(s1 == s2);
        //String类复写了object类中的equals方法，该方法用于判断字符串是否相同
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

        //转为大写
        sop(s1.toUpperCase());
        //转为小写
        sop(s1.toLowerCase());
        //去掉字符串两端的多个空格
        sop(s1.trim());

        String s2 = "ada";
        String s3 = "acd";

        //对两个字符串进行自然顺序比较
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

        //字符串中是否包含某一个子串
        sop(str.contains("Demo"));

        //字符中是否有内容
        sop(str.isEmpty());

        //字符串是否是以指定内容开头
        sop(str.startsWith("String"));

        //字符串是否是以指定内容结尾
        sop(str.endsWith(".java"));
    }

    public static void method_get() {
        String str = "abcdefgadc";

        //获取字符换长度
        sop(str.length());

        //根据索引获取字符
        sop(str.charAt(3)); //当访问到字符串中不存在角标时会发生StringIndexOutOfBoundsException

        //根据字符获取索引
        sop(str.indexOf('c',3));
    }

    public static void sop(Object object) {
        System.out.println(object);
    }
}

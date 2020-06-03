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
        method_get();

        method_is();

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

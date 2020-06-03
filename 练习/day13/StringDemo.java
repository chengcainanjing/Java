class StingDemo {
    public static void main(String[] args) {
        //s1是一个类类型变量，“abc”是一个对象
        //字符串最大特点：一旦被初始化，就不可以改变
        String s1 = "abc";

        String s2 = new String("abc");
        //s1与s2区别？
        //s1在内存中有一个对象
        //s2在内存中有两个对象

        System.out.println(s1 == s2);
        //String类复写了object类中的equals方法，该方法用于判断字符串是否相同
        System.out.println(s1.equals(s2));

    }
}

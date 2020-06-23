class IntegerDemo {
    public static void main(String[] args) {
        //整数类型的最大值
        //sop("int max : " + Integer.MAX_VALUE);

        //将一个字符串转成整数
        int num = Integer.parseInt("123");
        sop("int = " + (num + 4));

        //将一个字符串转成浮点数
        double num1 = Double.parseDouble("12.34");
        sop("double = " + (num1 + 4.0));

        //将一个字符串转成布尔型
        boolean b = Boolean.parseBoolean("true");
        sop("boolean = " + b);

        //将十进制转成其他进制
        sop("十进制转成二进制："+Integer.toBinaryString(6));
        sop("十进制转成八进制："+Integer.toHexString(6));
        sop("十进制转成十六进制："+Integer.toOctalString(16));

        //将其他进制转成十进制
        int x = Integer.parseInt("110",16);
        sop("十六进制转成十进制:" + x);

        int y = Integer.parseInt("110",8);
        sop("八进制转成十进制:" + y);

        int z = Integer.parseInt("110",2);
        sop("二进制转成十进制:" + z);

    }


    public static void sop(String string) {
        System.out.println(string);
    }
}

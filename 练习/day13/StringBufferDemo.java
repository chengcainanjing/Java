
class StringBufferDemo {
    public static void method_getChars() {
        StringBuffer sb = new StringBuffer();
        sb.append("chengcai");
        sop(sb.toString());

        char[] chs = new char[5];

        sb.getChars(1,4,chs,2);
        for (int i= 0; i < chs.length; i++) {
            sop("chs["+i+"]="+chs[i]+";");
        }
    }


    public static void method_delete() {
        StringBuffer sb = new StringBuffer();
        sb.append("chengcai");
        sop(sb.toString());

        sb.delete(2, 3);
        //相同的功能实现
        //sb.deleteChartAt(2);

        sop(sb.toString());

        sb.delete(0, sb.length());
        sop(sb.toString());


    }


    public static void method_update() {
        StringBuffer sb = new StringBuffer();
        sb.append("chengcai").append(23).append("baidu");
        sop(sb.toString());

        //在一个字符串中特换指定的String字符这个序列的特征
        sb.replace(1, 2, "java");
        sop(sb.toString());

        //指定索引出的字符位置为ch
        sb.setCharAt(3, '3');
        sop(sb.toString());
    }

    public static void method_add() {
        StringBuffer sb = new StringBuffer();
        sb.append("chengcai").append(23).append("baidu");
        sop(sb.toString());

        sb.insert(2, "hello");

        sop(sb.toString());


        //String s1 = "abcwerthelloyuiodefcai";
        //String s2 = "cvhellobnmcai";
        //sop(getMaxSubString(s1, s2));
    }

    public static void sop(String str) {
        System.out.println(str);
    }


    public static void main(String[] args) {
        //method_add();

        //method_delete();

        //method_update();

        method_getChars();
    }
}


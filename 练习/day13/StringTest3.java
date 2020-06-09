class StringTest3 {
    public static void main(String[] args) {
        String str = "abkkcdkkefkkghkki";

        sop("count"+getSubCount(str, "kk"));

        sop("count"+getSubCount_2(str, "kk"));


    }

    //获取一个字符串在另一个字符串中出现的次数
    //方式一
    public static int getSubCount(String str, String key) {
        int count = 0;
        int index = 0;

        //indexOf(str):可以索引第一次出现位置，如果返回-1，表示该str不在字符串中
        while ((index = str.indexOf(key))!=-1) {
            sop("str=" + str);

            //从指定位置开始到结尾
            str = str.substring(index + key.length());

            count++;
        }
        return count;
    }

    //方式二
    public static int getSubCount_2(String str, String key) {
        int count = 0;
        int index = 0;

        //indexOf(str):可以索引第一次出现位置，如果返回-1，表示该str不在字符串中
        //int indexOf(String str, int fromIndex);
        //从fromindex指定位置开始，返回的是str在字符串中第一次出现的位置
        while ((index = str.indexOf(key,index))!=-1) {
            //打印key出现的位置
            sop("index=" + index);

            //key出现的位置再加上key的长度
            index = index + key.length();

            count++;
        }
        return count;
    }

    public static void sop(String str) {
        System.out.println(str);
    }
}


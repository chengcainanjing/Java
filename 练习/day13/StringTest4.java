//获取两个字符串中最大相同子串
class StringTest4 {
    public static void main(String[] args) {
        String s1 = "abcwerthelloyuiodefcai";
        String s2 = "cvhellobnmcai";
        sop(getMaxSubString(s1, s2));
    }

    public static String getMaxSubString(String s1, String s2) {
        String max = "", min = "";

        max = (s1.length()>s2.length())?s1:s2;

        min = (max == s1) ? s2 : s1;
        for (int x = 0; x < min.length(); x++) {
            for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, z++) {
                String temp = min.substring(y, z);
                //sop(temp);

                //if(max.indexOf(temp)!=-1)
                while (max.contains(temp)) {
                    return temp;
                }
            }
        }
        return "";
    }

    public static void sop(String str) {
        System.out.println(str);
    }
}


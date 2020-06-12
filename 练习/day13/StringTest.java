class StringTest {
    public static void main(String[] args) {
        String str = "    cheng cai     ";
        sop("(" + str + ")");

        String str1 = myTrim(str);
        sop("("+str1+")");

    }

    //Á·Ï°Ò»£ºÈ¥³ý×Ö·û´®Á½¶Ë¿Õ¸ñ
    public static String myTrim(String str) {
        int start = 0, end = str.length()-1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (start <= end && str.charAt(end) == ' ') {
             end--;
        }

        return str.substring(start, end + 1);
    }

    public static void sop(Object object) {
        System.out.println(object);
    }
}

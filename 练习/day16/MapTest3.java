import java.util.*;

/*
   练习：
   "sdfgzxcvasdfxvdf"获取该字符串中的字母出现的次数。
   希望打印结果：a(1)c(2)......

   通过结果发现，每一个字符都有对应的次数
   说明字母和次数之间都有映射关系

   注意了，当发现有映射关系时，可以选择map集合。
   因为map集合中存放的就是映射关系

   什么时候使用map集合？
   当数据之间存在这种映射关系时，就要先想mpa集合

   思路：
   1、将字符串转换成数组，应为要对每一个字母进行操作
   2、定义一个Map集合，因为打印结果的字母有顺序，所以使用treemap集合
   3、遍历字符数组
        将每一个字母作为键去查map集合
        如果返回null，将该字母和1存入map集合中
        如果返回的不是null，说明该字母在map集合已经存在并有对应次数
        那么获取该次数并进行自增，然后将该字母和自增后的次数存入Map集合中。覆盖调用原来键对应的值

   4、将map集合中的数据编程指定的字符串形式返回


 */




class MapTest3 {
    public static void main(String[] args) {
        String s = charCount("abcdds2352345';'[p;[]efghijkabcdef");
        System.out.println(s);
    }


    public static String charCount(String str) {
        char[] chs = str.toCharArray();

        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        int count = 0;
        for (int x = 0; x < chs.length; x++) {
            if (!(chs[x] >= 'a' && chs[x] <= 'z' || chs[x] >= 'A' && chs[x] <= 'Z')) {
                continue;
            }
            Integer value = tm.get(chs[x]);

            if (value != null) {
                count =value;
            }
            count++;
            tm.put(chs[x], count);

            count = 0;
            /*
            if (value == null) {
                tm.put(chs[x], 1);
            } else {
                value = value + 1;
                tm.put(chs[x], value);
            }
             */
        }

        //System.out.println(tm);

        StringBuilder sb = new StringBuilder();

        Set<Map.Entry<Character, Integer>> entrySet = tm.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();

        while (it.hasNext()) {
            Map.Entry<Character, Integer> me = it.next();
            Character ch = me.getKey();
            Integer value = me.getValue();
            sb.append(ch + "(" + value + ")");
        }
        return sb.toString();
    }

}


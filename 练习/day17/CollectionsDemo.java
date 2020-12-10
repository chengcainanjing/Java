/*
    集合框架的工具类
    Collections:
 */

import java.util.*;

class CollectionsDemo {
    public static void main(String[] args) {
        sortDemo();

        maxDemo();
    }

    public static void maxDemo() {
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("z");
        list.add("kkkkk");
        list.add("qq");
        list.add("zz");

        sop(list);

        //Collections.sort(list);
        String max = Collections.max(list,new StrLenComparator());

        sop(max);
    }

    public static void sortDemo() {
        List<String> list = new ArrayList<String>();

        list.add("abcd");
        list.add("aaa");
        list.add("z");
        list.add("kkkkk");
        list.add("qq");
        list.add("zz");

        sop(list);

        //Collections.sort(list);


        Collections.sort(list,new StrLenComparator());


        sop(list);
    }

    public static void sop(Object object) {
        System.out.println(object);
    }
}

class StrLenComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return 1;
        }
        if (s1.length() < s2.length()) {
            return -1;
        }
        return s1.compareTo(s2);
    }
}
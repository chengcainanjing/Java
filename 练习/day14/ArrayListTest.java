import java.util.*;

/*
去除ArrayList集合中重复元素
 */
class ArrayListTest {
    public static ArrayList singleElement(ArrayList arrayList) {
        ArrayList newal = new ArrayList();

        Iterator it = arrayList.iterator();

        while (it.hasNext()) {
            Object obj = it.next();

            if (!newal.contains(obj)) {
                newal.add(obj);
            }
        }

        return newal;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java01");
        al.add("java02");
        al.add("java01");
        al.add("java03");
        al.add("java01");
        al.add("java04");
        al.add("java02");
        al.add("java05");

        sop(al);

        al = singleElement(al);

        sop(al);

    }


    public static void sop(Object obj) {
        System.out.println(obj);
    }
}

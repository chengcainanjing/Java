import java.util.*;



class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        Iterator<String> it = al.iterator();

        while (it.hasNext()) {
            String s = it.next();
            sop(s);
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
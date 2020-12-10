import java.util.*;

class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String,String>> czbk = new HashMap<String, HashMap<String,String>>();
        HashMap<String, String> yure = new HashMap<String, String>();
        HashMap<String, String> jiuye = new HashMap<String, String>();

        czbk.put("yureban", yure);
        czbk.put("jiuyeban", jiuye);

        yure.put("01", "zhangsan");
        yure.put("02", "lisi");

        jiuye.put("01", "zhaoliu");
        jiuye.put("02", "wangwu");

        //遍历czbk集合，获取所有的教室
        Iterator<String> it = czbk.keySet().iterator();

        while (it.hasNext()) {
            String roomName = it.next();
            HashMap<String, String> room = czbk.get(roomName);

            System.out.println(roomName);
            //System.out.println(room);
            getStudentInfo(room);
        }
    }

    public static void getStudentInfo(HashMap<String,String> roomMap) {
        Iterator<String> it = roomMap.keySet().iterator();

        while (it.hasNext()) {
            String id = it.next();
            String name = roomMap.get(id);
            System.out.println(id + ":" + name);
        }
    }

    public static void demo() {
        HashMap<String, List<Student>> czbk = new HashMap<String, List<Student>>();

        List<Student> yure = new ArrayList<Student>();
        List<Student> jiuye = new ArrayList<Student>();

        yure.add(new Student("01", "zhangsan"));
        yure.add(new Student("02", "zhangsi"));
        jiuye.add(new Student("01", "zhangsan"));
        jiuye.add(new Student("02", "chengsi"));

    }
}

/*
    Map.Entry 其实Entry也是一个接口，它是Map接口中的一个内部接口
 */
/*
interface Map {
    public static interface Entry {
        public static Object getKey();
        public static Object getValue();
    }
}

class HashMap implements Map {
    class Hahs implements Map.Entry {
        public Object getKey() {}
        public Object getValue() {}
    }
}
 */
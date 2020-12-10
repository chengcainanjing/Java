import java.util.*;

class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //���Ԫ�أ����Ԫ�أ�����������ʱ��ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ���ļ���Ӧֵ
        //��put�����᷵�ر����ǵ�ֵ
        System.out.println("put:"+map.put("01", "chengcai1"));
        System.out.println("put:"+map.put("01", "chengcai01"));
        map.put("02", "chengcai2");
        map.put("03", "chengcai3");
        map.put("04", null);

        //�Ȼ�ȡmap���ϵ�entryset���ϣ�entryset����
        Set<Map.Entry<String,String>> entryset = map.entrySet();

        //����set���ϣ��Ϳ��Ի�ȡ�������
        Iterator<Map.Entry<String,String>> it = entryset.iterator();

        while (it.hasNext()) {
            Map.Entry<String,String> me = it.next();

            //
            String key = me.getKey();
            String value = me.getValue();
            System.out.println("key:" + key + ", value:" + value);
        }
    }
}

/*
    Map.Entry ��ʵEntryҲ��һ���ӿڣ�����Map�ӿ��е�һ���ڲ��ӿ�
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
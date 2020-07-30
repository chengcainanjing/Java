import java.util.*;

class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //���Ԫ�أ����Ԫ�أ�����������ʱ��ͬ�ļ�����ô����ӵ�ֵ�Ḳ��ԭ���ļ���Ӧֵ
        //��put�����᷵�ر����ǵ�ֵ
        System.out.println("put:"+map.put("01", "chengcai1"));
        System.out.println("put:"+map.put("01", "chengcai01"));
        map.put("02", "chengcai2");
        map.put("03", "chengcai3");
        map.put("04", null);

        //����ͨ��get�����ķ���ֵ���ж�һ�����Ƿ���ڣ�ͨ������null���ж�
        System.out.println("get(04):" + map.get("04"));
        //�ж�map��ָ�����Ƿ����
        System.out.println("containsKey:" + map.containsKey("022"));
        //�ж�map��ӳ���ָ��ֵ�Ƿ����
        System.out.println("containsValue:" + map.containsValue("chengcai2"));
        //��ȡmap�ļ�ֵӳ����Ŀ
        System.out.println("size:" + map.size());
        //��ȡmap����
        System.out.println(map);
        //�Ƴ�map��ָ����ֵ��
        System.out.println("remove:" + map.remove("02"));
        //��ȡmap�ļ�ֵӳ����Ŀ
        System.out.println("size:" + map.size());
        //���mapָ����ӳ���ֵ
        System.out.println("get(01):" + map.get("01"));
        //��ȡmap����
        System.out.println(map);
        //��ȡmap���������е�ֵ
        Collection<String> coll = map.values();
        System.out.println(coll);
        System.out.println("values():" + map.values());


    }
}
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

        //�Ȼ�ȡmap���ϵ����м���set���ϣ�keyset����
        Set<String> keyset = map.keySet();

        //����set���ϣ��Ϳ��Ի�ȡ�������
        Iterator<String> it = keyset.iterator();

        while (it.hasNext()) {
            String key = it.next();

            //���˼�����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ
            String value = map.get(key);
            System.out.println("key:" + key + ", value:" + value);
        }




    }
}
class StringTest3 {
    public static void main(String[] args) {
        String str = "abkkcdkkefkkghkki";

        sop("count"+getSubCount(str, "kk"));

        sop("count"+getSubCount_2(str, "kk"));


    }

    //��ȡһ���ַ�������һ���ַ����г��ֵĴ���
    //��ʽһ
    public static int getSubCount(String str, String key) {
        int count = 0;
        int index = 0;

        //indexOf(str):����������һ�γ���λ�ã��������-1����ʾ��str�����ַ�����
        while ((index = str.indexOf(key))!=-1) {
            sop("str=" + str);

            //��ָ��λ�ÿ�ʼ����β
            str = str.substring(index + key.length());

            count++;
        }
        return count;
    }

    //��ʽ��
    public static int getSubCount_2(String str, String key) {
        int count = 0;
        int index = 0;

        //indexOf(str):����������һ�γ���λ�ã��������-1����ʾ��str�����ַ�����
        //int indexOf(String str, int fromIndex);
        //��fromindexָ��λ�ÿ�ʼ�����ص���str���ַ����е�һ�γ��ֵ�λ��
        while ((index = str.indexOf(key,index))!=-1) {
            //��ӡkey���ֵ�λ��
            sop("index=" + index);

            //key���ֵ�λ���ټ���key�ĳ���
            index = index + key.length();

            count++;
        }
        return count;
    }

    public static void sop(String str) {
        System.out.println(str);
    }
}


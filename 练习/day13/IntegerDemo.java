class IntegerDemo {
    public static void main(String[] args) {
        //�������͵����ֵ
        //sop("int max : " + Integer.MAX_VALUE);

        //��һ���ַ���ת������
        int num = Integer.parseInt("123");
        sop("int = " + (num + 4));

        //��һ���ַ���ת�ɸ�����
        double num1 = Double.parseDouble("12.34");
        sop("double = " + (num1 + 4.0));

        //��һ���ַ���ת�ɲ�����
        boolean b = Boolean.parseBoolean("true");
        sop("boolean = " + b);

        //��ʮ����ת����������
        sop("ʮ����ת�ɶ����ƣ�"+Integer.toBinaryString(6));
        sop("ʮ����ת�ɰ˽��ƣ�"+Integer.toHexString(6));
        sop("ʮ����ת��ʮ�����ƣ�"+Integer.toOctalString(16));

        //����������ת��ʮ����
        int x = Integer.parseInt("110",16);
        sop("ʮ������ת��ʮ����:" + x);

        int y = Integer.parseInt("110",8);
        sop("�˽���ת��ʮ����:" + y);

        int z = Integer.parseInt("110",2);
        sop("������ת��ʮ����:" + z);

    }


    public static void sop(String string) {
        System.out.println(string);
    }
}

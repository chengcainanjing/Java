class fuShuException extends RuntimeException{
		private int value;
			
		fuShuException(){
			super();
		}
		
		fuShuException(String msg,int value){
            super(msg);
			this.value = value;
        }
		
		public int getValue(){
			return this.value;
		}
}

class Demo {    
    int div(int a, int b)  { // �ڹ����ϣ�ͨ��throws�Ĺؼ��������˸ù����п��ܻ��������
        int[] arr = new int[a];
        //System.out.println(arr[a]);  
		if (b == 0)
			throw new ArithmeticException("�������");	//	int x = d.div(3,0);
        if (b<0)
            throw new fuShuException("�����˳����Ǹ�������� / by fushu", b); //�ֶ�ͨ��throw�ؼ����׳�һ���Զ����쳣����;int x = d.div(3,-1);
        return a / b ;
    }
}

class ExceptionDemo1{
    public static void main(String[] args){
        Demo d = new Demo();

		int x = d.div(3,0);
		//int x = d.div(3,-1);
		System.out.println("x= "+ x );
       
        System.out.println("over");
    }
}
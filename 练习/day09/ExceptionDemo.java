class fuShuException extends Exception{
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
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException,fuShuException { // �ڹ����ϣ�ͨ��throws�Ĺؼ��������˸ù����п��ܻ��������
        int[] arr = new int[a];
        //System.out.println(arr[a]);  
        if (b<0)
            throw new fuShuException("�����˳����Ǹ�������� / by fushu", b); //�ֶ�ͨ��throw�ؼ����׳�һ���Զ����쳣����
        return a / b ;
    }
}

class ExceptionDemo{
    public static void main(String[] args){
        Demo d = new Demo();


        try{
            int x = d.div(3,-1);
            System.out.println("x= "+ x );
        }
		catch(ArithmeticException e){// Exception e = new ArithmeticException();
            System.out.println(e.toString()); // �쳣���ƣ��쳣��Ϣ
            System.out.println("������");
        }
        catch(ArrayIndexOutOfBoundsException e){ //Exception e = new ArrayIndexOutOfBoundsException();
            System.out.println(e.toString()); // �쳣���ƣ��쳣��Ϣ
            System.out.println("�Ǳ�Խ����");
        }
        catch(fuShuException e){ //Exception e = newfuShuException();
            System.out.println(e.toString()); // �쳣���ƣ��쳣��Ϣ
            System.out.println("����Ϊ:" + e.getValue());
        }
        catch(Exception e){ //����catch�飬����������
            System.out.println(e.toString()); // �쳣���ƣ��쳣��Ϣ
        }
        System.out.println("over");
    }
}
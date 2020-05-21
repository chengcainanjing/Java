class fuShuException extends Exception{
	fuShuException(String msg){
		super(msg);
	}
}

class Demo {    
    int dev(int a, int b)throws fuShuException{
		if (b < 0 ){
			throw new fuShuException("���ָ�����!");
		}
        return a / b ;
    }
}


class ExceptionDemo1{
    public static void main(String[] args){
        Demo d = new Demo();
		try{
			int x = d.dev(3,-1);
			System.out.println("x= "+ x );
		}
		catch(fuShuException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println("finally");//finally�д�ŵ���һ����ִ�еĴ���
		}
        System.out.println("over");
    }
}



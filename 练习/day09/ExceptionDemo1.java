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
    int div(int a, int b)  { // 在功能上，通过throws的关键字声明了该功能有可能会出现问题
        int[] arr = new int[a];
        //System.out.println(arr[a]);  
		if (b == 0)
			throw new ArithmeticException("被零除啦");	//	int x = d.div(3,0);
        if (b<0)
            throw new fuShuException("出现了除数是负数的情况 / by fushu", b); //手动通过throw关键字抛出一个自定义异常对象;int x = d.div(3,-1);
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
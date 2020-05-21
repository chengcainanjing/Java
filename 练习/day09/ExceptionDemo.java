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
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException,fuShuException { // 在功能上，通过throws的关键字声明了该功能有可能会出现问题
        int[] arr = new int[a];
        //System.out.println(arr[a]);  
        if (b<0)
            throw new fuShuException("出现了除数是负数的情况 / by fushu", b); //手动通过throw关键字抛出一个自定义异常对象
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
            System.out.println(e.toString()); // 异常名称：异常信息
            System.out.println("除零啦");
        }
        catch(ArrayIndexOutOfBoundsException e){ //Exception e = new ArrayIndexOutOfBoundsException();
            System.out.println(e.toString()); // 异常名称：异常信息
            System.out.println("角标越界啦");
        }
        catch(fuShuException e){ //Exception e = newfuShuException();
            System.out.println(e.toString()); // 异常名称：异常信息
            System.out.println("负数为:" + e.getValue());
        }
        catch(Exception e){ //父类catch块，放在最下面
            System.out.println(e.toString()); // 异常名称：异常信息
        }
        System.out.println("over");
    }
}
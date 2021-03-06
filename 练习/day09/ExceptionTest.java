//????
class MaoYanException extends Exception {
	MaoYanException(String msg){
		super(msg);
	}
}

class LanPingException extends Exception {
	LanPingException(String msg){
		super(msg);
	}
}

class NoPlanException extends Exception{
	NoPlanException(String msg){
		super(msg);
	}
}

class Computer{
	private int state = 2;
		
	public void run()throws LanPingException,MaoYanException{
		if (state==2){
			throw new LanPingException("????????????");
		}
		if (state==3){
			throw new MaoYanException("??????????????У???????");
		}
		System.out.println("????????");
	}
	
	public void reset(){
		System.out.println("????????");
		state = 1;
	}
}

class Teacher{
	private String name;
	private Computer cmpt;
	
	Teacher (String name){
		this.name = name;
	}
	
	
	public void prelect() throws NoPlanException{
		cmpt = new Computer();
		try{
			cmpt.run();
			System.out.println("?????");
		}
		//??????????????????????????????????????????????????
		catch (LanPingException e){
			System.out.println(e.toString());
			cmpt.reset();

		}
		catch (MaoYanException e){
			test();
			//???????е???????????????????
			throw new NoPlanException("?????????????У? "+e.getMessage());
			//throw new NoPlanException(e.getMessage());
		}
		catch (Exception e){
			
		}
	}
	public void test(){
		System.out.println("???");
	}
	
}

class ExceptionTest{
	public static void main (String[] args){
		Teacher t = new Teacher("?????");
		try{
			t.prelect();			
		}
		catch(NoPlanException e){
			System.out.println(e.toString());
			System.out.println("?????????");	
		}
	}
}
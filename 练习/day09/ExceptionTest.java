//异常类
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
	private int state = 3;
		
	public void run()throws LanPingException,MaoYanException{
		if (state==2){
			throw new LanPingException("电脑蓝屏啦！");
		}
		if (state==3){
			throw new MaoYanException("电脑无法正常运行，冒烟了！");
		}
		System.out.println("电脑运行");
	}
	
	public void reset(){
		System.out.println("电脑重启");
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
			System.out.println("上课啦");
		}
		//该异常，老师可以解决，因此不需要抛出异常，自己解决，重启电脑即可
		catch (LanPingException e){
			System.out.println(e.toString());
			cmpt.reset();
			
		}
		catch (MaoYanException e){
			test();
			//老师无法有电脑，因此需要将此异常抛出
			throw new NoPlanException("课时无法正常进行！ "+e.getMessage());
			//throw new NoPlanException(e.getMessage());
		}
		catch (Exception e){
			
		}
	}
	public void test(){
		System.out.println("练习");
	}
	
}

class ExceptionTest{
	public static void main (String[] args){
		Teacher t = new Teacher("程老师");
		try{
			t.prelect();			
		}
		catch(NoPlanException e){
			System.out.println(e.toString());
			System.out.println("换老师或放假");	
		}
	}
}
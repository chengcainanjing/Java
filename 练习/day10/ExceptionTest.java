class noValueException extends Exception {
	noValueException(String msg) {
		super(msg);
	}
}

interface Shape{
	void getArea();
}

class Rec implements Shape{
	private int len,wid;

	Rec(int len, int wid) throws noValueException {
		if (len <= 0 || wid <= 0) {
			throw new noValueException("出现负值啦");
		}
		this.len = len;
		this.wid = wid;
	}

	public void getArea() {
		System.out.println(len * wid);
	}
}

class Circle implements Shape{
	private int radius;
	public static double PI = 3.14;

	Circle(int radius) throws noValueException {
		if (radius <= 0) {
			throw new noValueException("出现负值啦");
		}
		this.radius = radius;
	}

	public void getArea() {
		System.out.println(radius*radius*PI);
	}
}

class ExceptionTest{
    public static void main(String[] args){
		try{
			Rec r = new Rec(3,4);
			r.getArea();
		}
		catch(noValueException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println("finally");//finally?д????????????е????
		}
		try{
			Circle c = new Circle(-3);
			c.getArea();
		}
		catch(noValueException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.println("finally");//finally?д????????????е????
		}
        System.out.println("over");
    }
}



package p3;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10;
		Integer r = new Integer(i);//boxing
		System.out.println(r);
		float b =4.56f;
		Float r1 = Float.valueOf(b);//2nd way of boxing
		System.out.println(r1);
		
		Integer r2 = 456; //auto boxing
	
		Float f = 7.89f;
		System.out.println(f);
		System.out.println(r2);
		
		Integer p =new Integer(13);
		
		int w = p.intValue();   //un boxing
		System.out.println(w);
		
		int j = new Integer(56);  //auto un boxing
		System.out.println(j);
		
		
	}

}

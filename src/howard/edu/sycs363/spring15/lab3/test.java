package howard.edu.sycs363.spring15.lab3;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerArrayList ros=new IntegerArrayList(5);
		
		ros.add(5);
		
		ros.add(6);
		ros.add(8);
		ros.add(2);
		ros.add(3);
		
		ros.add(4,78);
		int x=ros.get(3);
		System.out.print(x);
		
		
	}

}

package chapter01;

public class SelfAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int count = 0;
		for(int i = 0 ;i <= 9;i++){
			count=count++;
		}
		System.out.println(count);
		
	}
	private static String caseBreak(int n){
		String result = new String();
		switch(n){
		case 1 : result="1";
			break;
		case 2 : result="1";
		}
		return result;
	}

}

public class App {
	public static void main(String[] args) {
		//121401.奇数求和.App.java  
		long i = 1L;
		long sum = 0L;
		long big=2147483647L;
		while (i <= big){
	        if (i % 2 == 1){
	            sum = sum + i;
	        }
	        i++;
	    }
	    System.out.println("sum = "+sum);
	}

	}


public class App {
	public static void main(String[] args) {
		//121401.奇数求和.App.java  
		int i = 1;
		int sum = 0;
		while (i <= 2147483647){
	        if (i % 2 == 1){
	            sum = sum + i;
	        }
	        i++;
	    }
	    System.out.println("sum = "+sum);
	}

	}

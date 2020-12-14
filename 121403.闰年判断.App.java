import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// 闰年判断
		Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份：");	//向控制台输出一个提示信息
        long year;
        try {
            year = scan.nextLong();
            if (year>-3200||year<3200||year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 是闰年
                System.out.print(year + "是闰年！");
            } else { 								// 不是闰年
                System.out.print(year + "不是闰年！");
            }
        } catch (Exception e) {
            System.out.println("您输入的不是有效的年份！");
        }
	            
	}

}

import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("用户输入:");
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("输出："+ValueN(n));
	}

	private static int ValueN(int n) {
			if(n<1||n>40){
		          return 0;
		      }
		      if(n==1 || n==2){
		          return 1;
		      }
		       int [][] base={{1,1},{1,0}};
		       int [][] res=matrixPower(base,n-2);//斐波那契数列（F（n），F（n-1））为（1，1）与{{1,1},{1,0}}的n-2次幂的乘积
		       return res[0][0]+res[1][0];	
		
	}

	private static int[][] matrixPower(int[][] m, int p) {
		if(p==0)
            return null;
        if(p==1)
            return m;
        int[][] res=matrixPower(m,p>>1);
        res=muliMatrix(res,res);
        if((p&1)==1){
            res=muliMatrix(res,m);
        }
        return res;
	}

	public static int[][] muliMatrix(int[][] m1,int[][] m2){//求两个矩阵相乘得到一个新的矩阵值
        int [][] res=new int[m1.length][m2[0].length];
        for(int i=0;i<m1.length;i++){//i应为m1的行
            for(int j=0;j<m2[0].length;j++){//j应为m2的列
                for(int k=0;k<m2.length;k++){
                    res[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        return res;
	}
}
		

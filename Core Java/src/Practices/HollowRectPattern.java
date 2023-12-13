package Practices;

public class HollowRectPattern {

	public static void main(String[] args) {
//		int length =4;
//		int breadth=5;
//
//		for(int i=1;i<=length;i++){   //5  //row
//		for(int j =1; j<=breadth;j++){   //3  //col
//		if(i==1 || i==length ||
//                j == 1 || j == breadth)
//		System.out.print("*");
//		else
//		System.out.print(" ");
//		}
//		System.out.println();
//		}
//		
//		int n =5;
//		int m=3;
//		int i, j;
//        for (i = 1; i <= n; i++){
//            for (j = 1; j <= m; j++){
//                if (i == 1 || i == n ||
//                    j == 1 || j == m)           
//                    System.out.print("*");           
//                else
//                    System.out.print(" ");           
//            }
//            System.out.println();
//        }
		
		int length =5;
		int breadth=3;

		for(int i=1;i<=length;i++){   //5  //row
		for(int j =1; j<=breadth;j++){   //3  //col
		if(i==1 || i==length || j==1 || j==breadth){
		System.out.print("*");
		}else{
		System.out.print(" ");
		}
		}
		System.out.println("");
		}

	}

}

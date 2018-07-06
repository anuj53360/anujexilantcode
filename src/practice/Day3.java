package practice;

public class Day3 {

	public static void printSpiral(int n,int matchnumber,int givennumber )
		    {
			
			int [][]matrix=new int[n][n];
		       
			for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                 
		                // x stores the layer in which (i, j)th
		                // element lies
		                int x;
		 
		                // Finds minimum of four inputs
		                x = Math.min(Math.min(i, j), 
		                    Math.min(n - 1 - i, n - 1 - j));
		 
		                // For upper right half
		                if (i <= j) {
		                 //   System.out.print((n - 2 * x) * (n - 2 * x) - 
		                    //                 (i - x) - (j - x) + "\t");
		 
		                matrix[i][j]=(n - 2 * x) * (n - 2 * x) - 
                                (i - x) - (j - x);
		                }
		                // for lower left half
		                else {
		                   // System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) +
		                    //                 (i - x) + (j - x) + "\t");
		                    
		                    matrix[i][j]=(n - 2 * x - 2) * (n - 2 * x - 2) +
                                    (i - x) + (j - x);
		                }
		                }
		          //  System.out.println();
		        }
			
			int x=0;
		     int y=0;
		     int p=0,q=0;
			
			for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix.length;j++) {
					
					
					if(matchnumber==matrix[i][j]){
					//	System.out.println(i+" "+j);
					x=i;
					y=j;
					}
					
					if(givennumber==matrix[i][j]) {
						//System.out.println(i+" "+j);
					p=i;
					q=j;
					}
				//	System.out.print(matrix[i][j]+" ");
					
				}
				//System.out.println();
				
			}
			
			int sum=0;
			
			if(p<=x || q<=y) {
				 sum=(p+x)+(q+y);
			}
			else if(p>=x || q>=y) {
				sum=(p-x)+(q-x);
			}
			
			System.out.println(sum);
			
	}
	public static void main(String[] args) {
		
		//int n =	(int) Math.sqrt(1024);
		int n=5;
		// System.out.println(n);
		   
		 
		 int matchnumber=1;
		 int givennumber=25;
	      
	        printSpiral(n,matchnumber,givennumber);
	    }
		

	}



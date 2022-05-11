import java.util.*;

public class sym_pg4 {
	public static void main(String[] args){
		int m[][] = new int[10][10];
		int i,j,n,flag=0;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the size of matrix");
	    n=in.nextInt();
	    System.out.println("Enter the matrix");
	    for(i=0;i<n;i++){
	    	for(j=0;j<n;j++){
	    		m[i][j]=in.nextInt();
	    	}
	    }
	    System.out.println("Matrix");
	    for(i=0;i<n;i++){
	    	for(j=0;j<n;j++){
	    		System.out.print(m[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("");
	    for(i=0;i<n;i++){
	    	for(j=0;j<n;j++){
	    		if(m[i][j] != m[j][i]){
	    			flag=1;
	    		}
	    	}
	    }
	    if(flag == 1){
	    	System.out.println("Matrix is not symmetric");
	    }
	    else{
	    	System.out.println("Matrix is symmetric");
	    }
	}
}

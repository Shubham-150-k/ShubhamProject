package basic_programmes;

import java.util.Scanner;

public class Rotatearray {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		int T=s1.nextInt();
		int art[][]=new int[T][1000];
		int size[]=new int[T];
		for(int j=0;j<T;j++)
		{   int n=s1.nextInt();
		    int k=s1.nextInt();
	    	s1.nextLine();
		    String str[]=s1.nextLine().split(" ");  
		    int arr[]=new int[n];
		      for(int i=0;i<n;i++)
		      {
			    arr[i]=Integer.parseInt(str[i]);
		      }
		      
		      if(k>n)
		      {  while(k>=n)
		      		{
		    	       k=k%n;
		      		}
		    	      int temp=0;
		    	      for(int x=0;x<k;x++)
		    	        {     temp=arr[n-1];
		    			for(int a=1;a<n;a++)
		    			{
		    				arr[n-a]=arr[n-(a+1)];	
		    			}
		    			arr[0]=temp;
		    	        }
		           
		      }
		      
		      else if(k<n && k>0)
		      {
		    	  int temp=0;
		    	  for(int x=0;x<k;x++)
		    	  {     temp=arr[n-1];
		    			for(int a=1;a<n;a++)
		    			{
		    				arr[n-a]=arr[n-(a+1)];	
		    			}
		    			arr[0]=temp;
		    	  }
		      }	
		       for(int l=0;l<n;l++)
		       {
		    	   art[j][l]=arr[l];
		       }
		  size[j]=n;    
		}
		  
              for(int d=0;d<T;d++)
              {
            	  for(int y=0;y<size[d];y++)
            	  {
            		  System.out.print(art[d][y]+" ");
            	  }
            	  System.out.println();
              }
	}

}

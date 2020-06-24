package com.wipro.Arrays;

public class problem7 
{     
    public static void main (String[] args)  
    { 
        int a[] = {1,1,1,2,2,4,6,6,7,5,2,4,5,7,8,9}; 
        int n = a.length; 
        if (n==0 || n==1) 
            System.out.println(n); 
        int[] temp = new int[n]; 
        int j = 0; 
        for (int i=0;i<n-1;i++)  
            if (a[i]!=a[i+1]) 
                temp[j++] = a[i]; 
                temp[j++] = a[n-1];     
        for (int i=0; i<j; i++) 
            a[i] = temp[i];  
        for (int i=0;i<j;i++) 
           System.out.print(a[i]+" "); 
    } 
} 

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        if(size==1)
            return a[0];
        int cnt=1;
        int maj=a[0];
        for(int i=1;i<size;i++){
             if (a[i] == maj)
             {
                cnt++;
             } 
             else
             {
                cnt--;
             }

                if (cnt == 0) {
                    maj = a[i];
                    cnt = 1;
                }
        }
        int c=0;
        for(int i=0;i<size;i++)
            if(a[i]==maj)
                c++;
        if(c>size/2)
            return maj;
        return -1;
    
    }
}
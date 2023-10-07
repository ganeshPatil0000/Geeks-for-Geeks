//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[n];
            for(int i = 0;i < n;i++)
                arr[i] = Integer.parseInt(a[i]);
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i < n;i++)
                st.push(arr[i]);
            
            Solution ob = new Solution();
            Stack<Integer> ans = new Stack<>();
            ans = ob.deleteMid(n, st);
            while(!ans.empty()) {
                int x = ans.pop();
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        // code here
        int mid=(n+1)/2;
        st.remove(mid-1);
        return st;
        
    }
}
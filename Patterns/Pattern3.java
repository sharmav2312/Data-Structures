package Patterns;

import javax.swing.SortingFocusTraversalPolicy;

// Example 1:

// Input: 5

// Output:
// 1
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        pattern3(n);
    }

    private static void pattern3(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

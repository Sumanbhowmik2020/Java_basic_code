// Increasing Triangle pattern of Character:A's

// A
// A A
// A A A
// A A A A
// A A A A A


class IncreasingTriangleA{  
    public static void main(String args[]){  
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("A ");
            }
            System.out.println();
        }
    }  
}

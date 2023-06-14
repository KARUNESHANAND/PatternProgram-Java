//*  *  *  *
//*  *  *
//*  *
// *
public class Pattern3 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= (n + 1 - row) ; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
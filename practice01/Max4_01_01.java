package chap01.practice;

public class Max4_01_01 {
    
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max4(1,3,4,2) = " + max4(1,3,4,2));
    }
}

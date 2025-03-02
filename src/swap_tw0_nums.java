public class swap_tw0_nums {

    static void swapNum(int m,int v){
        int temp = m; // temp = 8
        m = v; // m=9
        v= temp; // v=8
        System.out.println( "value of m is " + m+ " value of v is " +v);
    }
    public static void main(String[] args) {
        int m=8;
        int v =9;
        swapNum(m,v);

    }
}



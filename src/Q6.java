public class Q6 {
    public static void main(String[] args) {
writeSequence(1);//test case. should be 1
System.out.println();
writeSequence(2);//test case. should be 11
System.out.println();
writeSequence(3);//test case. should be 212
System.out.println();
writeSequence(4);//test case. should be 2112
System.out.println();
writeSequence(5);//test case. should be 32123
System.out.println();
writeSequence(6);//test case. should be 321123
System.out.println();
writeSequence(7);//test case. should be 43211234
    }
    public static void writeSequence(int n){
        //base cases
        if (n == 1){
            System.out.print(1);
            return;
        }else if (n == 0){
            return;
        }

        System.out.print(Math.round((float)n/2));//Prints first half of the sequence
            writeSequence(n-2);//Prints the middle
        System.out.print(Math.round((float)n/2));//Prints second half of the sequence
    }
}

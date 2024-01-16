import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        //test cases
        showTwos(7);//should be 7 = 7
        showTwos(18);//should be 18 = 2 * 9
        showTwos(68);//should be 68 = 2 * 2 * 17
        showTwos(120);//should be 120 = 2 * 2 * 2 * 15
        showTwos(121);//should be 121 = 121
    }
    public static void showTwos(int x){
        StringBuilder toPrint = new StringBuilder();
        toPrint.append(x).append(" =");//appends "x ="

        //Counts how many twos fit into x.
        int twos = 0;
        int i = 2;
        while (x % i == 0){
            i*=2;
            twos++;
        }

        //appends *2 twos times, unless twos is 0.
        if (twos == 0){
            toPrint.append(" ").append(x);
        }else{
            String twoTimes = " 2 *".repeat(twos);
            toPrint.append(twoTimes).append(" ").append(x/(int) (Math.pow(2, twos)));
        }

        System.out.println(toPrint);//Prints the output
    }
}

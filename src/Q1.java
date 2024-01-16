public class Q1 {
    public static void main(String[] args) {
        System.out.println(averageLength(new String[]{"Four", "Fives", "SixSix", "Sevenns"}));//test case. (4+5+6+7)/4 should be 5.5
    }
    public static double averageLength(String[] strs){
        int totalLength = 0;//placeholder totalLength
        for (String str : strs){//Adds all the strings' lengths together
            totalLength += str.length();
        }
        return (double) totalLength/strs.length;//Returns the total length divided by the amount of the strings
    }
}

public class TwoSum {
    public int[] bruteSum(int[] num, int sum) { //takes array of numbers
        for (int i=0; i<num.length; i++) {
            for (int j=i+1; j<num.length; j++) {
                if (num[i] + num[j] == sum) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1}; // if there is no solution, then return -1
    }
    public static void main(String args[]) {
        int[] test = {3, 1, 2, 4, 7, 5, 6}; //testing array
        TwoSum TwoSum  = new TwoSum();

        int[] testAnswer =  TwoSum.bruteSum(test,4); // testing to see if there are 2 elements that add to 4
        System.out.print("Sum of 4 at: ");
        for (int index: testAnswer) {
            System.out.print(index + " "); //print out indexes of both numbers that add to sum
        }
        System.out.println();

        int[] testAnswer2 = TwoSum.bruteSum(test, 13); // testing to see if there are 2 elements that add to 13
        System.out.print("Sum of 13 at: ");
        for (int index: testAnswer2) {
            System.out.print(index + " "); //print out indexes of both numbers that add to sum
        }
        System.out.println();

        int[] testAnswer3 = TwoSum.bruteSum(test,200); // testing to see if there are 2 elements that add to 13
        System.out.print("Sum of 200 at: ");
        for (int index: testAnswer3) {
            System.out.print(index + " "); //print out indexes of both numbers that add to sum
        }
    }
}

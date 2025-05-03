import java.util.*;

public class IntegerAnalyzer {
    public static void main(String[] args) {
        // define an ArrayList
        ArrayList<Integer> myInts = new ArrayList<Integer>();
        int total = 0;
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            total += num;
            myInts.add(num);
        }
        
        double avg = total / 5.0;
        
        System.out.println("Integers: " + myInts);
        System.out.printf("Average: %.1f", avg);
        System.out.println();
        Collections.sort(myInts);
        System.out.println("Largest: " + myInts.get(myInts.size() - 1));
        System.out.println("Smallest: " + myInts.get(0));
        
    }
}
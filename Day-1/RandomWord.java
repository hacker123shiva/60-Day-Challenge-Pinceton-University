import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int count = 0;

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
            
            // Select the current word as the champion with probability 1/count
            if (StdRandom.bernoulli(1.0 / count)) {
                champion = word;
            }
        }

        StdOut.println(champion);
    }
}

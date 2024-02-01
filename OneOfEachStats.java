import java.util.Random;

public class OneOfEachStats {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);

        int sum = 0;
        int sum2child = 0;
        int sum3child = 0;
        int sum4child = 0;

        for (int i = 0; i < T; i++) {
            int sumforchild = 0;

            boolean girl = false;
            boolean boy = false;

            while (!boy || !girl) {
                double rand = generator.nextDouble();
                if (rand < 0.5) {
                    boy = true;
                } else {
                    girl = true;
                }
                sumforchild++;
            }

            sum += sumforchild;

            if (sumforchild == 2) {
                sum2child += 1;
            } else if (sumforchild == 3) {
                sum3child += 1;
            } else if (sumforchild >= 4) {
                sum4child += 1;
            }
        }

        double avg = (double) sum / T;
        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + sum2child);
        System.out.println("Number of families with 3 children: " + sum3child);
        System.out.println("Number of families with 4 or more children: " + sum4child);

        String common = "The most common number of children is ";
        int max = Math.max(Math.max(sum2child, sum3child),
                           sum4child);
        if (max == sum2child) {
            common = common + "2.";
        } else {
            if (max == sum3child) {
                common = common + "3.";
            } else {
                common = common + "4 or more.";
            }
        }
        System.out.println(common);


    }
}
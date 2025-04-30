package task5;

public class Task5 {

    public static int randomPrimeInRange(int min, int max) {
        if (min >= max) {
            return -1;  // invalid range
        }

        int candidate, factorCount;
        do {
            // generate a random number in [min, max]
            candidate = (int) (Math.random() * (max - min + 1)) + min;

            // count its factors up to 2 (early exit if more)
            factorCount = 0;
            for (int i = 1; i <= candidate; i++) {
                if (candidate % i == 0) {
                    factorCount++;
                    if (factorCount > 2) {
                        break;  // no longer prime
                    }
                }
            }
            // repeat until we find a number with exactly 2 factors
        } while (factorCount != 2);

        return candidate;
    }


    public static void main(String[] args) {
        System.out.println(randomPrimeInRange(10,20));
    }

}

package task6;

public class Task6 {

    public static void main(String[] args) {
        int[] counts = new int[21];
        for (int i = 0; i < 100; i++) {
            int randomNumber = randomInRange(0, 20);
            counts[randomNumber]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Number " + i + ": " + counts[i] + " times");
        }
    }

    public static int randomInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}

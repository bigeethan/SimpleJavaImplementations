public class Looping {
    public static void main(String[] args) {
        Looping looping = new Looping();
        looping.StringLoop();
        looping.AddNumbersLoop();
    }

    public void StringLoop() {
        String[] brokenSentence = {"Java", "is", "a", "great", "programming", "language"};
        System.out.println("Sentence:\n");
        for(int i = 0; i < brokenSentence.length; i++) {
            System.out.println(brokenSentence[i]);
        }
    }

    public void AddNumbersLoop() {
        int[] numbers = {10, 15, 2, 8, 4, 7, 3, 9, 31};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("\nSum: " + sum);
    }
}

public class Conditionals {
    public static void main(String[] args) {
        String word = "word";
        int number = 1;
        double decimal = 1.2;
        boolean bool = true;

        if (word == "word") {
            System.out.println("Word: " + word);
        } else {
            System.out.println("Word: nothing");
        }

        if (number == 1 && decimal == 1.2) {
            System.out.println("Int: " + number + "\nDecimal: " + decimal);
        }

        if (bool != false || decimal < 1) {
            System.out.println("Bool: " + bool);
        }
    }
}
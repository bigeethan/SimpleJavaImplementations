public class Inheritance extends Parent {
    public static void main(String[] args) {
        Inheritance child = new Inheritance();

        child.printWord();
    }
}

public class Parent {
    protected String sentence = "hello world";
    public void printWord() {
        System.out.println(sentence);
    }
}
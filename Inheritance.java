public class Inheritance extends Parent {
    public static void main(String[] args) {
        Inheritance child = new Inheritance();

        child.printWord();
        
        child.sentence = "hello world 2";
        System.out.println(child.sentence);
    }
}

public class Parent {
    protected String sentence = "hello world";
    public void printWord() {
        System.out.println(sentence);
    }
}

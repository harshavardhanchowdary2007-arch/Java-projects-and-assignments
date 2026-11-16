class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class Q30 extends Animal {
    public static void main(String[] args) {
        Q30 obj = new Q30();
        obj.eat();
    }
}

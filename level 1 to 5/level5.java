abstract class Level5 {

    public abstract void add();
}

class B extends Level5 {

    public void add() {
        int a = 20, b = 30;
        int sum = a + b;
        System.out.println(sum);
    }
}

class C {
    public static void main(String[] args) {
        B a1 = new B();
        a1.add();
    }
}

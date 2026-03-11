public class calculator {
    void add (){
        int a = 5, b = 10, sum;
        sum = a + b;
        System.out.println(sum);
    }
    void sub (){
        int a = 10, b = 40, sub;
        sub = a-b ;
        System.out.println(sub);

    }
      void mul (){
        int a = 5, b = 10, mul;
        mul = a * b;
        System.out.println(mul);
    }
     void div (){
        int a = 10, b = 2, div;
        div = a / b;
        System.out.println(div);
    }
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }
}

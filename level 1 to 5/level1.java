public class level1 {
    int x,y;
    level1(int a, int b){
        x=a;
        y=b;
    }
    void add(){
        int sum = 0;
        sum = x + y;
        System.out.println(sum);
    }
    public static void main(String[] args){
        level1 a1 = new level1(10,20);
        a1.add();
    }
}

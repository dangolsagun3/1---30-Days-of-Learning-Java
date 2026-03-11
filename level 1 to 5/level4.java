public class level4 {
    int age;
    level4(int age){
        this.age = age;
    }
    void age(){
        System.out.println(age);
    }
    public static void main(String[] args) {
        level4 l1 = new level4(20);
        l1.age();
    }
}

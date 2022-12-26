public class test {
    public static void main(String[] args) {
        dostuff();
    }
    static void dostuff(){
        domorestuff();
    }
    static void domorestuff(){
        System.out.println(10/0);
    }
}
// super method - to invoke immediate parent class constructor.

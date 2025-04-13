public class methodCallStatement {

    void method1(){
        System.out.println("This is method 1");
    }
    void method2(){
        System.out.println("This is method 2");
        method1();
    }
    public static void main(String[] args) {
        methodCallStatement obj = new methodCallStatement();
        System.out.println("Calling method 1 through method 2");
        obj.method2();
    }
}

public class methodsJava {
    public static int sum(int a, int b){
        return (a+b);
    }

     void printS(){
        System.out.println("Hii from method");
    }
    public static void main(String[] args) {
        methodsJava obj = new methodsJava();
        // System.out.println("The sum is "+sum(2,5));
        System.out.println("Hii from main");
        obj.printS();
    }
}

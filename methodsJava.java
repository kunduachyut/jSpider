public class methodsJava {
    public static int sum(int a, int b){
        return (a+b);
    }

     void printS(){
        System.out.println("Hii i'm method");
    }
    public static void main(String[] args) {
        methodsJava obj = new methodsJava();
        System.out.println("The sum is "+sum(2,5));
        obj.printS();
    }
}

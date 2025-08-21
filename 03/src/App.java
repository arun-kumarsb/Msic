import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // Switch Statements
        Scanner in = new Scanner(System.in);
        String fruit = in.next();


        // String a = "Arun";
        // String b = "Arun";
        // // here a and b are pointing to same object arun
        // System.out.println(a==b);
        // // if a is pointing some kunal
        // // and b is pointing to some other object kunal then == may give false
        // // therefore we will use var.equals("kumal");
        // // if (fruit == "mango"){

        // // }


        // if (fruit.equals("mango")){
        //     System.out.println("King Of Fruits");
        // }
        // if (fruit.equals("apple")) {
        //     System.out.println("A red fruit");
        // }

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple" :
                System.out.println("A Red Fruit");
                
            default:
                break;
        }
        in.close();
    }
}

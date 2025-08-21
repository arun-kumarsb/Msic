package com.arun;

public class F5_PassingExample {
    public static void main(String[] args) {
        String name = "Arun";
        ChangeName(name);
        System.out.println(name);
    }
    public static void ChangeName(String str){
        str = "Kunal"; // creating a new object
    }

    // name ---> Arun
    // str  ---> Arun {inside function}
    // 
    // name ---> Arun
    // str  ---> Kunal 
    // in main function only arun is printing even after the name or arun is passed through changeName function 
    // because we are not updating the name variable but we are passing the copy of the value of refrence variable thus we are creting a new object to str varavible in function




    // primitives      
}

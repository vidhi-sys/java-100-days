//Write a Java program to create a class called Product with private instance variables
// productName, productCode, and price. Provide public getter and setter methods to access and modify these 
//variables. Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.
class product{
    private String product_name;
    private int product_code;
    private int product_price;
    public void get_value(String name,int code,int price){
        this.product_name= name;
        this.product_code=code;
        this.product_price=price;

    }
    public void set_value(){
        System.out.println(product_name);
        System.out.println(product_code);
        System.out.println(product_price);
    }
    public void applydiscount(){
        //let discount=20%
        int reduce=((product_price*20)/100);
        product_price=(product_price-reduce);
        System.out.println("discounter price after 20% off:" + product_price);
    }
}

public class encapsulation_2 {
    public static void main(String[] args) {
        product p= new product();
        p.get_value("sweater",2121,3000);
        p.set_value();
        p.applydiscount();
        
    }
    
}

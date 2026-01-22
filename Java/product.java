class product
{
    int pcode;
    String pname;
    int price;
    product(int code,String name,int pr)
    {
        pcode=code;
        pname=name;
        price=pr;
    }
void display()
{
    System.out.println("Product Code:" +pcode);
    System.out.println("Product Name:" +pname);
    System.out.println("Price:" +price);
    System.out.println("__________________________________________");
}
public static void main(String args[])
{
    product p1=new product(101,"LAPTOP",50000);
    product p2=new product(102,"Phone",35000);
    product p3= new product(103,"Smart watch",5000);

product lowest = p1;

    
        if (p2.price < lowest.price)
            lowest = p2;

        if (p3.price < lowest.price)
            lowest = p3;

      
        System.out.println("All Products:");
        p1.display();
        p2.display();
        p3.display();

        // Display lowest price product
        System.out.println("✅ Product with Lowest Price:");
        lowest.display();
    }



}
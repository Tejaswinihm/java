public class demo {
    public static void main(String[] args) {
        Squre squre=new Squre();
        Triangle triangle=new Triangle();
        Circle circle=new Circle();
        squre.getdata((float)5.5);
    System.out.println("The area of Square is:"+squre.area());
    triangle.getdata((double)10.3,(double)20.5);
    System.out.println("The area of Triangle is:"+triangle.area());
    circle.getdata((double)7.8);
    System.out.println("The area of Circle is:"+circle.area());
   }
}


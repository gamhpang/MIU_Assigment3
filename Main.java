import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String userInput = input.next();

        if(userInput.equals("C")){
            System.out.println("Enter the radius of the Circle");
            double radius = input.nextDouble();
            Circle c = new Circle(radius);
            System.out.println("The area of Cirlce is : "+c.getArea());
        }
        else if(userInput.equals("R")){
            System.out.println("Enter the width of the Rectangle");
            double width = input.nextDouble();
            System.out.println("Enter the height of the Rectangle");
            double height = input.nextDouble();
            Rectangle r = new Rectangle(width,height);
            System.out.println("The area of Rectangle is : "+r.getArea());
        }
        else if(userInput.equals("T")){
            System.out.println("Enter the base of the Triangle");
            double base = input.nextDouble();
            System.out.println("Enter the height of the Triangle");
            double height = input.nextDouble();
            Triangle t = new Triangle(base,height);
            System.out.println("The area of Triangle is : "+t.getArea());
        }

        input.close();

    }
}


class Triangle{
    private final double base;
    private  final double height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return 1/2.0 * base * height;
    }
}

class Rectangle{
    private final double width;
    private  final double length;
    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return  width*length;
    }
}

class Circle{
    private final double radius;
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return  Math.PI*radius*radius;
    }
}
import java.util.Scanner;
public class AreaCalculator {

    public static double AreaCirlce(double radius) {
        return Math.PI *radius *radius;
        
    }

    public static double AreaRectangle(double length, double width){
        return length * width;
    }

    public double AreaSquare(double side){
        return side * side;
    }

    public static double AreaTriangle(double base, double heigth){
        return 0.5 * base * heigth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the AreaOfCircle:");
        double radius = sc.nextDouble();
        System.out.println("Area of the Circle is:" +AreaCirlce(radius));

        System.out.println("Enter the Length");
        double length = sc.nextDouble();
        System.out.println("Enter the Width");
        double width = sc.nextDouble();
        System.out.println("Area of the Rectangle is: "+AreaRectangle(length, width));

        System.out.println("Enter the side:");
        double side = sc.nextDouble();
        AreaCalculator ars = new AreaCalculator();
        System.out.println("Area of the Square is: " +ars.AreaSquare(side));

        System.out.println("Enter the Triangle Base:");
        double base = sc.nextDouble();
        System.out.println("Enter the Triangle Heigth:");
        double heigth = sc.nextDouble();
        System.out.println("Area of the Triange is: "+AreaTriangle(base, heigth));
    }

    
}

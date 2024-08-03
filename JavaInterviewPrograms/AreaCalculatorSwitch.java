import java.util.Scanner;
public class AreaCalculatorSwitch {

    public static double AreaCirlce(double radius) {
        return Math.PI *radius *radius;
        
    }

    public static double AreaRectangle(double length, double width){
        return length * width;
    }

    public static double AreaSquare(double side){
        return side * side;
    }

    public static double AreaTriangle(double base, double heigth){
        return 0.5 * base * heigth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the choice:");
        System.out.println(" Area Of Circle: 1\n Area of Rectangle: 2\n Area of Square: 3\n Area of Triangle: 4");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:System.out.println("Enter the AreaOfCircle:");
            double radius = sc.nextDouble();
            System.out.println("Area of the Circle is:" +AreaCirlce(radius));
                 break;

            case 2:System.out.println("Enter the Length");
            double length = sc.nextDouble();
            System.out.println("Enter the Width");
            double width = sc.nextDouble();
            System.out.println("Area of the Rectangle is: "+AreaRectangle(length, width));
                break;

            case 3:System.out.println("Enter the side:");
            double side = sc.nextDouble();
            System.out.println("Area of the Square is: " +AreaSquare(side));
                break;

            case 4:System.out.println("Enter the Triangle Base:");
            double base = sc.nextDouble();
            System.out.println("Enter the Triangle Heigth:");
            double heigth = sc.nextDouble();
            System.out.println("Area of the Triange is: "+AreaTriangle(base, heigth));
        
            default:
                break;
        }

    
}
}

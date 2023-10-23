import java.util.Scanner;

public class AreaofShapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double area = 0;

        while (true) {
            System.out.print("Enter the shape (circle, triangle, rectangle, isosceles_triangle, parallelogram, rhombus, equilateral_triangle, close): ");
            String shape = in.next();

            if (shape.equals("circle")) {
                System.out.print("Enter the radius of the circle: ");
                double radius = in.nextDouble();
                area = Math.PI * radius * radius;
            } else if (shape.equals("triangle")) {
                System.out.print("Enter the length of base: ");
                double base = in.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = in.nextDouble();
                area = 0.5 * base * height;
            } else if (shape.equals("rectangle")) {
                System.out.print("Enter the length of the rectangle: ");
                double length = in.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = in.nextDouble();
                area = length * width;
            } else if (shape.equals("isosceles_triangle")) {
                System.out.print("Enter the base of the isosceles triangle: ");
                double base = in.nextDouble();
                System.out.print("Enter the side of the isosceles triangle: ");
                double side = in.nextDouble();
                System.out.print("Enter the height of the isosceles triangle: ");
                double height = in.nextDouble();
                area = 0.5 * base * height + (base * (Math.sqrt((side * side) - (base * base))) / 2);
            } else if (shape.equals("parallelogram")) {
                System.out.print("Enter the base of the parallelogram: ");
                double base = in.nextDouble();
                System.out.print("Enter the height of the parallelogram: ");
                double height = in.nextDouble();
                area = base * height;
            } else if (shape.equals("rhombus")) {
                System.out.print("Enter the first diagonal of the rhombus: ");
                double diagonal1 = in.nextDouble();
                System.out.print("Enter the second diagonal of the rhombus: ");
                double diagonal2 = in.nextDouble();
                area = (diagonal1 * diagonal2) / 2;
            } else if (shape.equals("equilateral_triangle")) {
                System.out.print("Enter the side length of the equilateral triangle: ");
                double side = in.nextDouble();
                area = (Math.sqrt(3) / 4) * side * side;
            } else if (shape.equals("close")) {
                break;
            } else {
                System.out.println("Invalid shape.");
            }

            System.out.println("Area: " + area);
        }
    }
}

//To compare the content of two strings, you should use the equals method.

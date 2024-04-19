package Herencia;

import java.util.Scanner;

// Interfaz Shape
interface Shape {
    double getArea();
    double getPerimeter();
}

// Clase Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Clase Triangle
class Triangle implements Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

// Clase Square
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al calculador de áreas y perímetros de figuras geométricas.");
        Shape shape = selectShape(scanner);
        int propertyChoice = selectProperty(scanner);

        if (propertyChoice == 1) {
            System.out.println("El área de la figura seleccionada es: " + shape.getArea());
        } else if (propertyChoice == 2) {
            System.out.println("El perímetro de la figura seleccionada es: " + shape.getPerimeter());
        } else {
            System.out.println("Opción inválida. Por favor, seleccione 1 o 2.");
        }

        scanner.close();
    }

    public static Shape selectShape(Scanner scanner) {
        System.out.println("Seleccione la figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Cuadrado");
        int choice = scanner.nextInt();
        double side1, side2, side3, radius;
        switch (choice) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                radius = scanner.nextDouble();
                return new Circle(radius);
            case 2:
                System.out.print("Ingrese la longitud del primer lado del triángulo: ");
                side1 = scanner.nextDouble();
                System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
                side2 = scanner.nextDouble();
                System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
                side3 = scanner.nextDouble();
                return new Triangle(side1, side2, side3);
            case 3:
                System.out.print("Ingrese la longitud del lado del cuadrado: ");
                double side = scanner.nextDouble();
                return new Square(side);
            default:
                System.out.println("Opción inválida. Por favor, seleccione 1, 2 o 3.");
                return selectShape(scanner);
        }
    }

    public static int selectProperty(Scanner scanner) {
        System.out.println("Seleccione la propiedad a calcular:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        return scanner.nextInt();
    }
}

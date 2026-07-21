package objectOrientedProgramming;


import objectOrientedProgramming.utilityClasses.Circle;
import objectOrientedProgramming.utilityClasses.Rectangle;
import objectOrientedProgramming.utilityClasses.Shape;
import objectOrientedProgramming.utilityClasses.Triangle;

public class Abstraction {
    public static void main(String[] args) {
        // abstract => used to define abstract classes and methods
        //             Abstraction is process of hiding implementation details and showing only essential features;
        //             abstract classes CAN'T be instantiated directly
        //             can contain 'abstract' methods (which must be implemented)
        //             can contain 'concrete' methods (which are inherited)


        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(5,6);


        circle.display();
        triangle.display();
        rectangle.display();


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}

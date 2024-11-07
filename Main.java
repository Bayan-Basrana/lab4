//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(8.5);
        System.out.printf(" The Area of the circle with "+
                circle.getRadius()+ " radius = %.2f\n" ,circle.calculateArea());
        System.out.printf(" The Circumference of the circle with "+
                circle.getRadius()+ " radius =  %.2f\n" ,circle.calculateArea());
        System.out.println("*************************");

        Rectangle rectangle= new Rectangle(2,4);
        System.out.println(" The Area of the rectangle with height="+ rectangle.getHeight()+ ". & width="
                +rectangle.getWidth()+ " is: "+ rectangle.calculateArea());
        System.out.println(" The perimeter of the rectangle with height="+ rectangle.getHeight()+ ". & width="
                +rectangle.getWidth()+ " is: "+ rectangle.calculateCircumference());
        System.out.println("*************************");

      Triangle triangle= new Triangle(4,4)  ;
        System.out.println(" The Area of the triangle with height="+ triangle.getHeight()+ ". & base="
                +triangle.getBase()+ " is: "+ triangle.calculateArea());
        System.out.println(" The perimeter of the triangle with height="+ triangle.getHeight()+ ". & base="
                +triangle.getBase()+ " is: "+ triangle.calculateCircumference());

    }
}
import java.util.Random;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        Random random = new Random();
        double percent = random.nextInt(100);
        System.out.println(percent);

        shape[0]=new Circle(3.0);
        Circle shape1=(Circle)shape[0];
        shape1.reSize(percent);

        shape[1]=new Rectangle(5.0,9.0);
        Rectangle shape2=(Rectangle)shape[1];
        shape2.reSize(percent);

        shape[2]=new Square(5.0);
        Square shape3=(Square)shape[2];
        shape3.reSize(percent);

        for (Shape value:shape){
            System.out.println(value);
        }


    }
}

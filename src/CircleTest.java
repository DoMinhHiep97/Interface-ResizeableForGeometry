import java.util.Random;

public class CircleTest {
    public static void main(String[] args){
        Circle[] circle=new Circle[4];
        //System.out.println(circle);

        circle[0]=new Circle(3.5);
        //System.out.println(circle);

        circle[1]=new Circle(3.5,"indigo",false);
        //System.out.println(circle);

        Random random=new Random();
        double percent= random.nextInt(100);
        circle[2]=new Circle(3.0);
        circle[2].reSize(percent);
        for (Circle circle1:circle)
        System.out.println(circle1);
    }
}

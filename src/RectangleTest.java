import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangle=new Rectangle[3];


        rectangle[0]=new Rectangle(2.3, 5.8);


        rectangle[1]=new Rectangle(2.5,3.8,"orange",true);

        Random random=new Random();
        double percent=random.nextInt(100);
        rectangle[2]=new Rectangle(5.4,6.5);
        rectangle[2].reSize(percent);

        for (Rectangle rectangle1:rectangle){
            System.out.println(rectangle1);
        }
    }
}

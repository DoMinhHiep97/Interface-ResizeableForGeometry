public class Circle extends Shape implements Resizeable {
    private double radius=1.0;

    Circle(){

    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    private double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public void reSize(double percent){
        this.radius=getRadius()*percent/100;
    }
    @Override
    public String toString(){
        return "A Circle with radius="+getRadius()+",Area:"+getArea()+",which is a subclass of"+super.toString();
    }
}

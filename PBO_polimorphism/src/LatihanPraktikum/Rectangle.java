package LatihanPraktikum;
public class Rectangle extends Shape{
    // private member variables
    private int length;
    private int width;
    // constructor
    public Rectangle(String color, int length , int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public String toString(){
        return "Rectangle[length = " + length + ",width = " + width + "," + super.toString() + "]";
    }
    // override the inherited getArea() to provide the proper implementation
    
    public double getArea(){
        return length*width;
    }
}

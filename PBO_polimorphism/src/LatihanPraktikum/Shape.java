package LatihanPraktikum;
public class Shape {
    //private member variable
    private String color;
    //constructor
    public Shape (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[Color = "+ color + "]";
    }
    //all shapes must have a method called getArea().
    public double getArea(){
        //we need to treturn some value t compile the program.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}

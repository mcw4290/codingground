public class Circle extends TwoDimensionalShape
{
    public Circle(int x, int y, double radius)
    {
        super(x, y, radius, radius);
    } //constructor
    public String getName() {return "Circle";}
    public double area()
    {
        return Math.PI * super.getDimension1() * super.getDimension1();
    }
    public void setRadius(double radius) {super.setDimension1(radius);}
    public double getRadius() {return super.getDimension1();}
    public String toString()
    {
        return getName() + " Mun Chan Woo 12151553";
    }
}
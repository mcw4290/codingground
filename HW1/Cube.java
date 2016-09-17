public class Cube extends ThreeDimensionalShape
{
    public Cube(int x, int y, double radius)
    {
        super(x, y, radius, radius, radius);
    } //constructor
    public String getName() {return "Cube";}
    public double area()
    {
        return 6 * super.getDimension1() * super.getDimension1();
    }
    public double volume()
    {
        return super.getDimension1() * super.getDimension1()
        * super.getDimension1();
    }
    public void setSide(double side) {super.setDimension1(side);}
    public double getSide() {return super.getDimension1();}
    public String toString()
    {
        return getName() + " Mun Chan Woo 12151553";
    }
}
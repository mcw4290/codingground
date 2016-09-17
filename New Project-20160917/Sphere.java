public class Sphere extends ThreeDimensionalShape
{
    public Sphere(int x, int y, double radius)
    {
        super(x, y, radius, radius, radius);
    } //constructor
    public String getName() {return "Sphere";}
    public double area()
    {
        return 4 * Math.PI * super.getDimension1() * super.getDimension1();
    }
    public double volume()
    {
        return 4 * Math.PI * super.getDimension1() * super.getDimension1()
        * super.getDimension1() / 3.0;
    }
    public void setRadius(double radius) {super.setDimension1(radius);}
    public double getRadius() {return super.getDimension1();}
    public String toString()
    {
        return getName() + " Mun Chan Woo 12151553";
    }
}
public class Square extends TwoDimensionalShape
{
    public Square(int x, int y, double side)
    {
        super(x, y, side, side);
    } //constructor
    public String getName() {return "Square";}
    public double area()
    {
        return super.getDimension1() * super.getDimension1();
    }
    public void setSide(double side) {super.setDimension1(side);}
    public double getSide() {return super.getDimension1();}
    public String toString()
    {
        return getName() + " Mun Chan Woo 12151553";
    }
}
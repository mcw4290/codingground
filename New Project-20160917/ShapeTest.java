public class ShapeTest{
    private Shape shapeArray[];
    public ShapeTest()
    {
        shapeArray = new Shape[4];
        shapeArray[0] = new Circle(22, 88, 1.25);
        shapeArray[1] = new Square(71, 96, 2.5);
        shapeArray[2] = new Sphere(8, 89, 3.75);
        shapeArray[3] = new Cube(79, 61, 5.0);
    } //constructor
    public void displayShapeInfo()
    {
        for(int i = 0; i < shapeArray.length; i++)
        {
            if(shapeArray[i] instanceof TwoDimensionalShape)
            {
                TwoDimensionalShape current = (TwoDimensionalShape) shapeArray[i];
                System.out.println(current.toString());
                System.out.printf("%s's area is %.2f\n", current.getName(), current.area());
            }
            if(shapeArray[i] instanceof ThreeDimensionalShape)
            {
                ThreeDimensionalShape current = (ThreeDimensionalShape) shapeArray[i];
                System.out.println(current.toString());
                System.out.printf("%s's area is %.2f\n%s's volume is %.2f\n", 
                current.getName(), current.area(), current.getName(), current.volume());
            }
        }
    } //displayShapeInfo
    public static void main(String args[])
    {
        ShapeTest s = new ShapeTest();
        s.displayShapeInfo();
    } //main
}

public abstract class Shape
{
    //private
    private int x, y;
    //public
    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    } //constructor
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public int getX() {return x;}
    public int getY() {return y;}
    public abstract String getName();
    public abstract String toString();
    
    public boolean equals(Object obj)
    {
        if(obj == null || !Shape.class.isAssignableFrom(obj.getClass()))
            return false;
        final Shape s = (Shape) obj;
        if(this.x == s.x && this.y == s.y)
            return true;
        else
            return false;
    }
}
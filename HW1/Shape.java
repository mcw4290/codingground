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
        if(obj == null || !(obj instanceof Shape))
            return false;
        final Shape s = (Shape) obj;
        if(this.x == s.x && this.y == s.y)
            return true;
        else
            return false;
    }
    public int hashCode()
    {
        int hash = 31;
        hash = hash * 41 + getX();
        hash = hash * 41 + getY();
        return hash;
    }
}
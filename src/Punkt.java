class Punkt
{
    double x;
    double y;

    Punkt(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    void przesun(double dx,double dy){
        this.x +=dx;
        this.y +=dy;
    }

    public String toString()
    {
        return "[x: "+x+", y: "+y+"]";
    }
}
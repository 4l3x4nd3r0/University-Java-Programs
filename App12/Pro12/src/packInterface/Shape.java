package packInterface;

public abstract class Shape {
    static boolean printAreaandPerimeter = true;
    private String name = "Generic";

    public void setName(String s) {
        name = s;
    }
    
    public String getName() {
        return name;
    }
    
    abstract public double Perimeter();

    abstract public double Area();

    abstract public String toString();
}

class Polygon
{
	public Polygon()
	{
		this("polysides");
		System.out.println("closed");
		this.info();
	}
	void info()
	{
		System.out.println("more than one side");
	}
	public Polygon(String s)
	{
		System.out.println("container");
	}
}
class Square extends Polygon
{
	public Square()
	{
		this("square");
	System.out.println("equal");
	}
    public Square(String s)
    {
    	System.out.println("all equal");
    }
 }
public class ConstructorExe 
{
	public static void main(String[] args) 
	{
     new Square();

	}

}

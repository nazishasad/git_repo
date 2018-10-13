public class Point 
{
	private int x;
	private int y;
	public Point(int x,int y) 
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() 
	{
		return "("+x+","+y+")";
	}
	public static void main(String ... args) 
	{
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		System.out.println(p1);
		System.out.println(p1.equals(p2));
	}	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj != null)
		{
			if(obj instanceof Point) 
			{
				Point that = (Point) obj;
				if(this == that) 
				{
					return true;
				}
				if(this.x == that.x && this.y == that.y) 
				{
					return true;
				}
			}
			return false;
		}
		return false;
	}
	@Override
	public int hashCode()
	{
		int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
	}
}
package com.clonning;

class PointOne
{
    private Integer x;
    private Integer y;
 
    public PointOne(PointOne point){
        this.x = point.x;
        this.y = point.y;
    }

	public PointOne(int i, int j) {
		// TODO Auto-generated constructor stub
	}
}

class PointTwo extends PointOne
{
    private Integer z;
 
    public PointTwo(PointTwo point){
        super(point); //Call Super class constructor here
        this.z = point.z;
    }

	public PointTwo(int i, int j, int k) {
		super(i, j);
		this.z = k;
		// TODO Auto-generated constructor stub
	}
}

public class Test
{
    public static void main(String[] args)
    {
        PointOne one = new PointOne(1,2);
        PointTwo two = new PointTwo(1,2,3);
 
        PointOne clone1 = new PointOne(two);
        PointOne clone2 = new PointTwo(two);
 
        //Let check for class types
        System.out.println(clone1.getClass());
        System.out.println(clone2.getClass());
    }
}
 

package AreaOfCircle;

public class AreaOfCircle {
	private double r,a;
	public AreaOfCircle() {
		r=10;
	}
	public void find() {
		a=3.14*r*r;
	}
    public void display() {
    	System.out.println(a);
    }
}

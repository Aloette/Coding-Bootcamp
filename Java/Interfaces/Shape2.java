
public class Shape2 implements Agreeable {
	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	Shape2() {
		
	}
	
	Shape2(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public int calcArea() {
		
		return width*height;
		
	}
	
	public boolean isSmallerThan(Agreeable other) {
		
		Shape2 new_other = (Shape2) other;  
		return (this.calcArea() > new_other.calcArea());
		
	}
	
}

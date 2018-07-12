/**
 * 
 * 
 */
package chapter9;

public class Cicrle {
	private int x;
	private int y;
	private int r;
	/**
	 * @param x, the x-coordinate of the center.
	 * @param y, the y- coordinate of the center.
	 * @param r, the radius of the circle.
	 */
	public Cicrle(int x, int y, int r) {
		if (r<0) { throw new IllegalArgumentException("\ncircle's radius cannot be nagative."); 
		
		}
		this.x = x;
		this.y = y;
		this.r = r;
	}
	/**
	 * @return the x, get the x-coordinate of the center
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x set the x-coordinate of the center
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y, get the y-coordinate of the center
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y set the y-coordinate of the center
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the radius of the circle
	 */
	public int getRadius() {
		return r;
	}
	/**
	 * @param r set the radius of the circle
	 */
	public void setRadius(int r) {
		if (r<0) { throw new IllegalArgumentException(); 
		}
		this.r = r;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cicrle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}
	
	
	
	
}

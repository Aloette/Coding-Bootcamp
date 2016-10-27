import java.lang.*;
import java.util.*;

    public class Circle {

		 private int x;
		 private int y;
		 private int r;
		 static final Double p=3.14;

           // Constructor
		   Circle() {
		      this.x = 0;
		      this.y = 0;
		      this.r = 0;
		      }

		   // Overloaded Constructor 1
		   Circle(int x, int y) {
			   this.x = x;
			   this.y = y;
	       }

		   // Overloaded Constructor 2
		   Circle(int x, int y, int r) {
			   this.x = x;
			   this.y = y;
			   this.r = r;
		   }

		   // method 'print'
		   public void Print() {
			   System.out.println("I'm a circle at point " + x + "," + y + " with radius " + r);}

		   // pairno ta x, y, r
		   public int getX() {
			   return x;}
		   public int getY() {
			   return y;}
		   public int getR() {
			   return r;}

           // dino timi sta x, y, r
		   public void setX(int x) {
			   this.x=x;}
		   public void setY(int y) {
			   this.y=y;}
		   public void setR(int r) {
			   this.r=r;}

		   // ftiaxno mia methodo "calculateArea"
		   public Double calculateArea(int r) {
			   return(this.p*r*r);

		   }

		   // ftiaxno mia methodo "calculatePerimeter"
           public Double calculatePerimeter(int r) {
			   return(2*this.p*r);
		   }

}


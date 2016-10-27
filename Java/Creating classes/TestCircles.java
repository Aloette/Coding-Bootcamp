import java.lang.*;
import java.util.*;

    public class TestCircles {

		public static void main(String[] args){
			Circle c = new Circle(); // ftiaksame ena antikeimeno c typou Circle

			c.setX(5);
			c.setY(6);
			c.setR(3);
			c.Print();

			Circle d = new Circle(2,3); // ftiaxno ki allo object
			d.Print();

			Circle e = new Circle(4,5,6); // ki allo object
			e.Print();

		}
}
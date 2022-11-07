abstract class CShape {
	protected String color;
	public CShape(String str) {
		color = str;
	}
	public abstract void show();
   	}
class CRectangle extends CShape {
	int width, height;
	public CRectangle(int w, int h) {
		super("Black");
		width = w;
		height = h;
	}
	public void show() {
		System.out.print("color = " + color);
		System.out.println(", area = " + width * height);
	}
}
class CCircle extends CShape {
	double radius;
	public CCircle(double r) {
		super("White");
		radius = r;
	}
	public void show() {
		System.out.print("color = " + color);
		System.out.println(", area = " + 3.14 * radius * radius);
	}
}
public class Main {
	public static void main(String args[]) {
		CRectangle R = new CRectangle(3, 4);
		R.show();
		CCircle C = new CCircle(10);
		C.show();
   }
}

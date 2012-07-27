
public class MatchBox extends Box {

	double weight;
	MatchBox() {
	}
	MatchBox(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}
	public static void main(String args[]) {
		MatchBox mb1 = new MatchBox(10, 10, 10, 10);
		mb1.getVolume();
		System.out.println("width of MatchBox 1 is " + mb1.width);
		System.out.println("height of MatchBox 1 is " + mb1.height);
		System.out.println("depth of MatchBox 1 is " + mb1.depth);
		System.out.println("weight of MatchBox 1 is " + mb1.weight);
	}
}
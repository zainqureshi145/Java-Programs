
class Box {

	double width;
	double height;
	double depth;
	Box() {
	}
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	void getVolume() {
		System.out.println("Volume is : " + width * height * depth);
	}
}


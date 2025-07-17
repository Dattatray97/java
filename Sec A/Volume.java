class Calculate{
	double w = 100;
	double h = 100;
	double d = 100;
	void Volume(double w, double h, double d){
		double volume = w*h *d;
		System.out.println(volume);
		
	}
	public static void main(String [] args){
		Calculate obj = new Calculate();
		obj.Volume();
	}
}

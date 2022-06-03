class C5CarColor{

	private String color = "";

	public void setColor(String c){
		color = c;
	}

	public String getColor(){
		return color;

	}

	public static void main(String[] args) {
		C5CarColor color1 = new C5CarColor();
		color1.setColor("blue");
		System.out.println("Color 1:"+ color1.getColor());
		C5CarColor color2 = color1;
		System.out.println("Color 2:"+ color2.getColor());
		color2.setColor("red");
		System.out.println("Color 2:"+ color2.getColor());
		System.out.println("Color 1:"+ color1.getColor());
	}
}
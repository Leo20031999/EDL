public class Circle{
	float raio;
	public Circle(float raio){
		this.raio=raio;
	}
	float area(){
		return (this.raio)*(float)3.14;
	}
	public static void main(String args[]){
		Circle c=new Circle((float)4.3);
		System.out.println("Raio: " + c.area());
	}
}
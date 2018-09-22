package pkgHelper;

public class CarPayment {
	private double IntrestRate;
	private int lLength;
	private double cost;
	private double down;
	
	public CarPayment(double c, double d, int l, double i){
		this.IntrestRate = i;
		this.lLength = l;
		this.cost = c;
		this.down = d;
	}
	public double monthlyPayment() {
		double answer = 0;
		answer = (IntrestRate / 12 * (cost -down))/(1-Math.pow((1+IntrestRate/12),-lLength));
		return answer;
	}
	public double totalIntrest() {
		double answer =0;
		answer = lLength * monthlyPayment()-(cost-down) ;
		return answer;
	}
	public String toString() {
		return "Car Payment\nTotal Cost: "+String.format("%.2f",cost)+"\nDown Payment: "+String.format("%.2f",down)+
				"\nLoan Length: "+lLength+"\nIntrest Rate: "+String.format("%.2f",IntrestRate)+"\n\nPayment Info\n"
						+ "Monthly Intrest Payment: "+String.format("%.2f",monthlyPayment())+"\nTotal Intrest Payment: "+String.format("%.2f",totalIntrest());
						
	}
}
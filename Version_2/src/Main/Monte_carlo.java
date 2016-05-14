package Main;
/*
 * Assuming the neutron interacts with hydrogen (because they are both massive), they "interact by different mechanisms depending on the neutron
 *  energy and the material of the absorver
 *  
 *  Scattering: - Elastic and -inelastic - Faster neutrons
 *  Capture: Gets sucked in and produces another molecule - Slower neutrons
 *  
 *  Neutron Cross Section = 1 barn = 10^-24 cm^2
 *  Hydrogen Cross Section = 0.33 barns = .33 x 10^-24 cm^2
 *  
 * 	"Total cross sections for neutrons with hydrogen as a function of energy ... 
 * 	are elastic scatter (predominantly) and neutron capture ( a - 0.33 barns at thermal neutron energy)."
 * 
 * 	"Elastic scatter: The most important process for slowing down of neutrons."
 * 					* Energy is conserved * E_max = head-on collision
 * 
 * 	Q_max = (4mME_n)/(M+m)^2; Q_max/E_n of Neutron colliding with Hydrogen (2,1) = 0.889
 * 
 * 	"Neutron capture: leads to the disappearance of the neutron ... the hydrogen capture reaction is the major contributor to dose in tissue from thermal neutrons."
 * 
 * 	Question: How far can a neutron travel before it gets absorbed or depart the material?
 * 
 * 	I(x) = I(0)*e^(-E_i*x); I(x) = number of survived neutrons after traveling x distance; E_i = Probability of some interaction per unit path length
 */


public class Monte_carlo {
	
	/**
	 * 
	 * @param i = initial value of neutron [number/time]; I(o)
	 * @param e = probability of interaction per unit path length [1/distance]; E_i 
	 * @param x = distance of the neutron [distance]; x
	 * @return -> number of survived neutrons a distance x into the material [number/time]
	 */
	public static double survivalCalculator(double i, double e, double x){
		double I = 0; // I(x)
		I = i * (Math.exp((-e*x)));
		return I; 
	}
	/**
	 * 
	 * @param I = I(x) 
	 * @param i = I(0)
	 * @param e = E_i
	 * @return -> distance traveled by a neutron(s)
	 */
	public static double distanceCalculator(double I, double i, double e){
		double x = 0; // distance traveled
		x = -e*(Math.log(I/i));
		return x; 
	}
	
	public static int monteCarloSimulator(){
	
		return 0; // dummy return
	}
	public static void main(String[] args) {
		
		System.out.println(distanceCalculator(.3,2,5)); // test case
		System.out.println(survivalCalculator(2,5,9.485599924429406));
	}
	
	

}

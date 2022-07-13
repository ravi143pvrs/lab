package Assignmentss;

public class Workout {

	private String type;
	private String eqip;
	private int weight;
	private int rep;
	private String reson;
	
	public Workout() {
	
	}

	public Workout(String type, String eqip, int weight, int rep, String reson) {
		
		this.type = type;
		this.eqip = eqip;
		this.weight = weight;
		this.rep = rep;
		this.reson = reson;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEqip() {
		return eqip;
	}

	public void setEqip(String eqip) {
		this.eqip = eqip;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getRep() {
		return rep;
	}

	public void setRep(int rep) {
		this.rep = rep;
	}

	public String getReson() {
		return reson;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}
	
	public void msg() {
		
		System.out.println(type+" "+eqip+" "+weight+" "+rep+" "+reson);
		
	}
	
}

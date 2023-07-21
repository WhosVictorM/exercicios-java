package entities;

public abstract class Data {
	protected String name;
	protected Double annualIncoming;
	
	public Data() {
	}

	public Data(String name, Double annualIncoming) {
		this.name = name;
		this.annualIncoming = annualIncoming;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncoming() {
		return annualIncoming;
	}

	public void setAnnualIncoming(Double annualIncoming) {
		this.annualIncoming = annualIncoming;
	}
	
	public abstract double tax();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + ": $" + tax());
		return sb.toString();
	}
	
	
}

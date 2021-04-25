package entity;

public class Entrees {
	private int EId;
	private String EName;
	private double EPrice;

	public Entrees(int EId, String EName, double EPrice) {
		this.setEId(EId);
		this.setEName(EName);
		this.setEPrice(EPrice);
	}

	public int getEId() {
		return EId;
	}

	public void setEId(int eId) {
		EId = eId;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public double getEPrice() {
		return EPrice;
	}

	public void setEPrice(double ePrice) {
		EPrice = ePrice;
	}
}

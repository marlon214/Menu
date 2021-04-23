package entity;

public class Desserts {
	private int DId;
	private String DName;
	private double DPrice;
	
	public Desserts(int DId, String DName, double DPrice) {
		this.setDId(DId);
		this.setDName(DName);
		this.setDPrice(DPrice);
	}

	public int getDId() {
		return DId;
	}

	public void setDId(int dId) {
		DId = dId;
	}

	public String getDName() {
		return DName;
	}

	public void setDName(String dName) {
		DName = dName;
	}

	public double getDPrice() {
		return DPrice;
	}

	public void setDPrice(double dPrice) {
		DPrice = dPrice;
	}
}

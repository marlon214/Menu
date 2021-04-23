package entity;

public class Appetizers {
	private int AId;
	private String AName;
	private double APrice;
	
	public Appetizers(int AId, String AName, double APrice) {
		this.setAId(AId);
		this.setAName(AName);
		this.setAPrice(APrice);
	}

	public int getAId() {
		return AId;
	}

	public void setAId(int aId) {
		AId = aId;
	}

	public String getAName() {
		return AName;
	}

	public void setAName(String aName) {
		AName = aName;
	}

	public double getAPrice() {
		return APrice;
	}

	public void setAPrice(double aPrice) {
		APrice = aPrice;
	}
	
	
}

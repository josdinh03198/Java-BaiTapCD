package baiTapCD;

public class ThongTinCD {
	private int maCD;
	private char tuaCD;
	private String caSY;
	private int soBaiHat;
    private float giaThanh;
    
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}
	public char getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(char tuaCD) {
		this.tuaCD = tuaCD;
	}
	public String getCaSY() {
		return caSY;
	}
	public void setCaSY(String caSY) {
		this.caSY = caSY;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public float getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}
	public ThongTinCD(int maCD, char tuaCD, String string, int soBaiHat, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSY = string;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	public ThongTinCD() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String str= String.format("%10d|%15c|%15s|%15d|%15.2f|", getMaCD(),getTuaCD(),getCaSY(),getSoBaiHat(),getGiaThanh());
		return str;
	}
	
}

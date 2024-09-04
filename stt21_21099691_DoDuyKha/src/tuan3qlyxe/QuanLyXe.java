package tuan3qlyxe;

public class QuanLyXe {
	private String tenChuXe;
	private String loaiXe;
	private double dungTich;
	private double triGia;

	public QuanLyXe(String tenChuXe, String loaiXe, double dungTich, double triGia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}
	public QuanLyXe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public double getDungTich() {
		return dungTich;
	}

	public void setDungTich(double dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public double thue() {
		if (dungTich < 100)
			return (1f / 100) * triGia;
		else if (dungTich <= 200)
			return (3f / 100) * triGia;
		else
			return (5f / 100) * triGia;
	}

	@Override
	public String toString() {
		return String.format("%-20s %-20s %15f %20f %20f", tenChuXe, loaiXe, dungTich, triGia, thue());
	}
}

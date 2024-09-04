package tuan3qlyxe;

public class QuanLyXeDemo {

	public static void main(String[] args) {
		QuanLyXe xe1 = new QuanLyXe("Nguyen Thu Loan", "Future Neo", 100, 350000000);
		QuanLyXe xe2 = new QuanLyXe("Le Minh Tinh", "Ford Ranger", 3000, 2500000);
		QuanLyXe xe3 = new QuanLyXe("Nguyen Thu Loan", "Future Neo", 100, 350000000);
		System.out.println(String.format("%-20s %-20s %15s %20s %20s", "Ten chu xe", "Ten xe", "Dung tich", "Tri gia", "Thue truoc ba"));
		System.out.println("====================================================================================================");
		System.out.println(xe1.toString());
		System.out.println(xe2.toString());
		System.out.println(xe3.toString());
	}
}

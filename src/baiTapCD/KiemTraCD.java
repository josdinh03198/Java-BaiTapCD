package baiTapCD;


public class KiemTraCD {
	
	public static void tieude(){
		String str = String.format("%10s|%15s|%15s|%15s|%15s|", "Ma CD", "Tua CD","Ten Ca Sy","So Bai Hat","Gia Thanh");
		System.out.println(str);
	}
    public static void nhapCung(DanhSachCD dsCD)
    {
    	ThongTinCD cd = new ThongTinCD();
    	cd = new ThongTinCD(111, 'A', "Nguyen van A", 10, 500);
    	dsCD.ThemCD(cd);
    	cd = new ThongTinCD(112, 'B', "Nguyen van B", 10, 1000);
    	dsCD.ThemCD(cd);
    	cd = new ThongTinCD(113, 'C', "Nguyen van C", 10, 300);
    	dsCD.ThemCD(cd);
    	cd = new ThongTinCD(114, 'D', "Nguyen van D", 10, 250);
    	dsCD.ThemCD(cd);
    	cd = new ThongTinCD(115, 'E', "Nguyen van E", 10, 1500);
    	dsCD.ThemCD(cd);
    }
    static  void xuatDanhSach( ThongTinCD [] ds , int sptThat)
	{
		for (int i = 0; i < sptThat; i++) 
		{
		   System.out.println(ds[i]);	
		}
	}
    static void Menu()
    {
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("~~~CHUONG TRINH XAY DUNG DOI TUONG CD~~~");
		DanhSachCD dsCD= new DanhSachCD(10);
		tieude();
		nhapCung(dsCD);
		xuatDanhSach(dsCD.getAllCD(), dsCD.cd);
		System.out.println("Tong gia thanh cua cac CD:" + String.format("%.2f", dsCD.tongGiaThanhCD()));
		System.out.println("Tong so luong cua CD co trong danh sach:" + dsCD.TongCD());

	}
	

}

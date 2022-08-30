package baiTapCD;

import java.util.Arrays;
public class DanhSachCD {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DanhSachCD [cd=" + cd + ", dsCD=" + Arrays.toString(dsCD) + "]";
	}
	public int cd;
	ThongTinCD dsCD[];

	public DanhSachCD (int spt){
		dsCD = new ThongTinCD[spt];
	}
	private void MangTangKichThuoc()
	{
		ThongTinCD [] temp=new ThongTinCD [(int)(dsCD.length*2)];
		for(int i=0;i<dsCD.length;i++)
			temp[i]=dsCD[i];
		dsCD=temp;
	}
	public ThongTinCD timCD(long maCD)
	{
		for(int i=0;i<cd;i++)
		{
			if(dsCD[i].getMaCD()==maCD)
				return dsCD[i];
		}
		return null;
	}


	public ThongTinCD[] getAllCD()
	{
		return dsCD;	
	}

	public boolean ThemCD(ThongTinCD tcd)
	{
		if(timCD(tcd.getMaCD())!=null)
			return false;
		if(cd==dsCD.length)
			MangTangKichThuoc();
		dsCD[cd]=tcd;
		cd++;
		return true;
	}
	public int TongCD(){
		return cd;
	}
	public double tongGiaThanhCD()
	{
		double sum = 0;
		for(int i=0; i<cd; i++)
		{
			sum += dsCD[i].getGiaThanh();
		}
		return sum;
	}
	



}

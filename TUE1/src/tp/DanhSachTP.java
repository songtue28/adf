package tp;

import java.util.*;

public class DanhSachTP extends ArrayList<ThanhPho> {

	public void them(ThanhPho tp) {
		// TODO Auto-generated method stub
		ThanhPho tp1 = timMaThanhPho(tp.getMa());
		if(tp1 == null)
			this.add(tp);
		else
			System.out.println("da ton tai");
	}

	private ThanhPho timMaThanhPho(int ma) {
		// TODO Auto-generated method stub
		for(var s: this)
			if(ma == s.getMa())
				return s;
		return null;
	}

	public void hienthi() {
		// TODO Auto-generated method stub
		for(var s : this)
			System.out.println(s.toString());
	}

}

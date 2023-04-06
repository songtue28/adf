package TP;

import java.util.ArrayList;

public class DsThanhPho extends ArrayList<ThanhPho> {

	public void them(ThanhPho ttp) {
		// TODO Auto-generated method stub
		ThanhPho tt = timMaThanhPho(ttp.getMa());
		if(tt == null)
			this.add(tt);
		else 
			System.out.println("da ton tai");
		
	}

	private ThanhPho timMaThanhPho(int ma) {
		// TODO Auto-generated method stub
		for(var s: this) {
			if(ma== s.getMa()) {
				return s;
			}
		}
		return null;
	}

	public void hienthi() {
		// TODO Auto-generated method stub
		for(var s: this)
			System.out.println(s.toString());
		
	}

}

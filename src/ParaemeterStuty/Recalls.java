package ParaemeterStuty;

import AssigmStaticAndNonStc.StudendInfo;
import AssigmStaticAndNonStc.StudendInfoUpd;

public class Recalls {

	public static void main(String[] args) {
		
		StudendInfo ns=new StudendInfo();
		ns.info("Vyanki", 25.4f, 'M', 65.3f, 95); // calling non static from another class with parameters
        ns.info("Somvanshi", 25.1f, 'F', 60.2f, 23);
		
		StudendInfo vv=new StudendInfo();
		vv.ns();                                  // calling non static from another class with parameters
		
		StudendInfoUpd.cs();
		
	}

}

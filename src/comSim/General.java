package comSim;

import java.util.Random;

public class General {
	private static int traditionFactor = 44;
	private int fire, shock, maneuver, siege;
	private Random r = new Random();

	public General(int fire, int shock, int maneuver, int siege, int tradition) {
		super();
		this.fire = fire;
		this.shock = shock;
		this.maneuver = maneuver;
		this.siege = siege;
		this.fire += tradition / traditionFactor;
		this.shock += tradition / traditionFactor;
		if (tradition % traditionFactor > r.nextInt(traditionFactor)){
			this.fire++;			
		}
		if (tradition % traditionFactor > r.nextInt(traditionFactor)){
			this.shock++;			
		}
	}
	
	public int getPhasePips(int phase){
		if (phase == 0){
			return getFire();
		}
		else if (phase == 1){
			return getShock();
		}
		else throw new RuntimeException("No Valid combat phase");
		
	}

	public int getFire() {
		return fire;
	}

	public void setFire(int fire) {
		this.fire = fire;
	}

	public int getShock() {
		return shock;
	}

	public void setShock(int shock) {
		this.shock = shock;
	}

	public int getManeuver() {
		return maneuver;
	}

	public void setManeuver(int maneuver) {
		this.maneuver = maneuver;
	}

	public int getSiege() {
		return siege;
	}

	public void setSiege(int siege) {
		this.siege = siege;
	}
}

class MountainBike extends Bicycle {

    boolean LightsOn = false;
	// new fields and methods defining 
    // a mountain bike would go here
	
	void switchLights(){
		LightsOn = !LightsOn;
	}
	
	void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear
			 + " lights:" + (LightsOn ? "On" : "Off") );
    }

}
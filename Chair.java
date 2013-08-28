class Chair implements ChairInterface{
	double weight = 1.5;
	int Legs = 4;
	int PositionX = 0;
	int PositionY = 0;
	
	public void moveChair(int x, int y){
		PositionX += x;
		PositionY += y;
	}
	
	public void breakLeg(){
		Legs--;
	}
	
	void printStates(){
		System.out.println("Position: X:" + PositionX +
			", Y:" + PositionY +
			"; legs left: " + Legs);
	
	}
}
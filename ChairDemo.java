class ChairDemo {
	public static void main(String[] args) {
		Chair brown = new Chair();
		Chair red = new Chair();
		
		brown.moveChair(2, 4);
		brown.breakLeg();
		
		red.moveChair(-3, 5);
		red.breakLeg();
		red.breakLeg();
		
		brown.printStates();
		red.printStates();
	
	}

}
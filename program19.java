class program19{
	public static void main(String[] args){
		String friends="Kanha";
		System.out.println("Before switch");
		switch(friends){
			case "Ashish":
				System.out.println("Barclays");
				break;
			case "Kanha":
				System.out.println("BMC Software");
				break;
			case "Rahul":
				System.out.println("Infosys");
			case "Badhe":
				System.out.println("IBM");
			default:
				System.out.println("In default state");
		}
		System.out.println("After switch");
	}
}
			
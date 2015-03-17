//Interface that says who can be a Richman
interface Richman {
	public void earnMoney();
	public void donation();
	public  void party();
}

//Business man implements RichMan interface and define methods to become Rich
public class BusinessMan implements Richman {

	public void earnMoney() {
		System.out.println("Richman Earn Money");
	}

	public void donation() {
		System.out.println("Richman gives Donation");
	}

	public void party() {
		System.out.println("Richman gives Party");
	}
}

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Class accepts two numbers from UI and sum them
public class SumNum extends Frame implements ActionListener {

	TextField num1 = new TextField();
	TextField num2 = new TextField();
	TextField sum = new TextField();

	Button goButton = new Button("Go");

	//Create UI 
	public SumNum() {
		setLayout(new FlowLayout());

		num1 = new TextField();
		num2 = new TextField();
		sum = new TextField();
		goButton = new Button("Go");

		add(num1);
		add(num2);
		add(sum);
		add(goButton);

		setSize(600, 400);

	}

	//On Button Click calculate Sum
	public void actionPerformed(ActionEvent arg0) {
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		sum.setText("" + (n1 + n2));
	}

	//Start Window
	public static void main(String[] args) {
		SumNum calc = new SumNum();
		calc.setVisible(true);
	}

}

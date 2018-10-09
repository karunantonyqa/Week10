import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Event implements ActionListener {
	
	TextField TF1, TF2, TF3;
	
	public Event(TextField a, TextField b, TextField c) {
		TF1 = a;
		TF2 = b;
		TF3 = c;
	}

	@Override
	public void actionPerformed(ActionEvent x) {
		float a, b, c;
		String result;
		a = b = c = 0;
		
		a = Integer.parseInt(TF1.getText());
		b = Integer.parseInt(TF2.getText());
		
		Button btn = (Button) x.getSource();
		
		String titleBtn = btn.getLabel();
		
		if(titleBtn.equals("+")) {
			c = a + b;
		} else if(titleBtn.equals("-")) {
			c = a - b;
		} else if(titleBtn.equals("/")) {
			c = a/b;
		} else if(titleBtn.equals("x")) {
			c = a*b;
		}
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		result = df.format(c);
				
		TF3.setText(result);
		
	}

}

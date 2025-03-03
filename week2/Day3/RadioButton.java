package week2.Day3;

public class RadioButton  extends Button{
	
public void selectRadioButton() {
		
		System.out.println("Selecting the Radio Button");
	}

public static void main(String[] args) {
	RadioButton rb=new RadioButton();
	rb.selectRadioButton();//this class method
	rb.submit();//parent method
	rb.click();//ancestor method
	rb.setText("This is my text1");//ancestor method
}
	

	

}

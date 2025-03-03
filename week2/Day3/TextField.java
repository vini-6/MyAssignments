package week2.Day3;

public class TextField extends WebElement {
public void getText() {
		
		System.out.println("Getting the text");
	}
public static void main(String[] args) {
	TextField txt=new TextField();
	txt.getText();//this class method
	txt.click();//parent method
	txt.setText("This is my text");//parent method
	
}
}

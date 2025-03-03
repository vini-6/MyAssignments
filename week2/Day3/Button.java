package week2.Day3;

public class Button extends WebElement{
public void submit() {
		
		System.out.println("submiting the URL");
	}
public static void main(String[] args) {
	Button b=new Button();
	b.submit();//this class method
	b.click();//parent method
	b.setText("This is my text1");//parent method
}
	
	
}

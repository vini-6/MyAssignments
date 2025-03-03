package week2.Day3;

public class CheckBoxButton extends Button{
public void clickCheckButton() {
		
		System.out.println("Click the Check Button");
	}
public static void main(String[] args) {
	CheckBoxButton rb=new CheckBoxButton();
	rb.clickCheckButton();//this class method
	rb.submit();//parent method
	rb.click();//ancestor method
	rb.setText("This is my text1");//ancestor method
}
	

}

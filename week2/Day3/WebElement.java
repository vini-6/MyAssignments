package week2.Day3;

public class WebElement {
	
	public void click() {
		
		System.out.println("Clicking the URL");
	}
	public void setText(String text) {
		
		System.out.println("Closing the URL"+text);
	}
	public static void main(String[] args) {
		WebElement we=new WebElement();
		we.click();//this class mthod
		we.setText("This is my text1");//this class mthod
	}
}

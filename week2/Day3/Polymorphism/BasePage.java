package week2.Day3.Polymorphism;

public class BasePage {
	
public void findElement() {
		
		System.out.println("Finding the element");
	}
public void clickElement() {
	
	System.out.println("Clicking the element");
}public void enterText() {
	
	System.out.println("Entering the text");
}public void performCommonTasks() {
	
	System.out.println("Performing Common Tasks");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage b=new BasePage();
		b.findElement();
		b.clickElement();
		b.enterText();
		b.performCommonTasks();
	
	}

}

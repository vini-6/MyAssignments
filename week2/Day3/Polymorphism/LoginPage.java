package week2.Day3.Polymorphism;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks() {

		System.out.println("Performing Common Tasks with override");
		super.performCommonTasks();// baseclass metodfor a demo purpose
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage b = new LoginPage();
		b.findElement();
		b.clickElement();
		b.enterText();
		b.performCommonTasks();// calling this class metod

	}

}

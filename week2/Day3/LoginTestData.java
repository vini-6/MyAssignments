package week2.Day3;

public class LoginTestData extends TestData {

	public void enterUsername() {
		
		System.out.println("Entered the Username");
	}
	public void enterPassword() {
		
		System.out.println("Entered the Password");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData ln=new LoginTestData();
		ln.enterUsername();
		ln.enterPassword();
		ln.enterCredentials();
		ln.navigateToHomePage();
		
		
		
		
	}

}

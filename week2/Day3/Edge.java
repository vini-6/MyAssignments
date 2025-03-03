package week2.Day3;
public class Edge extends Browser{
	
	public void takeSnap() {
		
		System.out.println("Taking the snap");
	}
	public void clearCookies() {
		
		System.out.println("Clearing the Cookies");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//openIncognito() and clearCache()
		
		Edge eg=new Edge();
		System.out.println(eg.browserName);
		System.out.println(eg.browserVersion);
		eg.openURL();
		eg.closeBrowser();
		eg.navigateBack();
		eg.takeSnap();
		eg.clearCookies();
	}
//takeSnap() and clearCookies()
	

}

package week2.Day3;

public class Chrome extends Browser{

	
	public void openIncognito() {
		
		System.out.println("Opening incognito the URL");
	}
	public void clearCache() {
		
		System.out.println("Clearing the Cache");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//openIncognito() and clearCache()
		Chrome cr=new Chrome();
		cr.openURL();
		cr.closeBrowser();
		cr.navigateBack();
		cr.openIncognito();
		cr.clearCache();
	}

}

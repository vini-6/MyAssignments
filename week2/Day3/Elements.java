package week2.Day3;

public class Elements  extends Button{
	public static void main(String[] args) {
		Button b=new Button();
		b.submit();//parent class method
		b.click();//ancestor method
		b.setText("This is my text1");//ancestor method
	}

}

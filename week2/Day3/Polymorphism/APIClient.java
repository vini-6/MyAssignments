package week2.Day3.Polymorphism;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println("This is One arugument -->"+endpoint);
	}
	
	public void sendRequest(String a,String requestBody,boolean requestStatus) {
		String endpoint=a;
		System.out.println("This is One arugument -->"+endpoint+requestBody+requestStatus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient a=new APIClient();
		a.sendRequest("My Text");//method overload
		a.sendRequest("Text1","Text2",true);//method overload

	}

}

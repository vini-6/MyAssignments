package week2.Day4;

public class JavaConnection extends MySqlConnection implements DatabseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Its being connected");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Its being disconnected");

	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Its being updated");

	}
	@Override
	void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Query is being executed");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection cc = new JavaConnection();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
		cc.executeQuery();

	}


}

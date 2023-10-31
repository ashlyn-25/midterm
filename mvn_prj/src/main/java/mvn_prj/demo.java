package mvn_prj;
import java.util.ResourceBundle;
public class demo {
	public int login(String userid, String password)
	{
		ResourceBundle rb= ResourceBundle.getBundle("config");
		String user=rb.getString("userid");
		String pass=rb.getString("password");
		if(userid.equals(user)&& password.equals(pass))
		{
			System.out.println("logged in");
			return 1;
		}
		else
			return 0;
	}

}

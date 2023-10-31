package mvn_prj;
import java.util.ResourceBundle;
public class demo {
	public int login(String name, String id)
	{
		ResourceBundle rb= ResourceBundle.getBundle("config");
		String user=rb.getString("name");
		String pass=rb.getString("id");
		if(name.equals(user)&& id.equals(pass))
		{
			System.out.println("logged in");
			return 1;
		}
		else
			return 0;
	}

}

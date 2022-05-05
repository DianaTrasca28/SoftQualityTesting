package proxy;

public class LoginProxy implements ILoginModule{

	int counter=0;
	ILoginModule loginModule;	//pt a apela metoda initiala
		
	public LoginProxy(ILoginModule loginModule) {
		super();
		this.loginModule = loginModule;
	}
	@Override
	public boolean login(String username, String password) {
		boolean result=false;
		if(counter>=3)
		{
			System.out.println("exceeded 3 trials");
			return false;
		}
		else {
			result=this.loginModule.login(username, password);
			if(!result) {
				System.out.println("pass "+password+ " incorect");
				counter++;
			}
				
			else
				counter=0;
		}
		return result;
	}

}

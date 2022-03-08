package s;

public interface IUser {
	boolean login(String username, String password);
	boolean register (String username, String email, String password);
	//void LogError (String error);
	//void sendEmail (String content, String email); mutate
}

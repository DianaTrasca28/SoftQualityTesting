package i;

public interface IPrintTasks {

	//scan
		boolean scan(String content);
		//print
		boolean printFromExternalDevive (String content);
		//photocopy
		boolean print(String content);
		//openClose
		boolean openClose(boolean state);
		//badgeAuth
		boolean badgeAuth(String content);
		//fax
		boolean fax(String content, String number);
}

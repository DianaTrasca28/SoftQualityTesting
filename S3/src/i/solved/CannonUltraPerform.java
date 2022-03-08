package i.solved;

public class CannonUltraPerform implements IPrintTasks, IPrintScanner, IPrintFromOutside, IFax, IAuthenticate {

	@Override
	public boolean badgeAuth(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fax(String content, String number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean printFromExternalDevive(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scan(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean print(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean openClose(boolean state) {
		// TODO Auto-generated method stub
		return false;
	}

}

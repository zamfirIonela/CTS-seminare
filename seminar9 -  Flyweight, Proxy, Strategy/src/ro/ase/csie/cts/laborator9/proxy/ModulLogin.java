package ro.ase.csie.cts.laborator9.proxy;

public class ModulLogin implements InterfataLogin {

	String ipServer;
	
	public ModulLogin(String ipServer) {
		super();
		this.ipServer = ipServer;
	}

	@Override
	public boolean login(String user, String pass) {
		if(user.equals("admin") && pass.equals("root1234"))
			return true;
		else {
			return false;
		}
	}

	@Override
	public boolean verificaStatusServer() {
		// TODO Auto-generated method stub
		return false;
	}

}

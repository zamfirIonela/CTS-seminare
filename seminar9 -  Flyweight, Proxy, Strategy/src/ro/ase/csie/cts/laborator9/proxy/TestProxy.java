package ro.ase.csie.cts.laborator9.proxy;


public class TestProxy {

	public static void main(String[] args) {
		 InterfataLogin login = new ModulLogin("10.0.0.1");
		 if(login.login("admin", "root1234"))
			 System.out.println("Hello admin");

		 
		 //adauga proxy
		 login = new ProxyLogin(login);
		 
		 String[] parole = new String[] {"1234","root","admin","root13","root1234"};
		 for(String parola : parole) {
			 if(login.login("admin", parola))
				 System.out.println("Am gasit parola: " + parola);
		 }
		 
		 System.out.println("Game over");
	}

}

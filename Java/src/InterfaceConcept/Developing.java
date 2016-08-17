package InterfaceConcept;

public class Developing implements Bankingclient, Domain{
	// now this class is responosible for ALL methods of Bankingclient

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developing d = new Developing();
		d.Checkingbalance();
		d.paycreditcard();
		d.Transferbalance();
		d.login();
		
		Bankingclient br=new Developing();  // runtime polymorphism implmented Bankingclient interface
		br.Checkingbalance();
		
		Domain dm= new Developing();  // runtime polym, implmented Domain interface
		dm.investment();

	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard implimented");
		
	}

	@Override
	public void Transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("Transferbalance implimented");

	}

	@Override
	public void Checkingbalance() {
		// TODO Auto-generated method stub
		
		System.out.println("Checkingbalance	 implimented");

	}

	public void login()
	{
		System.out.println("logged in");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("investment from Domain	 implimented");
		
	}
}

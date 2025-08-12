package method_overriding;

public class Admin extends Amazon{
	public Admin(String un,String pw) {
		this.un=un;
		this.pw=pw;
	}
	@Override
	public void login(String un,String pw) {
		if(this.un.equals(un) && this.pw.equals(pw)) {
		System.out.println("add product");
		System.out.println("remove product");
		}else {
			System.out.println(" !! invalid credentials");
		}
	}
}

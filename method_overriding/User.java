package method_overriding;

public class User extends Amazon{
	
	public User(String un,String pw) {
		this.un=un;
		this.pw=pw;
	}

	@Override
	public void login(String un,String pw) {
		if(this.un.equals(un) && this.pw.equals(pw)) {
		System.out.println("buy product");
		System.out.println("cancel product");
		}else {
			System.out.println(" !! invalid credentials");
		}
	}
}

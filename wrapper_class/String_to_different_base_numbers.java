package wrapper_class;

public class String_to_different_base_numbers {
	public static void main(String[] args) {
		String s="10101010";
		int a=Integer.parseInt(s,2);   
		System.out.println("binary to decimal :"+a);  //binary to decimal
		System.out.println("binary to octadecimal : "+Integer.parseInt(s,8));
		System.out.println("binary to decimal(same)"+Integer.parseInt(s,10));
		System.out.println("binary to hexadecimal : "+Integer.parseInt(s,16));
		
		String s1="123";
		int b=Integer.parseInt(s1);
		System.out.println("String to integer : "+ b);
	}
}

import java.io.IOException;

class C6FRead{

	public static void main(String[] args) {
		int n;
		byte b;
		char c;
		
		try{
			n = System.in.read();

			System.out.println("Int: "+ n);

			b = (byte)n;
			System.out.println("Byte: "+ b);

			c = (char)n;
			System.out.println("Char: "+ c);
		}
		catch(IOException error){
			System.out.println("[ERROR]: "+error);
		}
	}
}
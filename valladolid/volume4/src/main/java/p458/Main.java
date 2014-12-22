package p458;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Main {
	
	static DataInputStream in = new DataInputStream(System.in);
	static DataOutputStream output = new DataOutputStream(System.out) ;

	public static void main(String[] args) throws Exception {
		while (in.available() != 0) {
			byte b;
			b = in.readByte();
			if (b == 10) {
				output.write(b);
			}
			else {
				output.write(b - 7);
			}
		}
		output.flush();
	}
}

package Ch19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04Copy {
	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("C://IOTEST//test3.txt");
		int data = 0;
		StringBuffer buffer = new StringBuffer();

		char[] buf = new char[1024];// 1024byte

		long startTime = System.currentTimeMillis();
		while ((data = fin.read(buf)) != -1) {

//			buffer.append((char) data);
			buffer.append(buf);
		}
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("소요시간 : " + (endTime - startTime) + "MS");

		fin.close();

	}
}

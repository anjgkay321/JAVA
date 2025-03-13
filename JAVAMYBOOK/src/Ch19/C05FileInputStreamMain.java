package Ch19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain {
	public static void main(String[] args) throws IOException {
		InputStream fin = new FileInputStream("c://IOTEST//data.xlsx");
		StringBuffer stringBuffer = new StringBuffer();

		byte[] buf = new byte[4096];
		long sTime = System.currentTimeMillis();
		// fin.read()확인
		while (true) {
			int data = fin.read(buf);
			if (data == -1)
				break;

//			System.out.print((char) data);
		}
		long eTime = System.currentTimeMillis();
		System.out.println("소요시간  : " + (eTime - sTime) + " ms");
		fin.close();
	}
}

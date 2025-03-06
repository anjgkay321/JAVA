package Ch11;

class ArrayUtils {
	// concat() 메서드는 두 배열을 합친 새로운 배열을 반환
	public static int[] concat(int[] a, int[] b) {
		int[] result = new int[a.length + b.length]; // a와 b 배열의 크기 합만큼 크기 지정
		System.arraycopy(a, 0, result, 0, a.length); // a 배열을 result 배열에 복사
		System.arraycopy(b, 0, result, a.length, b.length); // b 배열을 result 배열에 복사
		return result;
	}

	// print() 메서드는 배열의 모든 요소를 출력
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(); // 줄 바꿈
	}
}

public class C05Ex {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtils.concat(array1, array2); // 두 배열을 합침
		ArrayUtils.print(array3); // 합쳐진 배열 출력
	}
}

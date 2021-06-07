package classwork_041921;

class StringBuilderEncryption {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ceasar$uhgolxEjqluwV#hvx#qdf#xr|#|d\\3");

		char[] cArray = new char[sb.length()];

		sb.getChars(0, sb.length(), cArray, 0);
		for (int i = 0; i < cArray.length; i++) {
			cArray[i] -= 3;
//			System.out.print(cArray[i]);
		}
		System.out.println("\n");
		sb = new StringBuilder(new String(cArray));
		sb.reverse();
//		System.out.println(sb);
		
		System.out.println(sb.deleteCharAt(0).delete(30,sb.length()));

	}

	// char[] cArray2 = sb.toString().toCharArray();

}

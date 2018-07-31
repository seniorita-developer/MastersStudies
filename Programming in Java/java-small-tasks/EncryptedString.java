package pl.wsis.java;

public class EncryptedString {

	public void Solve() {
		String plainText = "krolik";
		StringBuffer text = new StringBuffer("Encrypted text is: ");
		String plainText1 = plainText.replace("k", "2");
		String plainText2 = plainText1.replace("r","y");
		String plainText3 = plainText2.replace("o", "P");
		String plainText4 = plainText3.replace("l", "7");
		String plainText5 = plainText4.replace("i", "w");
		
		StringBuffer result = text.append(plainText5);
		System.out.println(result);
	}

}

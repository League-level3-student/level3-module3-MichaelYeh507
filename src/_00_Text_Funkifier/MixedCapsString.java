package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixedCaps = "";
		for(int i = 0; i<s.length(); i++) {
			if(i%2==0) {
				mixedCaps = mixedCaps + Character.toLowerCase(s.charAt(i));
			} else if(i%2==1) {
				mixedCaps = mixedCaps + Character.toUpperCase(s.charAt(i));
			}

		}
		return "";
	}

}

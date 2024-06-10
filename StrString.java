package avoidstring;

public class StrString implements StringVal {
	private final String str;
	
	StrString(String str){
		this.str = str;
	}
	
	public String change() {
		return this.str;
	}
}

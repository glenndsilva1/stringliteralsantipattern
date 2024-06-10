package avoidstring;

public class ConcatString implements StringVal {
	private final StringVal stringval;
	
	ConcatString(StringVal val){
		this.stringval = val;
	}
	
	public String change() {
		return "Hi " + this.stringval.change();
	}
	
	public static void main(String args[]) {
		StringVal strval = new ConcatString(new StrString("Goodbye"));
		System.out.println(strval.change());
	}
}

package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.
	
	
	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	int itemsReceived; // must not be negative. All negative arguments get set to 0.
	protected int _itemsReceived;

	public int getItemsReceived() {
		return _itemsReceived;
	}
	
	public void setItemsReceived(int itemsReceived) throws Exception {
		if(itemsReceived < 0) throw new Exception();
		_itemsReceived = itemsReceived;
	}
	
	
	float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	protected float _degreesTurned;
	
	public float getDegreesTurned() {
		return _degreesTurned;
	}
	
	public void setDegreesTurned(float degreesTurned) throws Exception {
		if(degreesTurned < 0.0 || degreesTurned > 360.0) throw new Exception();
		_degreesTurned = degreesTurned;
	}
	
	
	String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	protected String _nomenclature;
	
	public String getNomenclature() {
		return _nomenclature;
	}
	
	public void setNomenclature(String nomenclature) throws Exception {
		if(nomenclature.equals("") || nomenclature.equals(null)) throw new Exception();
		_nomenclature = nomenclature;
	}
	
	
	Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();
	protected Object _memberObj;

	public Object getMemberObj() {
		return _memberObj;
	}
	
	public void setMemberObj(Object memberObj) throws Exception {
		if(memberObj.equals(memberObj.toString())) {
			_memberObj = memberObj;
		}
	}

	public static void main(String[] args) {

	}
}

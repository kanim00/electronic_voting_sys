/**
 *
 */
class Person {
protected	String name;
protected 	int age;
protected 	String location;
protected 	String education;
	/**
	 * Constructor for the person class
	 * @param name
	 * @param age
	 * @param location
	 * @param education
	 */
	public Person(String name, int age, String location, String education) {
	this.name = name;
	this.age = age;
	this.location = location;
	this.education = education;
	}
	/**
	 * getter method for name
	 * @return name as a string 
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter method for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter method for age
	 * @return age as an integer
	 */
	public int getAge() {
		return age;
	}
	/**
	 * setter method for the age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 * @return location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 
	 * @return level of education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * 
	 * @param education
	 */
	public void setEducation(String education) {
		this.education = education;
	}
}

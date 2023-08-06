/**
 * 
 * @author oliver Chiambah Ngong
 * 
 */
class Voter extends Person{
 private boolean hasvoted;
 private int voter_id;
 private  int pollingstation_id;
  public Voter(String name, int age, String location, String education, int voter_id, int pollingstation_id) {
		super(name, age, location, education);
		this.voter_id = voter_id;
		this.pollingstation_id= pollingstation_id;
		this.hasvoted = false;
		
	}
  /**
   * 
   * @return voter id as an integer
   * 
   */

public int getVoter_id() {
	return voter_id;
}
/**
 * 
 * @return Boolean
 */
public boolean getHasvoted() {
	return hasvoted;
}
/**
 * 
 * @param voter_id
 */
public void setVoter_id(int voter_id) {
	this.voter_id = voter_id;
}
/**
 * 
 * @return polling station as a string
 */
public int getPollingstation() {
	return pollingstation_id;
}
/**
 * 
 * @param pollingstation
 */
public void setPollingstation(int pollingstation_id) {
	this.pollingstation_id = pollingstation_id;
}

}

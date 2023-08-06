/**
 * 
 * @author oliver Chiambah Ngong
 * candidates class 
 *
 */
class Candidate extends Voter{
	private String party;
	private int cand_id;
	
	public Candidate(String name, int age, String location, String education, String party, int cand_id) {
		super(name, age, location, education, cand_id, cand_id);
		this.party = party;
		this.cand_id = cand_id;
	}
	/**
	 * 
	 * @return party as a string
	 */

	public String getParty() {
		return party;
	}
	
	/**
     * 
     * @param party
     */
	public void setParty(String party) {
		this.party = party;
	}
     /**
      * 
      * @return
      */
	public int getCand_id() {
		return cand_id;
	}
    /**
     * 
     * @param returns the number on the ballot
     */
	public void setCand_id(int cand_id) {
		this.cand_id = cand_id;
	}
	@Override
	public String toString() {
		return  getName();
	}
	

}

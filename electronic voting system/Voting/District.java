import java.util.*;

public class District {
private ArrayList<Pollingstation> pollingstations = new ArrayList<Pollingstation>() ;
private int district_id;
private HashMap<Candidate, Integer> district_votes;
private int regional_id;

public District(int district_id, int regional_id) {
	this.pollingstations = new ArrayList<Pollingstation>();
	this.district_id = district_id;
	this.district_votes = new HashMap<Candidate, Integer>();
	this.regional_id = regional_id;
}
public District(ArrayList<Pollingstation> pollingstations, int district_id, HashMap<Candidate, Integer> district_votes, int regional_id) {
	super();
	this.pollingstations = pollingstations;
	this.district_id = district_id;
	this.district_votes = district_votes;
	this.regional_id = regional_id;
}
public ArrayList<Pollingstation> getPollingstations() {
	return pollingstations;
}
public void setPollinstation(ArrayList<Pollingstation> pollingstations) {
	this.pollingstations = pollingstations;
	
}
public int getDistrict_id() {
	return district_id;
}
public void setDistrict_id(int district_id) {
	this.district_id = district_id;
}
public HashMap<Candidate, Integer> getDistrict_Votes() {
	return district_votes;
}
public void setDistrict_votes(HashMap<Candidate, Integer> district_votes) {
	this.district_votes = district_votes;
}
public int getRegional_id() {
	return regional_id;
}
public void setRegional_id(int regional_id) {
	this.regional_id = regional_id;
}

public void addPollingstation(Pollingstation ...pollingstations) {
	for(Pollingstation p:pollingstations) {
		this.pollingstations.add(p);
		//System.out.println("polling station " + p.district_id);
	}
}
public HashMap<Candidate, Integer> collateDistrictResults() {
	for(Pollingstation name: pollingstations) {
		HashMap<Candidate, Integer> temp = name.CollateResults();
		//System.out.println("polling size" + temp.size());
		for(Candidate Cand_name: temp.keySet()) {
			//district_votes.put(Cand_name, district_votes.get(Cand_name) + temp.get(Cand_name));
			if (district_votes.containsKey(Cand_name)) {
				district_votes.put(Cand_name,district_votes.get(Cand_name) + temp.get(Cand_name));
			}
			else {
				district_votes.put(Cand_name, temp.get(Cand_name));
			}
		}
	}
	return district_votes;
}

}

import java.util.*;
public class Pollingstation {
       HashMap<Candidate, Integer> pollingstationVotes;
       int pollingstation_id;
       int district_id;
       
public Pollingstation(int pollingstation_id, int district_id) {
	this.district_id = district_id;
	this.pollingstation_id = pollingstation_id;
	this.pollingstationVotes = new HashMap<Candidate, Integer>();
	
}
public Pollingstation( HashMap<Candidate, Integer> pollingstationVotes, int pollingstation_id, int district_id) {
	this.district_id = district_id;
	this.pollingstation_id = pollingstation_id;
	this.pollingstationVotes = pollingstationVotes;
	
}
public HashMap<Candidate, Integer> getPollingstationVotes() {
	return pollingstationVotes;
}
public void setPollingstationVotes(HashMap<Candidate, Integer> pollingstationVotes) {
	this.pollingstationVotes = pollingstationVotes;
}
public int getPollingstation_id() {
	return pollingstation_id;
}
public void setPollingstation_id(int pollingstation_id) {
	this.pollingstation_id = pollingstation_id;
}
public int getDistrict_id() {
	return district_id;
}
public void setDistrict_id(int district_id) {
	this.district_id = district_id;
}
public void VoteUpdate(Candidate Cand_name) {
	if (pollingstationVotes.containsKey(Cand_name)){
		pollingstationVotes.put(Cand_name, pollingstationVotes.get(Cand_name)+1);
		
	}
	else {
		pollingstationVotes.put(Cand_name, 1);
	}
	//System.out.println(pollingstationVotes.get(Cand_name) + "---"  + this.pollingstation_id);
}
public HashMap<Candidate, Integer> CollateResults() {
	for(Candidate name: pollingstationVotes.keySet()) {
		//System.out.println(name);
			pollingstationVotes.put(name, pollingstationVotes.get(name));
}
	return pollingstationVotes;
}
}
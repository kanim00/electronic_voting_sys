import java.util.ArrayList;
import java.util.HashMap;

public class Region {
	private ArrayList<District> districts = new ArrayList<District>();
	private HashMap<Candidate, Integer> regional_votes;
	private int regional_id;
	
	public Region(int regional_id) {
		districts = new ArrayList<District>();
		regional_votes = new HashMap<Candidate, Integer>();
		this.regional_id = regional_id;
		
	}
	
	public Region(ArrayList<District> districts, HashMap<Candidate, Integer> regional_votes, int regional_id) {
		super();
		this.districts = districts;
		this.regional_votes = regional_votes;
		this.regional_id = regional_id;
	}
	public ArrayList<District> getDistricts() {
		return districts;
	}
	public void setDistricts(ArrayList<District> districts) {
		this.districts = districts;
	}
	public HashMap<Candidate, Integer> getRegional_Votes() {
		return regional_votes;
	}
	public void setRegional_votes(HashMap<Candidate, Integer> regional_votes) {
		this.regional_votes = regional_votes;
	}
	public int getRegional_id() {
		return regional_id;
	}
	public void setRegional_id(int regional_id) {
		this.regional_id = regional_id;
	}
	
	public void addDistrict(District ...districts) {
		for(District d:districts) {
			//System.out.println(d.getDistrict_id());
			this.districts.add(d);
		}
	}
	public HashMap<Candidate, Integer> collateRegionalResults() {
		//HashMap<String, Integer> 
		for(District name: districts) {
			//System.out.println(name.getDistrict_id());
			HashMap<Candidate, Integer> temp = name.collateDistrictResults();
			//System.out.println("district size" + temp.size());
			for(Candidate Cand_name: temp.keySet()) {
				//System.out.println(Cand_name);
				//regional_votes.put(Cand_name, regional_votes.get(Cand_name) + temp.get(Cand_name));
				if (regional_votes.containsKey(Cand_name)) {
					regional_votes.put(Cand_name,regional_votes.get(Cand_name) + temp.get(Cand_name));
				}
				else {
					regional_votes.put(Cand_name, temp.get(Cand_name));
				}
			}
	   }
		return regional_votes;
	}

}

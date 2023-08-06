import java.util.ArrayList;
import java.util.HashMap;

public class Nation {
	private ArrayList<Region> Regions = new ArrayList<Region>();
	private HashMap<Candidate, Integer> national_votes;

	public Nation(){
		this.Regions = new ArrayList<Region>();
		this.national_votes = new  HashMap<Candidate, Integer>();
		
	}
	public Nation(ArrayList<Region> regions, HashMap<Candidate, Integer> national_votes) {
		this.Regions = regions;
		this.national_votes = national_votes;
		
		
	}
	public ArrayList<Region> getRegions() {
		return Regions;
	}
	public void setRegions(ArrayList<Region> regions) {
		Regions = regions;
	}
	public HashMap<Candidate, Integer> getNatioal_votes() {
		return national_votes;
	}
	public void setNatioal_votes(HashMap<Candidate, Integer> natioal_votes) {
		this.national_votes = natioal_votes;
	}
	public void AddRegions(Region ...Regions) {
		for(Region R:Regions) {
			this.Regions.add(R);
		}
	}
	public HashMap<Candidate, Integer> CollateNationalResults()  {
		for(Region name: Regions) {
			HashMap<Candidate, Integer> temp = name.collateRegionalResults();
			for(Candidate Cand_name: temp.keySet()) {
					if (national_votes.containsKey(Cand_name)) {
						national_votes.put(Cand_name,national_votes.get(Cand_name) + temp.get(Cand_name));
					}
					else {
						national_votes.put(Cand_name, temp.get(Cand_name));
					}
				}
		   }
		return national_votes;
     }
}

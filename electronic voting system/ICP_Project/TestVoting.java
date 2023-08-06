public class TestVoting {
	public static void main(String[] args) {
		//Creating the country
		Nation Ghana = new Nation();
		
		//Creating the regions
		Region Accra = new Region(1);
		Region Tema= new Region(2);
		Region Kumasi = new Region(3);
		Region Northern = new Region(4);
		Region Eastern = new Region(5);
		Region Volta = new Region(6);
		
		//Create the districts
		District d1 = new District(1,1);
		District d2 = new District(2,1);
		District d3 = new District(3,1);
		District d4 = new District(4,2);
		District d5 = new District(5,3);
		District d6 = new District(6,4);
		District d7 = new District(7,5);
		District d8 = new District(8,6);
		District d9 = new District(9,4);
		District d10 = new District(10,3);
		
		//Creating the various the various polling-stations
		Pollingstation p1 = new Pollingstation(1,1);
		Pollingstation p2 = new Pollingstation(2,1);
		Pollingstation p3 = new Pollingstation(3,2);
		Pollingstation p4 = new Pollingstation(4,2);
		Pollingstation p5 = new Pollingstation(5,3);
		Pollingstation p6 = new Pollingstation(6,3);
		Pollingstation p7 = new Pollingstation(7,4);
		Pollingstation p8 = new Pollingstation(8,4);
		Pollingstation p9 = new Pollingstation(9,5);
		Pollingstation p10 = new Pollingstation(10,5);
		Pollingstation p11 = new Pollingstation(11,6);
		Pollingstation p12 = new Pollingstation(12,6);
		Pollingstation p13 = new Pollingstation(13,7);
		Pollingstation p14 = new Pollingstation(14,7);
		Pollingstation p15 = new Pollingstation(15,8);
		Pollingstation p16 = new Pollingstation(16,8);
		Pollingstation p17= new Pollingstation(17,9);
		Pollingstation p18 = new Pollingstation(18,9);
		Pollingstation p19 = new Pollingstation(19,10);
		Pollingstation p20 = new Pollingstation(20,10);
		
		// Creating the various candidates 
		Candidate Trump = new Candidate("Donald Trump", 74, "Florida", "Bachelor's of Science", "Republican Party", 1174);
		Candidate Biden = new Candidate("Joseph Biden", 74, "Dalaware", "Bachelor's of Science", "Democratic  Party", 1175);
		
		
	//Initializing every Candidates vote at the polling-stations to 0 before voting starts
	p1.pollingstationVotes.put(Trump, 0);
	p2.pollingstationVotes.put(Trump, 0);
	p3.pollingstationVotes.put(Trump, 0);
	p4.pollingstationVotes.put(Trump, 0);
	p5.pollingstationVotes.put(Trump, 0);
	p6.pollingstationVotes.put(Trump, 0);
	p7.pollingstationVotes.put(Trump, 0);
	p8.pollingstationVotes.put(Trump, 0);
	p9.pollingstationVotes.put(Trump, 0);
	p10.pollingstationVotes.put(Trump, 0);
	p11.pollingstationVotes.put(Trump, 0);
	p12.pollingstationVotes.put(Trump, 0);
	p13.pollingstationVotes.put(Trump, 0);
	p14.pollingstationVotes.put(Trump, 0);
	p15.pollingstationVotes.put(Trump, 0);
	p16.pollingstationVotes.put(Trump, 0);
	p17.pollingstationVotes.put(Trump, 0);
	p18.pollingstationVotes.put(Trump, 0);
	p19.pollingstationVotes.put(Trump, 0);
	p20.pollingstationVotes.put(Trump, 0);
	
	
	p1.pollingstationVotes.put(Biden, 0);
	p2.pollingstationVotes.put(Biden, 0);
	p3.pollingstationVotes.put(Biden, 0);
	p4.pollingstationVotes.put(Biden, 0);
	p5.pollingstationVotes.put(Biden, 0);
	p6.pollingstationVotes.put(Biden, 0);
	p7.pollingstationVotes.put(Biden, 0);
	p8.pollingstationVotes.put(Biden, 0);
	p9.pollingstationVotes.put(Biden, 0);
	p10.pollingstationVotes.put(Biden, 0);
	p11.pollingstationVotes.put(Biden, 0);
	p12.pollingstationVotes.put(Biden, 0);
	p13.pollingstationVotes.put(Biden, 0);
	p14.pollingstationVotes.put(Biden, 0);
	p15.pollingstationVotes.put(Biden, 0);
	p16.pollingstationVotes.put(Biden, 0);
	p17.pollingstationVotes.put(Biden, 0);
	p18.pollingstationVotes.put(Biden, 0);
	p19.pollingstationVotes.put(Biden, 0);
	p20.pollingstationVotes.put(Biden, 0);
	
	
	p1.VoteUpdate(Trump);
	p1.VoteUpdate(Trump);
	p1.VoteUpdate(Trump);
	p1.VoteUpdate(Trump);
	p1.VoteUpdate(Trump);
	p9.VoteUpdate(Trump);
	p20.VoteUpdate(Trump);
	p16.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p17.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p6.VoteUpdate(Trump);
	p5.VoteUpdate(Trump);
	p3.VoteUpdate(Trump);
	p12.VoteUpdate(Trump);
	p19.VoteUpdate(Trump);
	p19.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p13.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p10.VoteUpdate(Trump);
	p4.VoteUpdate(Trump);
	p3.VoteUpdate(Trump);
	p2.VoteUpdate(Trump);
	p2.VoteUpdate(Trump);
	p20.VoteUpdate(Trump);
	p16.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p17.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p6.VoteUpdate(Trump);
	p5.VoteUpdate(Trump);
	p3.VoteUpdate(Trump);
	p12.VoteUpdate(Trump);
	p19.VoteUpdate(Trump);
	p19.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	p13.VoteUpdate(Trump);
	p11.VoteUpdate(Trump);
	
	p11.VoteUpdate(Biden);
	p19.VoteUpdate(Biden);
	p15.VoteUpdate(Biden);
	p11.VoteUpdate(Biden);
	p10.VoteUpdate(Biden);
	p11.VoteUpdate(Biden);
	p12.VoteUpdate(Biden);
	p13.VoteUpdate(Biden);
	p14.VoteUpdate(Biden);
	p15.VoteUpdate(Biden);
	p16.VoteUpdate(Biden);
	p17.VoteUpdate(Biden);
	p18.VoteUpdate(Biden);
	p19.VoteUpdate(Biden);
	p12.VoteUpdate(Biden);
	p16.VoteUpdate(Biden);
	p15.VoteUpdate(Biden);
	p14.VoteUpdate(Biden);
	p13.VoteUpdate(Biden);
	p12.VoteUpdate(Biden);
	p1.VoteUpdate(Biden);
	p1.VoteUpdate(Biden);
	p2.VoteUpdate(Biden);
	p3.VoteUpdate(Biden);
	p4.VoteUpdate(Biden);
	p11.VoteUpdate(Biden);
	p5.VoteUpdate(Biden);
	p18.VoteUpdate(Biden);
	p12.VoteUpdate(Biden);
	p7.VoteUpdate(Trump);
	p8.VoteUpdate(Trump);
	p8.VoteUpdate(Biden);
	p8.VoteUpdate(Trump);
	p8.VoteUpdate(Biden);
	p8.VoteUpdate(Trump);
	p8.VoteUpdate(Biden);
	p8.VoteUpdate(Trump);
	p8.VoteUpdate(Biden);
	p8.VoteUpdate(Trump);
	p8.VoteUpdate(Biden);
	p8.VoteUpdate(Trump);
	p8.VoteUpdate(Biden);
	p8.VoteUpdate(Trump);
	p8.VoteUpdate(Biden);
	
	
	//Adding the various polling-stations to the various districts
	d1.addPollingstation(p1,p2);
	d2.addPollingstation(p3,p4);
	d3.addPollingstation(p5,p6);
	d4.addPollingstation(p7,p8);
	d5.addPollingstation(p9,p10);
	d6.addPollingstation(p11,p12);
	d7.addPollingstation(p13,p14);
	d8.addPollingstation(p15,p16);
	d9.addPollingstation(p17,p18);
	d10.addPollingstation(p19,p20);
	
	//System.out.println("---" + d4.getPollingstations().size());
	
	//Adding the various districts to their regions
	Accra.addDistrict(d1,d2,d3);
	Tema.addDistrict(d4);
	//System.out.println("---" + Tema.getDistricts().size());
	Kumasi.addDistrict(d5,d10);
	Northern.addDistrict(d6,d9);
	Eastern.addDistrict(d7);
	Volta.addDistrict(d8);
	
	//adding the various regions to the nation
	Ghana.AddRegions(Accra,Tema,Kumasi,Northern,Eastern, Volta);

	
	System.out.println(Ghana.CollateNationalResults());
	

	
	
	
	}

}
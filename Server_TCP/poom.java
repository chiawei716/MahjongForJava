package final_project;



public class poom {
	
	protected String saypoom;
	
	// �P�_���S���I�A�p�G���I�b�D�{���Y�P;
	public poom(String thrown,card[] players) {
		int count = 0;
		for (int i=0;i<16;i++) {
			if (thrown.equals(players[i])) {
				count += 1;}
		}
		if (count == 2){
			this.saypoom = "�I";}
		else {
			this.saypoom = "���I";
		}
	}
	public String get_poom() {
		return saypoom;
	}
}

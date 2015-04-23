import java.util.ArrayList;
import java.util.List;


public class Details {
	private List<Detail> details;
	
	public Details() {
		details = new ArrayList<Detail>();
	}

	public List<Detail> getDetails() {
		return details;
	}
	
	public void add(Detail detail){
		details.add(detail);
	}
	
	@Override
	public String toString() {
		String s="";
		for (int i = 0; i < details.size(); i++) {
			s +="    "+ details.get(i).toString() + "\n";
		}
		return s;
	}
	
}

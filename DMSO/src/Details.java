import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Details implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 886388432897583023L;
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

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;


public class Actions {
	private Collection<Action> actions;
	
	public Actions() {
		actions = new TreeSet<Action>();
	}
	
	public Collection<Action> getActions() {
		return actions;
	}
	
	public void add(Action a){
		actions.add(a);
	}

	@Override
	public String toString() {
		String s = "    <actions>\n";
		Iterator<Action> iteAc = actions.iterator();
		while (iteAc.hasNext()) {
			s +=iteAc.next().toString() + "\n";
		}
		s +="    </actions>\n";
		return s;
	}

	


}

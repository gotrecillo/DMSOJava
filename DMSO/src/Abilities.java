import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Abilities {
	private Collection<Ability> abilities;
	
	public Abilities() {
		abilities = new TreeSet<Ability>();
	}


	public Collection<Ability> getAbilities() {
		return abilities;
	}
	
	public void add(Ability ability){
		abilities.add(ability);
	}


	@Override
	public String toString() {
		Iterator<Ability> iteAb = abilities.iterator();
		String s="    <abilities>\n";
		while (iteAb.hasNext()){
			s += iteAb.next().toString() + "\n";
		}
		s +="    </abilities>\n";
		return s;
	}
	
	
}

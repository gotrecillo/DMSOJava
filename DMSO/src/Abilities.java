import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Abilities implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -249499154900150670L;
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

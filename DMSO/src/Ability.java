
public class Ability implements Comparable<Ability>{
	private String name, description;

	
	public Ability(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "      <ability name=\"" + name + "\">"+ description + "</ability>";
	}

	@Override
	public int compareTo(Ability a) {
		return this.name.compareTo(a.name);
	}
	
}

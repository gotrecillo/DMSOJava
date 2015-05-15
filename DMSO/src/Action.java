import java.io.Serializable;


public class Action implements Comparable<Action>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5777506861332572256L;
	private String title, type, description, hit;

	public Action(String title, String type, String description, String hit) {
		this.title = title;
		this.type = type;
		this.description = description;
		this.hit = hit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}
	
	@Override
	public int compareTo(Action a) {
		return this.title.compareTo(a.title);
	}

	@Override
	public String toString() {
		String s = "      <action>\n";
		if (!title.isEmpty()){
			s += "        <title>" + title + "</title>\n";
		}
		if (!type.isEmpty()){
			s += "        <type>" + type + "</type>\n";

		}
		if (!description.isEmpty()){
			s += "        <description>" + description + "</description>\n";
		}
		if (!hit.isEmpty()){
			s += "        <hit>" + hit + "</hit>\n";
		}
		s += "      </action>";
		return s;
	}

	
	
	
	
	
}

import java.io.Serializable;


public class Detail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2338675717292147120L;
	private String name, description;
	
	public Detail(String name, String description) {
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
		return "<detail name=\"" + name + "\">"+ description + "</detail>";
	}
}

import java.util.List;

public class Family {
	public static List<Family> children;
	private int id;
	private String designation;
	private Integer parentId;
	public int getId() {
		return id;
	}
	public static List<Family> getChildren() {
		return children;
	}
	public static void setChildren(List<Family> children) {
		Family.children = children;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
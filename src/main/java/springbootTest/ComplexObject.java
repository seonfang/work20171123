package springbootTest;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexObject {
	private Map adminEmails;
	private List someList;
	private Map someMap;
	private Set someSet;
	public Map getAdminEmails() {
		return adminEmails;
	}
	public void setAdminEmails(Map adminEmails) {
		this.adminEmails = adminEmails;
	}
	public List getSomeList() {
		return someList;
	}
	public void setSomeList(List someList) {
		this.someList = someList;
	}
	public Map getSomeMap() {
		return someMap;
	}
	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}
	public Set getSomeSet() {
		return someSet;
	}
	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}
	@Override
	public String toString() {
		return "ComplexObject [adminEmails=" + adminEmails + "\n   someList=" + someList + "\n someMap=" + someMap
				+ "\n someSet=" + someSet + "]";
	}
	
	

	
	
	
	
}

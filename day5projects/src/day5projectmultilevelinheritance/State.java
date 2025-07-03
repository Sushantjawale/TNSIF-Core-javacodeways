package day5projectmultilevelinheritance;

public class State extends Country {
	
	private String statename;
	private String Language;
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	@Override
	public String toString() {
		return "State [statename=" + statename + ", Language=" + Language + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + "]";
	}
	
	
	
	
	
	

}

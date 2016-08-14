package models;

public class UserSettings {
	private int id;
	private boolean isShowName;
	private boolean isShowMail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isShowName() {
		return isShowName;
	}
	public void setShowName(boolean isShowName) {
		this.isShowName = isShowName;
	}
	public boolean isShowMail() {
		return isShowMail;
	}
	public void setShowMail(boolean isShowMail) {
		this.isShowMail = isShowMail;
	}

	
}

package com.johnjohnbear.easystudy;

public class StudyItem {
	private String text;
	private boolean gotIt=false;
	
	public StudyItem(String text) {
		this.text = text;
	}	
	
	public boolean getResult()
	{
		return gotIt;
	}
	
	public void setResult(boolean gotIt)
	{
		this.gotIt = gotIt;
	}

	public String getText() {
		return text;
	}


}

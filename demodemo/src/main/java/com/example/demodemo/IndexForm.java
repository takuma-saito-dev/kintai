package com.example.demodemo;

import java.util.ArrayList;

public class IndexForm {

    private String kiDate;
	private String kiStart;
    private String kiEnd;
    private ArrayList<IndexForm> indexList;

    public String getKiDate() {
		return kiDate;
	}
	public void setKiDate(String kiDate) {
		this.kiDate = kiDate;
	}
	public String getKiStart() {
		return kiStart;
	}
	public void setKiStart(String kiStart) {
		this.kiStart = kiStart;
	}
	public String getKiEnd() {
		return kiEnd;
	}
	public void setKiEnd(String kiEnd) {
		this.kiEnd = kiEnd;
	}
	public ArrayList<IndexForm> getIndexList() {
		return indexList;
	}
	public void setIndexList(ArrayList<IndexForm> indexList) {
		this.indexList = indexList;
	}

}
package com.nishant;

public class Region {

	Integer regionId;
	String regionName;
	public int getRegionId() {
		return regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	public Region(Integer regionId,String regionName) {
		// TODO Auto-generated constructor stub
		this.setRegionId(regionId);
		this.setRegionName(regionName);
	}
}

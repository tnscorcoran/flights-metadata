package com.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaDataLocation {
	private Map<String, MetaData> locTypeMap;
	private Map<String, List<MetaData>> locationsMap;


	public MetaDataLocation(MetaData locationType, List<MetaData> locations) {
		super();
		locTypeMap = new HashMap<String, MetaData> ();
		locationsMap = new HashMap<String, List<MetaData>> ();
		locTypeMap.put("locType", locationType);
		locationsMap.put("locations", locations);
	}


	public Map<String, MetaData> getLocTypeMap() {
		return locTypeMap;
	}


	public void setLocTypeMap(Map<String, MetaData> locTypeMap) {
		this.locTypeMap = locTypeMap;
	}


	public Map<String, List<MetaData>> getLocationsMap() {
		return locationsMap;
	}


	public void setLocationsMap(Map<String, List<MetaData>> locationsMap) {
		this.locationsMap = locationsMap;
	}
	
	
	
}

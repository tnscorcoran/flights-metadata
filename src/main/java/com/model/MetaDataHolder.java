package com.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaDataHolder {
	private Map<String, List<MetaData>> mapMetaData;


	public MetaDataHolder() {
		super();
		mapMetaData = new HashMap<String, List<MetaData>>();
	}

	public Map<String, List<MetaData>> getMapMetaData() {
		return mapMetaData;
	}

	public void setMapMetaData(Map<String, List<MetaData>> mapMetaData) {
		this.mapMetaData = mapMetaData;
	}
	
	

	
}

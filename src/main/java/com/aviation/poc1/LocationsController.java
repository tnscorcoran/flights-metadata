package com.aviation.poc1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.GenericResult;
import com.model.MetaData;
import com.model.MetaDataLocation;

@Controller
public class LocationsController {
	   
	
	
	@RequestMapping(value="/dirrestweb/rest/cities", method=RequestMethod.GET, produces="application/json") 
    public @ResponseBody List<MetaData> getCities() {
		
		List<MetaData> carriers = new ArrayList<MetaData>();
		carriers.add(new MetaData("AAA", "ANAA FRENCH POLYNESIA"));
		carriers.add(new MetaData("AAB", "AARABURY, AUSTRALIA"));
		
    	return carriers;   	
    }
	

	
	@RequestMapping(value="/dirrestweb/rest/extendedLocations/search/{id}", method=RequestMethod.GET, produces="application/json") 
    public @ResponseBody Map<String, List<MetaDataLocation>> getExtendedLocations(@PathVariable("id") String id) {

		Map<String, List<MetaDataLocation>> extendedLocations = new HashMap <String, List<MetaDataLocation>>();
		
		List<MetaDataLocation> locationList = new ArrayList<MetaDataLocation>();
		
		MetaDataLocation metaDataLocation = new MetaDataLocation(new MetaData("A", "areas"), new ArrayList<MetaData>());
		locationList.add(metaDataLocation);
		
		
		List<MetaData> listLocationMetadata = new ArrayList<MetaData>();
		MetaData metaData = new MetaData("AAA", "ANAA FRENCH POLYNESIA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAB", "AARABURY, AUSTRALIA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAC", "ALARISH, EGYPT");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAE", "ANNABA, ALGERIA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAK", "ARANUKA, KIRIBATI");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAL", "AALBORG, DENMARK");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAO", "ANACO, VENEZUELA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAR", "AARHUS, DENMARK");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAT", "ALTAY, CHINA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAU", "ASAU, SAMOA, WESTERN");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAV", "ALAH, PHILIPPINES");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAX", "ARAXA, BRAZIL");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("AAY", "AL GHAYDAH, YEMEN, REPUBLIC OF");
		listLocationMetadata.add(metaData);
		metaDataLocation = new MetaDataLocation(new MetaData("C", "cities"), listLocationMetadata);
		locationList.add(metaDataLocation);
		
		
		listLocationMetadata = new ArrayList<MetaData>();
		metaData = new MetaData("", "");
		listLocationMetadata.add(metaData);
		metaDataLocation = new MetaDataLocation(new MetaData("S", "states"), listLocationMetadata);
		locationList.add(metaDataLocation);

		listLocationMetadata = new ArrayList<MetaData>();
		metaData = new MetaData("", "");
		listLocationMetadata.add(metaData);
		metaDataLocation = new MetaDataLocation(new MetaData("Z", "zones"), listLocationMetadata);
		locationList.add(metaDataLocation);

		listLocationMetadata = new ArrayList<MetaData>();
		metaData = new MetaData("", "");
		listLocationMetadata.add(metaData);
		metaDataLocation = new MetaDataLocation(new MetaData("N", "nations"), listLocationMetadata);
		locationList.add(metaDataLocation);
		
		extendedLocations.put("byCode", locationList);
		
		
				
		locationList = new ArrayList<MetaDataLocation>();
		
		metaDataLocation = new MetaDataLocation(new MetaData("A", "areas"), new ArrayList<MetaData>());
		locationList.add(metaDataLocation);
		
		listLocationMetadata = new ArrayList<MetaData>();
		metaData = new MetaData("123", "AAAAAAAAA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("124", "AAABBBBLJJ");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("129", "AAAAAAA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("255", "AAAAAAA");
		listLocationMetadata.add(metaData);
		metaData = new MetaData("299", "AAAAAAA");
		listLocationMetadata.add(metaData);
		metaDataLocation = new MetaDataLocation(new MetaData("Z", "zones"), listLocationMetadata);
		locationList.add(metaDataLocation);
		
		listLocationMetadata = new ArrayList<MetaData>();
		metaData = new MetaData("CE", "AAAAA");
		listLocationMetadata.add(metaData);
		metaDataLocation = new MetaDataLocation(new MetaData("N", "nations"), listLocationMetadata);
		locationList.add(metaDataLocation);
		
		extendedLocations.put("byDesc", locationList);

		
    	return extendedLocations;
    	
    }
	
	
	@RequestMapping(value="/eng/FMfarerulemerge", method=RequestMethod.GET, produces="application/json") 
    public @ResponseBody GenericResult getFMfarerulemerge() {
		
		return new GenericResult("This method returns a 1MB payload");
    }
	
	//******************************************* Private Methods *******************************************
	

	
}

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
public class CarriersController {
	   
	
	@RequestMapping(value="/dirrestweb/rest/carriers", method=RequestMethod.GET, produces="application/json") 
    public @ResponseBody List<MetaData> getCarriers() {
		
		List<MetaData> carriers = new ArrayList<MetaData>();
		carriers.add(new MetaData("#1", "VENDOR CODE TEST"));
		carriers.add(new MetaData("$1", "VENDOR CODE TEST"));
		
    	return carriers;   	
    }
	
	@RequestMapping(value="/dirrestweb/rest/carrier/{id}", method=RequestMethod.GET, produces="application/json") 
    public @ResponseBody MetaData getCarrier(@PathVariable("id") String id) {
		
		MetaData carrier = new MetaData(id, "Q DATA SET NAME PROJECT");
				
    	return carrier;
    	
    }
	
	@RequestMapping(value="/dirrestweb/rest/carriers/search/{id}", method=RequestMethod.GET, produces="application/json") 
    public @ResponseBody Map<String, List<MetaData>> getCarrierSearch(@PathVariable("id") String id) {

		Map<String, List<MetaData>> mapListMetaData = new HashMap <String, List<MetaData>>();

		List<MetaData> carriers = new ArrayList<MetaData>();		
		carriers.add(new MetaData("00", "Q DATA SET NAME PROJECT"));
		carriers.add(new MetaData("001", "THREE POSITION VENDOR CODE"));
		carriers.add(new MetaData("004", "WORL"));
		carriers.add(new MetaData("007", "DOJ TEST VENDOR"));
		mapListMetaData.put("byCode", carriers);
		
		carriers = new ArrayList<MetaData>();
		mapListMetaData.put("byDesc", carriers);
		
    	return mapListMetaData;
    	
    }

	
	
}

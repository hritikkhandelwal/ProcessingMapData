package Processing_Map_Data_with_Metadata.Sample;
import java.util.*;
import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class processingMapData {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			List<Locations> locationData = Arrays.asList(mapper.readValue(new File("locations.json"), Locations[].class));
			List<metaData> metaData = Arrays.asList(mapper.readValue(new File("metadata.json"), metaData[].class));
			
			List<Locations> mergedData = dataMerger.mergeData(locationData, metaData);
			/*for(Locations loc : mergedData) {
				System.out.println(loc.getID()+" "+loc.getType());
			}*/
			locationDataAnalysis processedData = new locationDataAnalysis(mergedData);
			
			Analysis getResult = new Analysis(processedData);
			
			getResult.processData();
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

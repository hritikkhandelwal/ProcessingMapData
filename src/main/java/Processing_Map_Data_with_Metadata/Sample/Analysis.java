package Processing_Map_Data_with_Metadata.Sample;
import java.util.*;

public class Analysis {
	locationDataAnalysis processedData;
	
	Analysis(locationDataAnalysis processedData){
		this.processedData = processedData;
	}
	
	public void processData() {
		Map<String,Integer> countPerType = processedData.countValidPointsPerType();
		Map<String,Double> averageRatingPerType = processedData.averageRatingPerType();
		Locations highestReviewed = processedData.getLocationWithHighestReviews();
		List<Locations> incompleteLocation = processedData.incompleteDataLocation();
		
		// Print number of  Valid Points per Type
		System.out.println("Count Valid Points Per Type");
		for(Map.Entry<String,Integer> entry : countPerType.entrySet()) {
			String type = entry.getKey();
			int value = entry.getValue();
			System.out.println(type+" : "+ value);
		}
		
		// Print Average Rating per Type
		System.out.println("Average Rating Per Type");
		for(Map.Entry<String,Double> entry : averageRatingPerType.entrySet()) {
			String type = entry.getKey();
			Double value = entry.getValue();
			System.out.println(type+" : "+ value);
		}
		
		//Print Location with Highest Review
		System.out.println("Location with Highest Review : " + highestReviewed.getID());
		
		//Print Locations with Incomplete Data
		System.out.println("Locations with Incomplete Data : ");
		for(Locations location : incompleteLocation) {
			System.out.println(location.getID());
		}
	}
}

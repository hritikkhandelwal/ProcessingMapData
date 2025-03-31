package Processing_Map_Data_with_Metadata.Sample;
import java.util.*;

public class dataMerger {
	public static List<Locations> mergeData(List<Locations>locations, List<metaData> metaData){
		for(Locations loc : locations) {
			for(metaData data : metaData) {
				if(loc.getID().equals(data.getID())) {
					loc.setType(data.getType());
					loc.setRatings(data.getRating());
					loc.setReview(data.getReviews());
				}
			}
		}
		return locations;
	}
}

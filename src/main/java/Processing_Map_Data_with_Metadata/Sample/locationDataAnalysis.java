package Processing_Map_Data_with_Metadata.Sample;
import java.util.*;

public class locationDataAnalysis {
	List<Locations> locations;
	
	locationDataAnalysis(List<Locations> locations){
		this.locations = locations;
	}
	
	public Map<String,Integer> countValidPointsPerType(){
		Map<String,Integer> countTypes = new HashMap<>();
		for(Locations location : locations) {
			if(location.getType()!=null) {
				if(countTypes.containsKey(location.getType())) {
					countTypes.put(location.getType(), countTypes.get(location.getType())+1);
				}else {
					countTypes.put(location.getType(), 1);
				}
			}
		}
		return countTypes;
	}
	
	public Map<String, Double> averageRatingPerType() {
        Map<String, Double> sum = new HashMap<String, Double>();
        Map<String, Integer> count = new HashMap<String, Integer>();
        
        for (Locations location : locations) {
            if (location.getType() != null && location.getRating() != null) {
                if (sum.containsKey(location.getType())) {
                    sum.put(location.getType(), sum.get(location.getType()) + location.getRating());
                    count.put(location.getType(), count.get(location.getType()) + 1);
                } else {
                    sum.put(location.getType(), location.getRating());
                    count.put(location.getType(), 1);
                }
            }
        }

        Map<String, Double> averageRating = new HashMap<String, Double>();
        for (String type : sum.keySet()) {
            double avg = sum.get(type) / count.get(type);
            averageRating.put(type, avg);
        }
        return averageRating;
    }
	
	public Locations getLocationWithHighestReviews() {
        Locations highest = null;
        int maxReview = Integer.MIN_VALUE;
        for (Locations location : locations) {
            if (location.getReviews() != null && location.getReviews() > maxReview) {
                maxReview = location.getReviews();
                highest = location;
            }
        }
        return highest;
    }

    public List<Locations> incompleteDataLocation() {
        List<Locations> incompleteData = new ArrayList<Locations>();
        for (Locations location : locations) {
            if (location.getType().equals("") || location.getRating().equals("") || location.getReviews() == 0) {
                incompleteData.add(location);
            }
        }
        return incompleteData;
    }
}

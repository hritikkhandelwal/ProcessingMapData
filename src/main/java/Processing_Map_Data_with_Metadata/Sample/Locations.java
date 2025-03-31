package Processing_Map_Data_with_Metadata.Sample;
import java.util.*;

public class Locations {
	private String id;
	private Double longitude;
	private Double latitude;
	
	private String type;
	private Double rating;
	private Integer reviews;
	
	public Locations() {
    }
	
	public Locations(String id, Double longitude, Double latitude){
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String getID() {
		return id;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public String getType() {
		return type;
	}
	
	public Double getRating() {
		return rating;
	}
	
	public Integer getReviews() {
		return reviews;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setRatings(Double rating) {
		this.rating =  rating;
	}
	
	public void setReview(Integer reviews) {
		this.reviews =  reviews;
	}
}

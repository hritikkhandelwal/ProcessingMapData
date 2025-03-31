package Processing_Map_Data_with_Metadata.Sample;

public class metaData {
	String id;
	String type;
	Double rating;
	Integer reviews;
	
	public metaData() {
		
	}
	
	public metaData(String id, String type, Double rating, Integer reviews){
		this.id = id;
		this.type = type;
		this.rating = rating;
		this.reviews = reviews;
	}
	
	public String getID() {
		return id;
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
	
	public void setID(String id) {
		this.id = id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	public void setReviews(Integer reviews) {
		this.reviews = reviews;
	}
}

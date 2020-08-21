package io.javabrains.ratingsdataservice.models;

import java.util.List;

public class UserRating {
	
	public UserRating() {
		// TODO Auto-generated constructor stub
	}
	
    private List<Rating> ratings;

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

	
    
    

    /*public void initData(String userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating("100", 3),
                new Rating("200", 4)
        ));
    }*/

}

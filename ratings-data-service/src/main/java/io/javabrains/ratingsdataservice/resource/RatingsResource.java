package io.javabrains.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ratingsdataservice.models.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	@RequestMapping("users/{userId}")
	public List<Rating> getUserRatings(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1233", 5),
				new Rating("34", 3)
				);
		 
		return ratings;
	}

}

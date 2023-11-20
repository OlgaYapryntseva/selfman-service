package telran.selfman.factory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RatingDto {
	Integer numberOfRatings;
	Integer totalScore;
	Double avergeScore;
}

package telran.selfman.factory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Rating {
	Integer numberOfRatings;
	Integer totalScore;
	Double avergeScore;

	public void addnumberOfRatings() {
		numberOfRatings++;
	}

	public void addScore(Integer score) {
		totalScore += score;
	}

	public void getAvergeScore() {
		avergeScore = (double) totalScore / numberOfRatings;
	}
}

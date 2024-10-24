package ReqpediaTables;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployerReviews")
public class EmployerReview {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long reviewId;

	    @ManyToOne
	    @JoinColumn(name = "employerId")
	    private Employer employer;

	    @ManyToOne
	    @JoinColumn(name = "seekerId")
	    private JobSeeker seeker;

	    private String reviewContent;
	    private int rating; // Assuming rating is between 1 and 5
	    private Date reviewDate;
		public EmployerReview(Long reviewId, Employer employer, JobSeeker seeker, String reviewContent, int rating,
				Date reviewDate) {
			super();
			this.reviewId = reviewId;
			this.employer = employer;
			this.seeker = seeker;
			this.reviewContent = reviewContent;
			this.rating = rating;
			this.reviewDate = reviewDate;
		}
		public Long getReviewId() {
			return reviewId;
		}
		public void setReviewId(Long reviewId) {
			this.reviewId = reviewId;
		}
		public Employer getEmployer() {
			return employer;
		}
		public void setEmployer(Employer employer) {
			this.employer = employer;
		}
		public JobSeeker getSeeker() {
			return seeker;
		}
		public void setSeeker(JobSeeker seeker) {
			this.seeker = seeker;
		}
		public String getReviewContent() {
			return reviewContent;
		}
		public void setReviewContent(String reviewContent) {
			this.reviewContent = reviewContent;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public Date getReviewDate() {
			return reviewDate;
		}
		public void setReviewDate(Date reviewDate) {
			this.reviewDate = reviewDate;
		}
		@Override
		public String toString() {
			return "EmployerReview [reviewId=" + reviewId + ", employer=" + employer + ", seeker=" + seeker
					+ ", reviewContent=" + reviewContent + ", rating=" + rating + ", reviewDate=" + reviewDate + "]";
		}

}

package ReqpediaTables;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "JobSeekerProfiles")
public class JobSeekerProfile {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long profileId;

	    @ManyToOne
	    @JoinColumn(name = "seekerId")
	    private JobSeeker seeker;

	    private String linkedInProfile;
	    private String gitHubProfile;
	    private String portfolioUrl;
	    private String summary;
		public JobSeekerProfile(Long profileId, JobSeeker seeker, String linkedInProfile, String gitHubProfile,
				String portfolioUrl, String summary) {
			super();
			this.profileId = profileId;
			this.seeker = seeker;
			this.linkedInProfile = linkedInProfile;
			this.gitHubProfile = gitHubProfile;
			this.portfolioUrl = portfolioUrl;
			this.summary = summary;
		}
		public Long getProfileId() {
			return profileId;
		}
		public void setProfileId(Long profileId) {
			this.profileId = profileId;
		}
		public JobSeeker getSeeker() {
			return seeker;
		}
		public void setSeeker(JobSeeker seeker) {
			this.seeker = seeker;
		}
		public String getLinkedInProfile() {
			return linkedInProfile;
		}
		public void setLinkedInProfile(String linkedInProfile) {
			this.linkedInProfile = linkedInProfile;
		}
		public String getGitHubProfile() {
			return gitHubProfile;
		}
		public void setGitHubProfile(String gitHubProfile) {
			this.gitHubProfile = gitHubProfile;
		}
		public String getPortfolioUrl() {
			return portfolioUrl;
		}
		public void setPortfolioUrl(String portfolioUrl) {
			this.portfolioUrl = portfolioUrl;
		}
		public String getSummary() {
			return summary;
		}
		public void setSummary(String summary) {
			this.summary = summary;
		}
		@Override
		public String toString() {
			return "JobSeekerProfile [profileId=" + profileId + ", seeker=" + seeker + ", linkedInProfile="
					+ linkedInProfile + ", gitHubProfile=" + gitHubProfile + ", portfolioUrl=" + portfolioUrl
					+ ", summary=" + summary + "]";
		}

}

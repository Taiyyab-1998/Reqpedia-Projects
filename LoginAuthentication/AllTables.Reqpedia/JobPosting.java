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
@Table(name = "JobPostings")
public class JobPosting {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long jobId;

	    @ManyToOne
	    @JoinColumn(name = "employerId")
	    private Employer employer;

	    private String jobTitle;
	    private String jobDescription;
	    private String requiredSkills; // Can be JSON or String representation
	    private int experienceRequired;
	    private String salaryRange;
	    private String location;
	    private String jobType;
	    private Date postedDate;
	    private Date closingDate;
	    private String status;
		public JobPosting(Long jobId, Employer employer, String jobTitle, String jobDescription, String requiredSkills,
				int experienceRequired, String salaryRange, String location, String jobType, Date postedDate,
				Date closingDate, String status) {
			super();
			this.jobId = jobId;
			this.employer = employer;
			this.jobTitle = jobTitle;
			this.jobDescription = jobDescription;
			this.requiredSkills = requiredSkills;
			this.experienceRequired = experienceRequired;
			this.salaryRange = salaryRange;
			this.location = location;
			this.jobType = jobType;
			this.postedDate = postedDate;
			this.closingDate = closingDate;
			this.status = status;
		}
		public Long getJobId() {
			return jobId;
		}
		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}
		public Employer getEmployer() {
			return employer;
		}
		public void setEmployer(Employer employer) {
			this.employer = employer;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		public String getJobDescription() {
			return jobDescription;
		}
		public void setJobDescription(String jobDescription) {
			this.jobDescription = jobDescription;
		}
		public String getRequiredSkills() {
			return requiredSkills;
		}
		public void setRequiredSkills(String requiredSkills) {
			this.requiredSkills = requiredSkills;
		}
		public int getExperienceRequired() {
			return experienceRequired;
		}
		public void setExperienceRequired(int experienceRequired) {
			this.experienceRequired = experienceRequired;
		}
		public String getSalaryRange() {
			return salaryRange;
		}
		public void setSalaryRange(String salaryRange) {
			this.salaryRange = salaryRange;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getJobType() {
			return jobType;
		}
		public void setJobType(String jobType) {
			this.jobType = jobType;
		}
		public Date getPostedDate() {
			return postedDate;
		}
		public void setPostedDate(Date postedDate) {
			this.postedDate = postedDate;
		}
		public Date getClosingDate() {
			return closingDate;
		}
		public void setClosingDate(Date closingDate) {
			this.closingDate = closingDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "JobPosting [jobId=" + jobId + ", employer=" + employer + ", jobTitle=" + jobTitle
					+ ", jobDescription=" + jobDescription + ", requiredSkills=" + requiredSkills
					+ ", experienceRequired=" + experienceRequired + ", salaryRange=" + salaryRange + ", location="
					+ location + ", jobType=" + jobType + ", postedDate=" + postedDate + ", closingDate=" + closingDate
					+ ", status=" + status + "]";
		}


}

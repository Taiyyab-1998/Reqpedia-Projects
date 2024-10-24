package ReqpediaTables;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "JobSeekers")
public class JobSeeker {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long seekerId;

	    private String firstName;
	    private String lastName;
	    private String email;
	    private String phone;
	    private String resumeLink;
	    private String skills; // Can be JSON or String representation
	    private int experienceYears;
	    private String educationLevel;
	    private String location;
	    private String preferredJobType;
	    private Date dateRegistered;
	    private String status;
		public JobSeeker(Long seekerId, String firstName, String lastName, String email, String phone,
				String resumeLink, String skills, int experienceYears, String educationLevel, String location,
				String preferredJobType, Date dateRegistered, String status) {
			super();
			this.seekerId = seekerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
			this.resumeLink = resumeLink;
			this.skills = skills;
			this.experienceYears = experienceYears;
			this.educationLevel = educationLevel;
			this.location = location;
			this.preferredJobType = preferredJobType;
			this.dateRegistered = dateRegistered;
			this.status = status;
		}
		public Long getSeekerId() {
			return seekerId;
		}
		public void setSeekerId(Long seekerId) {
			this.seekerId = seekerId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getResumeLink() {
			return resumeLink;
		}
		public void setResumeLink(String resumeLink) {
			this.resumeLink = resumeLink;
		}
		public String getSkills() {
			return skills;
		}
		public void setSkills(String skills) {
			this.skills = skills;
		}
		public int getExperienceYears() {
			return experienceYears;
		}
		public void setExperienceYears(int experienceYears) {
			this.experienceYears = experienceYears;
		}
		public String getEducationLevel() {
			return educationLevel;
		}
		public void setEducationLevel(String educationLevel) {
			this.educationLevel = educationLevel;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getPreferredJobType() {
			return preferredJobType;
		}
		public void setPreferredJobType(String preferredJobType) {
			this.preferredJobType = preferredJobType;
		}
		public Date getDateRegistered() {
			return dateRegistered;
		}
		public void setDateRegistered(Date dateRegistered) {
			this.dateRegistered = dateRegistered;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "JobSeeker [seekerId=" + seekerId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", phone=" + phone + ", resumeLink=" + resumeLink + ", skills=" + skills
					+ ", experienceYears=" + experienceYears + ", educationLevel=" + educationLevel + ", location="
					+ location + ", preferredJobType=" + preferredJobType + ", dateRegistered=" + dateRegistered
					+ ", status=" + status + "]";
		}



}

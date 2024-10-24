//This declares the package that the Application class is part of,
//named ReqpediaTables. It helps organize your code and avoid class name conflicts.
package ReqpediaTables;

import java.util.Date;

//These are the import statements needed for the class.
//You’re importing JPA annotations and classes (Entity, Id, GeneratedValue, etc.)
//to map the class to a database table. You're also importing java.util.Date to handle date information.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


//@Entity: This tells JPA that this class is a database entity (a table in the database).
//@Table(name = "Applications"): This specifies the name of the database table as Applications.
//If not specified, JPA will assume the table name matches the class name.
@Entity
@Table(name = "Applications")
public class Application {
	    //@Id: Marks applicationId as the primary key of the table.
	    @Id
	    //@GeneratedValue(strategy = GenerationType.IDENTITY):
	    //This annotation tells JPA to auto-generate the applicationId value.
	    //The IDENTITY strategy indicates that the database will generate the primary key upon inserting a new record.
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long applicationId;
        //@ManyToOne: Specifies a many-to-one relationship between Application and JobPosting.
	    //Many applications can be associated with one job posting.
	    @ManyToOne
	    //@JoinColumn(name = "jobId"): Specifies the foreign key column jobId in the Applications table,
	    //which links to the primary key of the JobPosting entity.
	    @JoinColumn(name = "jobId")
	    private JobPosting job;

	    @ManyToOne
	    @JoinColumn(name = "seekerId")
	    private JobSeeker seeker;

	    private Date applicationDate;
	    private String status;
	    //This is a parameterized constructor used to create an Application object with values for all fields.
	    //It initializes the object with specific data when it's instantiated.
		public Application(Long applicationId, JobPosting job, JobSeeker seeker, Date applicationDate, String status) {
			super();
			this.applicationId = applicationId;
			this.job = job;
			this.seeker = seeker;
			this.applicationDate = applicationDate;
			this.status = status;
		}
		//getApplicationId() returns the value of the applicationId field.
		//setApplicationId() updates the value of the applicationId field.
		public Long getApplicationId() {
			return applicationId;
		}
		public void setApplicationId(Long applicationId) {
			this.applicationId = applicationId;
		}
		public JobPosting getJob() {
			return job;
		}
		public void setJob(JobPosting job) {
			this.job = job;
		}
		public JobSeeker getSeeker() {
			return seeker;
		}
		public void setSeeker(JobSeeker seeker) {
			this.seeker = seeker;
		}
		public Date getApplicationDate() {
			return applicationDate;
		}
		public void setApplicationDate(Date applicationDate) {
			this.applicationDate = applicationDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		//The toString() method returns a string representation of the Application object.
		//This is helpful for debugging or logging, providing a human-readable summary of the object’s state.
		@Override
		public String toString() {
			return "Application [applicationId=" + applicationId + ", job=" + job + ", seeker=" + seeker
					+ ", applicationDate=" + applicationDate + ", status=" + status + "]";
		}

}

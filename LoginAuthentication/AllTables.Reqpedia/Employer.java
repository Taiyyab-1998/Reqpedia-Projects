package ReqpediaTables;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employers")
public class Employer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employerId;

    private String companyName;
    private String industry;
    private String contactPerson;
    private String email;
    private String phone;
    private String location;
    private String website;
    private Date dateRegistered;
	public Employer(Long employerId, String companyName, String industry, String contactPerson, String email,
			String phone, String location, String website, Date dateRegistered) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.industry = industry;
		this.contactPerson = contactPerson;
		this.email = email;
		this.phone = phone;
		this.location = location;
		this.website = website;
		this.dateRegistered = dateRegistered;
	}
	public Long getEmployerId() {
		return employerId;
	}
	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Date getDateRegistered() {
		return dateRegistered;
	}
	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	@Override
	public String toString() {
		return "Employer [employerId=" + employerId + ", companyName=" + companyName + ", industry=" + industry
				+ ", contactPerson=" + contactPerson + ", email=" + email + ", phone=" + phone + ", location="
				+ location + ", website=" + website + ", dateRegistered=" + dateRegistered + "]";
	}


}

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
@Table(name = "EmployerAccounts")
public class EmployerAccount {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @ManyToOne
    @JoinColumn(name = "employerId")
    private Employer employer;

    private String subscriptionPlan; // Free, Standard, Premium
    private Date planStartDate;
    private Date planEndDate;
    private String paymentDetails;
	public EmployerAccount(Long accountId, Employer employer, String subscriptionPlan, Date planStartDate,
			Date planEndDate, String paymentDetails) {
		super();
		this.accountId = accountId;
		this.employer = employer;
		this.subscriptionPlan = subscriptionPlan;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.paymentDetails = paymentDetails;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public String getSubscriptionPlan() {
		return subscriptionPlan;
	}
	public void setSubscriptionPlan(String subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}
	public Date getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(Date planStartDate) {
		this.planStartDate = planStartDate;
	}
	public Date getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	@Override
	public String toString() {
		return "EmployerAccount [accountId=" + accountId + ", employer=" + employer + ", subscriptionPlan="
				+ subscriptionPlan + ", planStartDate=" + planStartDate + ", planEndDate=" + planEndDate
				+ ", paymentDetails=" + paymentDetails + "]";
	}

}

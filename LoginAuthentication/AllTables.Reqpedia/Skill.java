package ReqpediaTables;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Skills")

public class Skill {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    private String skillName;
    private String skillCategory;
	public Skill(Long skillId, String skillName, String skillCategory) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.skillCategory = skillCategory;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillCategory() {
		return skillCategory;
	}
	public void setSkillCategory(String skillCategory) {
		this.skillCategory = skillCategory;
	}
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", skillCategory=" + skillCategory + "]";
	}

}

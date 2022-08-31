package Covid.Covid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="survey")
@Entity
public class SurveyPojo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String quest1;
	private String quest2;
	private String quest3;
	private String quest4;
	private String quest5;
	private String quest6;
	private String quest7;
	private String symptoms;
	private String symptoms2;
	private String date;
	
	
	
	
	
	
	public SurveyPojo() {
		super();
	}

	public SurveyPojo(Long id, String name, String quest1, String quest2, String quest3, String quest4, String quest5,
			String quest6, String quest7, String symptoms, String symptoms2,String date) {
		super();
		this.id = id;
		this.name = name;
		this.quest1 = quest1;
		this.quest2 = quest2;
		this.quest3 = quest3;
		this.quest4 = quest4;
		this.quest5 = quest5;
		this.quest6 = quest6;
		this.quest7 = quest7;
		this.symptoms = symptoms;
		this.symptoms2 = symptoms2;
		this.date = date;
	}
	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuest1() {
		return quest1;
	}
	public void setQuest1(String quest1) {
		this.quest1 = quest1;
	}
	public String getQuest2() {
		return quest2;
	}
	public void setQuest2(String quest2) {
		this.quest2 = quest2;
	}
	public String getQuest3() {
		return quest3;
	}
	public void setQuest3(String quest3) {
		this.quest3 = quest3;
	}
	public String getQuest4() {
		return quest4;
	}
	public void setQuest4(String quest4) {
		this.quest4 = quest4;
	}
	public String getQuest5() {
		return quest5;
	}
	public void setQuest5(String quest5) {
		this.quest5 = quest5;
	}
	public String getQuest6() {
		return quest6;
	}
	public void setQuest6(String quest6) {
		this.quest6 = quest6;
	}
	public String getQuest7() {
		return quest7;
	}
	public void setQuest7(String quest7) {
		this.quest7 = quest7;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getSymptoms2() {
		return symptoms2;
	}
	public void setSymptoms2(String symptoms2) {
		this.symptoms2 = symptoms2;
	}

	@Override
	public String toString() {
		return "SurveyPojo [id=" + id + ", name=" + name + ", quest1=" + quest1 + ", quest2=" + quest2 + ", quest3="
				+ quest3 + ", quest4=" + quest4 + ", quest5=" + quest5 + ", quest6=" + quest6 + ", quest7=" + quest7
				+ ", symptoms=" + symptoms + ", symptoms2=" + symptoms2 + ", date=" + date + "]";
	}
	
	
	
	

}

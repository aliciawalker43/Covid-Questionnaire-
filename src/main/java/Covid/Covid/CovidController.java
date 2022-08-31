package Covid.Covid;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CovidController {
	
	@Autowired
	private SurveyDao surveyDao;
	
	@RequestMapping("/")
	public String showHome() {
		
		return "homepage";
	}

	
	
	@RequestMapping("/questions")
	public String showQuestions(){
		
		return "questionsform";
	}
	
	@PostMapping("/anwsers")
	public String submitAnswers(Model model,@RequestParam ("name") String name,
			@RequestParam ("quest1") String quest1,
			@RequestParam ("quest2") String quest2,
			@RequestParam ("quest3") String quest3,
			@RequestParam ("quest4") String quest4,
			@RequestParam ("quest5") String quest5,
			@RequestParam ("quest6") String quest6,
			@RequestParam ("quest7") String quest7,
			@RequestParam ("symptoms") String symp,
			@RequestParam ("symptoms2") String sym2){
		
		LocalDateTime myObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDate = myObj.format(myFormatObj);
		
		SurveyPojo answers= new SurveyPojo();
		
	answers.setName(name);
	answers.setQuest1(quest1);
	answers.setQuest2(quest2);
	answers.setQuest3(quest3);
	answers.setQuest4(quest4);
	answers.setQuest5(quest5);
	answers.setQuest6(quest6);
	answers.setQuest7(quest7);
	answers.setSymptoms(symp);
	answers.setSymptoms2(sym2);	
	answers.setDate(formattedDate);
	
		surveyDao.save(answers);
		
		String msg="Thank you!";
		
		model.addAttribute("message", msg);
		return "redirect:/";
		
	}
	
	@RequestMapping("/results")
	public String showResults(Model model){
	
		List<SurveyPojo> list= surveyDao.findAll();
		
		
		model.addAttribute("results", list);
		return "results";
	}
	
	@RequestMapping("results/delete")
	public String remove(@RequestParam("id") Long id) {
		
		surveyDao.deleteById(id);
		
		return "redirect:/";
	}
}

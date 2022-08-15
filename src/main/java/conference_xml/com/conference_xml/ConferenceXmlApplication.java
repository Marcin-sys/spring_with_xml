package conference_xml.com.conference_xml;


import conference_xml.com.conference_xml.service.SpeakerService;
import conference_xml.com.conference_xml.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConferenceXmlApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//		SpeakerService service = new SpeakerServiceImpl();
		SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);


		System.out.println(service.findAll().get(0).getFirstName());
	}

}

package conference_xml.com.conference_xml.repository;

import conference_xml.com.conference_xml.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{

    public List<Speaker> findAll(){
        List<Speaker> speakerList = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");

        speakerList.add(speaker);

        return speakerList;
    }
}

package conference_xml.com.conference_xml.repository;

import conference_xml.com.conference_xml.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
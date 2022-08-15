package conference_xml.com.conference_xml.service;

import conference_xml.com.conference_xml.model.Speaker;
import conference_xml.com.conference_xml.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
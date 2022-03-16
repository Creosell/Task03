package by.tc.task01.dao.impl;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder extends ApplianceBuilder{
    @Override
    Speakers build(String line) {
        Speakers speakers = new Speakers();
        String[] parameters = findParameters(line);

        speakers.setPowerConsumption(Integer.parseInt(parameters[0]));
        speakers.setNumberOfSpeakers(Integer.parseInt(parameters[1]));
        speakers.setFrequencyRange(parameters[2]);
        speakers.setCordLength(Double.parseDouble(parameters[3]));
        return speakers;
    }
}

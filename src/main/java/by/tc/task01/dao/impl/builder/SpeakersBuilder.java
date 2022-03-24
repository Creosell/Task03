package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder extends ProductBuilder {
    private final String lineWithParameters;

    public SpeakersBuilder(final String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }

    @Override
    public Speakers build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[4];
        double price = Double.parseDouble(parameters[5]);
        String frequencyRange = parameters[2];
        Speakers speakers = new Speakers(manufacturer, price, frequencyRange);

        if (parameters[0] != null && parameters[1] != null && parameters[3] != null) {
            speakers.setPowerOutput(Integer.parseInt(parameters[0]));
            speakers.setNumberOfSpeakers(Integer.parseInt(parameters[1]));
            speakers.setCordLength(Double.parseDouble(parameters[3]));
        }

        return speakers;
    }
}

package by.tc.task01.dao.impl;

class ApplianceBuilder {

    Object build(String line) {
        return new Object();
    }

    String[] findParameters(final String line) {
        char[] charArray = line.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '=') {
                while (charArray[i] != ',' && i < charArray.length - 1) {
                    i++;
                    builder.append(charArray[i]);
                }
            }
        }
        return builder.toString().split(",");
    }
}

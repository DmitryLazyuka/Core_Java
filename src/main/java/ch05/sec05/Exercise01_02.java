package ch05.sec05;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;



public class Exercise01_02 {
    public static final Logger LOG = LogManager.getLogger(Exercise01_02.class);

    public static ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> values = new ArrayList<>();
        LOG.info("ArrayList was created");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            LOG.info("Buffered reader was created");
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split(" ");
                LOG.info("Line " + line);
                for (String number : numbers) {
                    try {
                        Double value = Double.parseDouble(number);
                        LOG.info(value + " was parsed");
                        values.add(value);
                        LOG.info("Value was added to the Array List");
                    } catch (NumberFormatException e) {
                        LOG.warn("Number format esception");
                        throw new RuntimeException("Error: could not parse value in file: " + number, e);

                    }
                }
            }
        } catch (IOException e) {
            LOG.error("Something went wrong");
            throw new IOException("Error: could not open file: " + filename, e);
        }
        return values;
    }

    public static double sumOfValues(String path) throws IOException {
        double sum = 0;
        LOG.info("Variable sum was created");
        for (double d : readValues(path)) {
            sum += d;
        }
        LOG.info("Sum was counted");
        return sum;
    }
}
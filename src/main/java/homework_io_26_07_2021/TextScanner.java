package homework_io_26_07_2021;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextScanner {

    public Car parseXmlToObject(String filePass) {
        Car car = new Car();
        SpeedMax speedMax = new SpeedMax();
        Engine engine = new Engine();
        try (BufferedReader freader = new BufferedReader(new InputStreamReader(new FileInputStream(filePass), StandardCharsets.UTF_8))) {
            String line = freader.readLine();
            while (line != null) {
                if (line.contains("brand")) {
                    String brand = null;
                    Pattern pattern = Pattern.compile("brand=\".+?\"");
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {

                        brand = line.substring(matcher.start() + 7, matcher.end() - 1);
                    }


                    String model = null;
                    Pattern patternM = Pattern.compile("model.+?\">");
                    Matcher matcherM = patternM.matcher(line);
                    if (matcherM.find()) {

                        model = line.substring(matcherM.start() + 7, matcherM.end() - 2);
                    }

                    car.setBrand(brand);
                    car.setModel(model);

                } else if (line.contains("colour")) {
                    String colour = null;
                    Pattern pattern = Pattern.compile(">.+?<");
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        colour = line.substring(matcher.start() + 1, matcher.end() - 1);
                    }
                    car.setColour(colour);
                } else if (line.contains("max-speed")) {
                    String unit = null;
                    Pattern pattern = Pattern.compile("<.+?>");
                    Matcher matcher = pattern.matcher(line);
                    String l = null;
                    if (matcher.find()) {
                        l = line.substring(matcher.start() + 1, matcher.end() - 1);
                        Pattern pattern2 = Pattern.compile("\".+?\"");
                        Matcher matcher2 = pattern2.matcher(l);
                        if (matcher2.find()) {
                            unit = l.substring(matcher2.start() + 1, matcher2.end() - 1);
                        }

                    }


                    int value = 0;
                    Pattern patternV = Pattern.compile(">.+?<");
                    Matcher matcherV = patternV.matcher(line);

                    if (matcherV.find()) {
                        value = Integer.parseInt(line.substring(matcherV.start() + 1, matcherV.end() - 1));
                    }

                    speedMax.setUnit(unit);
                    speedMax.setValue(value);
                    car.setSpeedMax(speedMax);

                } else if (line.contains("engine")) {
                    String str = freader.readLine();
                    String unit = null;
                    double volume = 0;
                    int rpm = 0;
                    String compressionRatio = null;
                    while (!str.contains("</engine>")) {
                        if (str.contains("volume")) {


                            Pattern pattern2 = Pattern.compile("\".+?\"");
                            Matcher matcher2 = pattern2.matcher(str);
                            if (matcher2.find()) {
                                unit = str.substring(matcher2.start() + 1, matcher2.end() - 1);
                            }


                            Pattern patternV = Pattern.compile(">.+?<");
                            Matcher matcherV = patternV.matcher(str);

                            if (matcherV.find()) {
                                volume = Double.parseDouble(str.substring(matcherV.start() + 1, matcherV.end() - 1));
                            }

                        } else if (str.contains("rpm")) {
                            Pattern patternV = Pattern.compile(">.+?<");
                            Matcher matcherV = patternV.matcher(str);

                            if (matcherV.find()) {
                                rpm = Integer.parseInt(str.substring(matcherV.start() + 1, matcherV.end() - 1));
                            }
                        } else if (str.contains("compression-ratio")) {
                            Pattern patternV = Pattern.compile(">.+?<");
                            Matcher matcherV = patternV.matcher(str);

                            if (matcherV.find()) {
                                compressionRatio = str.substring(matcherV.start() + 1, matcherV.end() - 1);
                            }
                        }
                        str = freader.readLine();
                    }
                    engine.setUnit(unit);
                    engine.setVolume(volume);
                    engine.setRpm(rpm);
                    engine.setCompressionRatio(compressionRatio);
                    car.setEngine(engine);
                } else if (line.contains("seating-capacity")) {
                    int seatingCapacity = 0;
                    Pattern pattern = Pattern.compile("\".+?\"");
                    Matcher matcher = pattern.matcher(line);

                    if (matcher.find()) {
                        seatingCapacity = Integer.parseInt(line.substring(matcher.start() + 1, matcher.end() - 1));
                    }
                    car.setSeatingCapacity(seatingCapacity);
                }

                line = freader.readLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return car;
    }


}

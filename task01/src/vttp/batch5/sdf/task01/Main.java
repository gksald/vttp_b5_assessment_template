package vttp.batch5.sdf.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Use this class as the entry point of your program

public class Main {

	public static void main(String[] args) throws IOException {

		if(args.length == 0){
            System.out.println("No filename provided");
            System.exit(1);
        }

		String filename = args[0];
        File file = new File(filename);
        if(!file.exists()){
            System.out.println("File does not exist");
        }
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

		

		String position = "";
		String season = "";
		String day = "";
		String month = "";
		Integer total = 0;
		String weather = "";
        Boolean holiday = true;
		
		System.out.printf("The %s (position) recorded number of cyclists was in %s (season), on a %s (day) in the month of %s (month). There were a total of %d (total) cyclist. The weather was %s (weather). s% (day) was not a holiday.\n", position, season, day, month, total, weather, day);


		
	
		// pseudo code
		// create a <total> variable that sums the casual and registered cyclist derived from the csv file.
		// create a list to add the respective <total> values.
		List<MyUtilities> topFivePositions = new ArrayList<>();
		// use the stream->filter->collect approach to filter a list of top 5 highest <total> values.
		// eg. topFivePositions = total.stream().filter(total -> total.collect(Collectors.toList());
        topFivePositions.forEach(System.out::println);
		// write the filtered list of topFivePositions to a file
        FileWriter fileWriter = new FileWriter(args[0], false); // args[0] refers to the 1st arg passed to Java application when run it from command line; false to overwrite while true to append to file
        BufferedWriter writer = new BufferedWriter(fileWriter); // fr is like writing a single letter then mailing it straight while br is writing a few letters and compiling them in a box to mail tgt, so br makes it more efficient to write to a file.
		
		try (writer) {
            for (MyUtilities positions : topFivePositions) {

                writer.write(positions.toString());
                writer.newLine();
            }
            
            System.out.println("Top 5 Positions " + args[0]);
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
		// use comparator to perform sorting of the filtered list in ascending order.
		Comparator<MyUtilities> comparator = Comparator.comparing(position::getPosition);
        position.sort(comparator);
        position.forEach(System.out::println);





		// allocate the top 5 highest <total> values to the respective top 5 positions.
		// use .get() mathod to retrieve the <position> values that are based on the filtered <total> values.

      
		

	}


}

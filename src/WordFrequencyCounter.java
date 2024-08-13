	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;
       public class WordFrequencyCounter {
          public static void main(String[] args) {
	        // Path to the file
	        String filePath = "C:\\Users\\poojasharma03\\OneDrive - Nagarro\\Desktop\\Automation QA\\JAVA\\AssignmentJava2Q2.txt";

	        try {
	            // Read the content of the file
	            BufferedReader reader = new BufferedReader(new FileReader(filePath));
	            String line;
	            StringBuilder content = new StringBuilder();
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	            reader.close();

	            // Calculate word frequency
	            Map<String, Integer> wordFrequency = calculateWordFrequency(content.toString());

	            // Print word frequency
	            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
	                System.out.println(entry.getKey() + " : " + entry.getValue());
	            }

	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	    }

	    private static Map<String, Integer> calculateWordFrequency(String content) {
	        // Remove special characters and split the content into words
	        String[] words = content.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

	        // Count word frequency using HashMap
	        Map<String, Integer> wordFrequency = new HashMap<>();
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
	            }
	        }

	        return wordFrequency;
	    }
	}



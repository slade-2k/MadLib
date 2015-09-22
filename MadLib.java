import java.io.*;

public class MadLib {
	public static void main(String args[]) {
		MadLib madLib = new MadLib();
		madLib.getUserInput();
	}
	
	private void getUserInput() {		
		InputStream inputStream = System.in;
		BufferedReader buffRead = new BufferedReader(new InputStreamReader(inputStream));
			
		try {
			String storyNoun = readLine("Enter a noun: ", buffRead);
			String storyVerb = readLine("Enter a verb: ", buffRead);
			String storyAdjective = readLine("Enter an adjective: ", buffRead);
			String storyAdverb = readLine("Enter an adverb: ", buffRead);
			
			buildStory(storyNoun, storyVerb, storyAdjective, storyAdverb);
		} catch (IOException exception) {
			System.out.println("Whoops!");
		}
	}
	
	private String readLine(String text, BufferedReader buffRead) throws IOException {
		System.out.print(text);
		return buffRead.readLine();
	}
	
	private void buildStory(String storyNoun, String storyVerb, String storyAdjective, String storyAdverb) {
		//System.out.print("Do you "+storyVerb+" your "+storyAdjective+" "+storyNoun+" "+storyAdverb+"? Thats hilarious!");
		String output = String.format("Do you %s your %s %s %s? That's hilarious!", storyVerb, storyAdjective, storyNoun, storyAdverb);
		System.out.print(output);
	}  
}
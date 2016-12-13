package candybar;
/*
 * You have a candy bar made up of a bunch of smaller squares in a grid. A traditional Hershey's bar is 4x3. 
 * Given different dimensions of candy bars, how many breaks will you have to make to get all the squares 
 * separated?
 */

public class CandyBar {
	public static void main(String args[]) {
		int height = 5;
		int width = 4;
		int loopBreaks = 0;
		int mathBreaks = 0;
		
		for(int x = 0; x < height; x++){
			for(int y = 0; y < width; y++){
				loopBreaks++;
			}
		} 
		
		loopBreaks--;
		System.out.println("Number of breaks with loop: " + loopBreaks);
		
		mathBreaks = (height * width) - 1;
		
		System.out.println("Number of breaks with math: " + mathBreaks);
	}
}
		

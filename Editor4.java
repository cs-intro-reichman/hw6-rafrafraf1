import java.awt.Color;

/**
 * Demonstrates the greyscale operation featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image and the number of morphing steps (an int). 
 * For example, to morph the cake into greyscale in 50 steps, use:
 * java Editor4 cake.ppm 50
 * Note: There is no need to scale the target image to the size of the source
 * image, since Runigram.morph performs this action.
 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, Runigram.grayScaled(sourceImage), n);
	}
}

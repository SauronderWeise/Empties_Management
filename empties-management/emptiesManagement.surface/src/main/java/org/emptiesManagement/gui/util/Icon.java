package org.emptiesManagement.gui.util;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * This class contains the icon for the JButtons.
 * 
 * @author Timm Schneider
 *
 */
public class Icon {

	private String pathToImagesInResources = "src/main/resources/images/";
	private Color veryPaleGreen = new Color(229, 255, 229);
	private File file;
	private BufferedImage imageFlower = null;
	private Image image = null;

	/**
	 * Creates a new icon object and calls {@link #readImageIn(String)} method.
	 * 
	 * @param imageName
	 *            the name of the image.
	 */
	public Icon(String imageName) {
		this.readImageIn(imageName);
	}

	/**
	 * Reads images from the resource folder.
	 * 
	 * @param imageName
	 *            the name of the image.
	 */
	private void readImageIn(String imageName) {
		file = new File(pathToImagesInResources + imageName);
		try {
			imageFlower = ImageIO.read(file);
		} catch (IOException e) {
			System.err.println("There isn't " + imageName + " in " + pathToImagesInResources);
		}

		for (int i = 0; i < imageFlower.getWidth(null); i++) {
			for (int j = 0; j < imageFlower.getHeight(null); j++) {
				if ((imageFlower.getRGB(i, j) == Color.WHITE.getRGB())) {
					imageFlower.setRGB(i, j, veryPaleGreen.getRGB());
				}
			}
		}
		image = imageFlower;
	}

	/**
	 * Gets the Image image.
	 * 
	 * @return Image image.
	 */
	public Image getImage() {
		return this.image;
	}

}

package imageviewer.controller;

import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
            File folder = new File("C:\\Users\\ismar\\Pictures\\is2_images");
            FileImageLoader imageLoader = new FileImageLoader(folder);
            MainFrame mainFrame = new MainFrame(imageLoader);
            Image image = imageLoader.load();
            mainFrame.getImageDisplay().show(image);
    }    
}

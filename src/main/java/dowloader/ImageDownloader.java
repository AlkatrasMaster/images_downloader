package dowloader;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ImageDownloader {

    private final String dirPath;

    private int fileNumber = 0;

    public ImageDownloader(String dirPath) {
        this.dirPath = dirPath;
    }

    public String downloader(String link) {
        InputStream inStream;
        try {
            URLConnection connection = new URL(link).openConnection();
            inStream = connection.getInputStream();
        } catch (MalformedURLException e) {
            throw new WrongFormatUrlException(link,e)
        }
    }
}

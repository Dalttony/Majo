package evinton.dalt.majo.system;

import android.graphics.Bitmap;

import java.net.URL;

/**
 * Created by evint_000 on 07/09/2015.
 */
public class Image {
    private Bitmap img;
    private int height;
    private int widht;
    private String surl;
    private URL url;
    Image(Bitmap img, String surl){
        this.img = img;
        this.surl=surl;
    }
    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }
}

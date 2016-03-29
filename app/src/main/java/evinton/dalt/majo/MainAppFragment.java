package evinton.dalt.majo;

import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.model.Picture;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainAppFragment extends Fragment {

    public MainAppFragment() {
        int frameNumber = 150;

        Bitmap frame = null;
        try {
            Picture p = FrameGrab.getNativeFrame(new File("filename.mp4"), frameNumber);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JCodecException e) {
            e.printStackTrace();
        }

        //ImageIO.write(frame, "png", new File("frame_150.png"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_app, container, false);
    }
}

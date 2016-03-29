package evinton.dalt.majo.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import evinton.dalt.majo.R;

/**
 * Created by evint_000 on 16/10/2015.
 */
public class Frag_CameraImage extends Fragment {



    public Frag_CameraImage() {
    }

    @Nullable
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.frag_cameraimage, container, false);
    }
}

package evinton.dalt.majo.Fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import evinton.dalt.majo.R;
import evinton.dalt.majo.system.Image;
import evinton.dalt.majo.system.ImageAdapter;

/**
 * Created by evint_000 on 16/10/2015.
 */
public class Frag_Findwebimage extends Fragment {
    int mNum;

    private ImageAdapter ImgAdapter; //adapeter for to serach image of the web
    public static Fragment newInstance(int position) {

        Frag_Findwebimage f = new Frag_Findwebimage();

        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putInt("num", position);
        f.setArguments(args);

        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImgAdapter = new ImageAdapter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("Nada", "vie");
        View v = inflater.inflate(R.layout.frag_findwebimage, container, false);
        Button  btnFindImage = (Button) v.findViewById(R.id.btnFindweb);
        final TextView txtFindImage = (TextView) v.findViewById(R.id.txtFindweb);
        btnFindImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtFindImage.getText().length()<2) return; //it indicate when a lenght value of text is greater of three
                String subject = txtFindImage.getText().toString().trim();
                subject = subject.replace(" ","+");
                ArrayList imgList;
                ImgAdapter.execute(subject);

            }
        });
        return v;
    }


}

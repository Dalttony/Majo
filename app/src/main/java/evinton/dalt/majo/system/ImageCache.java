package evinton.dalt.majo.system;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import org.apache.http.client.HttpClient;

import java.net.URL;

/**
 * Created by evint_000 on 07/09/2015.
 */
public class ImageCache implements View.OnClickListener {
    HttpClient hc;
    URL url;
    
    @Override
    public void onClick(View v) {

        Toast.makeText(v.getContext(), String.valueOf(v.getId()), Toast.LENGTH_LONG);


    }
}

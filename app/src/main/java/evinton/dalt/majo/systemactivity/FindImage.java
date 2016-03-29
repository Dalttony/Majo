package evinton.dalt.majo.systemactivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import evinton.dalt.majo.Fragment.Frag_CameraImage;
import evinton.dalt.majo.Fragment.Frag_FindgalleryImage;
import evinton.dalt.majo.Fragment.Frag_Findwebimage;
import evinton.dalt.majo.R;
import evinton.dalt.majo.adapter.FindImageAdapter;
import evinton.dalt.majo.extra.SlidingTabLayout;

public class FindImage extends AppCompatActivity {
    private FindImageAdapter fAdapter;
    private ViewPager mPager;
    private SlidingTabLayout tabfind;
    private String[] tabs;
    private Button btnFindImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_image);
        //establish the fragments for to show
        tabs = getResources().getStringArray(R.array.tabs);
        fAdapter = new FindImageAdapter(getSupportFragmentManager(),tabs);
        mPager = (ViewPager) findViewById(R.id.findimagepager);
        mPager.setAdapter(fAdapter);

        //Toolbar of activity
        Toolbar toolFindImage = (Toolbar)findViewById(R.id.main_toolbar);
        toolFindImage.setTitle("Find Image");
        setSupportActionBar(toolFindImage);

        //Tab
        tabfind = (SlidingTabLayout) findViewById(R.id.tapfindimage);
        tabfind.setViewPager(mPager);

        //


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }


}

package evinton.dalt.majo.adapter;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import evinton.dalt.majo.Fragment.Frag_CameraImage;
import evinton.dalt.majo.Fragment.Frag_FindgalleryImage;
import evinton.dalt.majo.Fragment.Frag_Findwebimage;

/**
 * Created by evint_000 on 16/10/2015.
 * This class is use for slide amount fragments that activity FindImages has
 */
public class FindImageAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragImage;
    private String[] tabs;
    public FindImageAdapter(FragmentManager fm, String[] tabs){
        super(fm);
        this.tabs = tabs;
        fragImage = new ArrayList<Fragment>();
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fra=null;
        switch (position) {
            case 0: fra = new Frag_Findwebimage();
                break;
            case 1: fra = new Frag_CameraImage();
                break;
            case 2: fra =new Frag_FindgalleryImage();
                break;
        }
        return fra;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }


}

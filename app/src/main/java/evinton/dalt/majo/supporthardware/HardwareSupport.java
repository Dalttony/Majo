package evinton.dalt.majo.supporthardware;

import android.content.Context;

/**
 * Created by Evinton Antonio Cordoba Mosquera on 07/08/2015.
 */
public class HardwareSupport {


    /* the variavel allow to verify iff exist any Hardware in the device */
    private Context context;
    HardwareSupport(Context context){
        //establish the context for the hardware
        setContext(context);
    }
    public void setContext(Context context) {
        this.context = context;
    }
    public Context getContext() {
        return context;
    }

    public boolean HasFrontCamera(){

        return false;
    }

    public boolean HasBackCamera(){

        return false;
    }
    public boolean HasInternalStorage(){

        return false;
    }

    public boolean HasExternalStorage(){

        return false;
    }


}

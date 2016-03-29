package evinton.dalt.majo.system;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.Html;
import android.util.Log;
import android.widget.ArrayAdapter;

import org.apache.http.client.HttpClient;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by evint_000 on 07/09/2015.
 * it's a class that to let find image of the web,
 */
public class ImageAdapter extends AsyncTask<String,Void,ArrayList<Image>> {
    String subject="cats";//subject that we are to find on the web

    Bitmap bmp;
    HttpClient client;
    URL url;
    HttpURLConnection httpConection;
    @Override // function is executed in another thread of the application for to serach image web
    protected ArrayList doInBackground(final String... args) {
        ArrayList<Image> images = new ArrayList<Image>();
        subject = args[0];
        String urlString = "https://images.search.yahoo.com/search/images;_ylt=AwrBTvgXkOdV1pkAzL3z6Qt.;_ylu=X3oDMTE2OWtwcnU0BGNvbG8DYmYxBHBvcwMxBHZ0aWQDQUNCWUJSMV8xBHNlYwNwaXZz?p="+subject+"&fr=sfp&fr2=piv-web";
        try {
            url = new URL(urlString);
            try{
                httpConection = (HttpURLConnection)url.openConnection();
                httpConection.connect();
                InputStream is = httpConection.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
               /* Document document = Jsoup.connect(urlString).get();
                Elements elementsWithSrcAttributes = document.select("[img]");
                for (Element element: elementsWithSrcAttributes){
                    Log.i("Tag",element.attr("img"));
                }*/
               String line;
                while ((line = br.readLine()) !=null){
                    Pattern p = Pattern.compile("(?m)(?s)<img\\\\s+(.*)src\\\\s*=\\\\s*\\\"([^\\\"]+)\\\"(.*)");
                    Matcher m = p.matcher(line);
                    if(m.find()){
                        String name = m.group(1); // Access a submatch group; String can't do this.
                        Log.i("Tag",name);
                    }else{
                        Log.i("Tag","No");
                    }
                  //  Log.i("Tag",line);
                  /*String imgPath="";
                    url = new URL (imgPath);
                    InputStream i = new BufferedInputStream(url.openStream());
                    bmp = BitmapFactory.decodeStream(i);
                    Image imgweb = new Image(bmp,imgPath);
                    images.add(imgweb);*/
                }
                Log.i("Tag","Acabo");
            }catch (IOException io){

            }finally {
                httpConection.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            // here put message of warning
        }
        return images;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();


    }

    @Override
    protected void onPostExecute(ArrayList<Image> images) {

        super.onPostExecute(images);
    }


}

package com.aavdeev.rakets;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RaketsActivity extends Activity {

    TextView tvText;
    final String textSource = "https://api.spacexdata.com/v2/launches?launch_year=2017";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rakets);

        tvText = (TextView) findViewById(R.id.tvText);
        tvText.setMovementMethod(new ScrollingMovementMethod());

        new FileReadTask().execute();

    }

    private class FileReadTask extends AsyncTask<Void, Void, Void> {
        String textResult;


        @Override
        protected Void doInBackground(Void... voids) {

            URL textUrl;
            try {
                textUrl = new URL(textSource);

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(textUrl.openStream()));
                String StringBuffer;
                String stringText = "";
                while ((StringBuffer = bufferedReader.readLine()) != null) {
                    stringText += StringBuffer;
                }
                bufferedReader.close();
                textResult = stringText;

            } catch (MalformedURLException e) {
                e.printStackTrace();
                textResult = e.toString();
            } catch (IOException e) {
                e.printStackTrace();
                textResult = e.toString();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            tvText.setText(textResult);
            super.onPostExecute(result);
        }
    }

}

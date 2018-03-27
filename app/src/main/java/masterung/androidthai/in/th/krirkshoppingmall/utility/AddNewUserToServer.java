package masterung.androidthai.in.th.krirkshoppingmall.utility;

import android.content.Context;
import android.os.AsyncTask;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;

public class AddNewUserToServer extends AsyncTask<String, Void, String>{

    private Context context;

    public AddNewUserToServer(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) {

        try {

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

package papaya.in.testingtoasty;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import papaya.in.sendmail.SendMail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendMail mail = new SendMail(Config.EMAIL, Config.PASSWORD,
                "shubhampandey979271@gmail.com",
                "Testing my library",
                "It's working.\n Share Papaya Coders for more amazing videos");


        findViewById(R.id.mail).setOnClickListener(v ->
                mail.execute()
                );


    }
}
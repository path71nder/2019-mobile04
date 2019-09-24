package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            User userObj = extras.getParcelable("USER_KEY");
            String username = extras.getString(userObj.getUsername());
            String name = userObj.getName();
            int age = userObj.getAge();
            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(String.valueOf(age));
        }
    }
}

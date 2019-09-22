package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import id.ac.polinema.intent.model.User;
import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

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
        User userObject = getIntent().getParcelableExtra("USER_KEY");

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String user = extras.get(USER_KEY).toString();
            usernameText.setText(user);
            nameText.setText(user);
            ageText.setText(user);
        }
    }
}

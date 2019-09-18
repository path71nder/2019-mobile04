package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        // TODO: bind here
        usernameText = findViewById(R.id.input_username);
        nameText = findViewById(R.id.input_name);
        ageText = findViewById(R.id.input_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String user = usernameText.getText().toString();
            String name = nameText.getText().toString();
            String age = ageText.getText().toString();
            usernameText.setText(user);
            nameText.setText(name);
            ageText.setText(age);
        }
    }
}

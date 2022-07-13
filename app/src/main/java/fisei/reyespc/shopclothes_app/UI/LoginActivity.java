
package fisei.reyespc.shopclothes_app.UI;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import fisei.reyespc.shopclothes_app.R;

public class LoginActivity extends AppCompatActivity {

    Button btnSignIn;
    Button btnSignUp;

    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        btnSignIn = findViewById(R.id.buttonSignIn);
        btnSignUp = findViewById(R.id.buttonSignUp);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(new Intent(LoginActivity.this, SignInActivity.class));
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });
    }

    public void openActivity(Intent activity){
        activityResultLauncher.launch(activity);
    }
}
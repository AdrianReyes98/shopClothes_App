package fisei.reyespc.shopclothes_app.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import fisei.reyespc.shopclothes_app.R;


public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();
    }
}
package fisei.reyespc.shopclothes_app.UI;

import androidx.appcompat.app.AppCompatActivity;

import fisei.reyespc.shopclothes_app.R;
import android.os.Bundle;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard);
    }
}
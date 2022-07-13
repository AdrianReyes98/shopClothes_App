package fisei.reyespc.shopclothes_app.UI;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import fisei.reyespc.shopclothes_app.Controllers.UserController;
import fisei.reyespc.shopclothes_app.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import fisei.reyespc.shopclothes_app.Models.ResponseUser;


public class SignInActivity extends AppCompatActivity {

    Button btnSignIn;
    EditText edtEmail;
    EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();

        btnSignIn = findViewById(R.id.buttonLogIn);
        edtEmail = findViewById(R.id.editTextEmail);
        edtPassword = findViewById(R.id.editTextPassword);

        btnSignIn.setOnClickListener(view -> {

        });
    }


}
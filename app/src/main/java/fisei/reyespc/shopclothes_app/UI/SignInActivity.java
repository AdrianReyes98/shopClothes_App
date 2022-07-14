package fisei.reyespc.shopclothes_app.UI;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import fisei.reyespc.shopclothes_app.Controllers.UserController;
import fisei.reyespc.shopclothes_app.Models.AuthenticationResponse;
import fisei.reyespc.shopclothes_app.Models.User;
import fisei.reyespc.shopclothes_app.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


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
            User loginUser = new User(
                    edtEmail.getText().toString(),
                    "",
                    edtPassword.getText().toString());
            signInUser(loginUser);
        });
    }

    private void signInUser(User user){
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://clotheshopws.somee.com")
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit request = builder.build();

        UserController userRequest = request.create(UserController.class);
        Call<AuthenticationResponse> postCall = userRequest.loginUser(user);

        postCall.enqueue(new Callback<AuthenticationResponse>() {
            @Override
            public void onResponse(Call<AuthenticationResponse> call, Response<AuthenticationResponse> response) {
                System.out.println(response.body().getData().getTOKEN());
                Intent dashboard = new Intent(SignInActivity.this, DashboardActivity.class);
                startActivity(dashboard);
            }

            @Override
            public void onFailure(Call<AuthenticationResponse> call, Throwable t) {
                Toast.makeText(SignInActivity.this,"NO",Toast.LENGTH_LONG).show();
            }
        });
    }


}
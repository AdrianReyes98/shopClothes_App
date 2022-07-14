package fisei.reyespc.shopclothes_app.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import fisei.reyespc.shopclothes_app.Controllers.UserController;
import fisei.reyespc.shopclothes_app.Models.ResponseUser;
import fisei.reyespc.shopclothes_app.Models.User;
import fisei.reyespc.shopclothes_app.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignUpActivity extends AppCompatActivity {

    Button btnSignUp;
    EditText edtEmail;
    EditText edtUserName;
    EditText edtPassword;
    ProgressBar loading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();
        btnSignUp = findViewById(R.id.buttonLogIn);
        edtEmail = findViewById(R.id.editTextEmail);
        edtUserName = findViewById(R.id.editTextUser);
        edtPassword = findViewById(R.id.editTextPassword);
        loading = findViewById(R.id.progressBarSignUp);
        loading.setVisibility(View.INVISIBLE);

        btnSignUp.setOnClickListener(view -> {
            loading.setVisibility(View.VISIBLE);
            btnSignUp.setEnabled(false);
            User newUser = new User(
                    edtEmail.getText().toString(),
                    edtUserName.getText().toString(),
                    edtPassword.getText().toString());

            createNewUser(newUser);

        });
    }

    private void createNewUser(User user){
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://clotheshopws.somee.com")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit request = builder.build();
        UserController userRequest = request.create(UserController.class);
        Call<ResponseUser> postCall = userRequest.newUser(user);

        postCall.enqueue(new Callback<ResponseUser>() {
            @Override
            public void onResponse(Call<ResponseUser> call, Response<ResponseUser> response) {
                if (response.body().getStatus() == 1){
                    Toast.makeText(SignUpActivity.this,R.string.register_success_msg,Toast.LENGTH_LONG).show();
                    clearFields();
                    SignUpActivity.super.onBackPressed();
                }else{
                    btnSignUp.setEnabled(true);
                    Toast.makeText(SignUpActivity.this,response.body().getResult(),Toast.LENGTH_LONG).show();
                }
                loading.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onFailure(Call<ResponseUser> call, Throwable t) {
                btnSignUp.setEnabled(true);
                Toast.makeText(SignUpActivity.this,R.string.resgister_error_msg,Toast.LENGTH_LONG).show();
                loading.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void clearFields(){
        edtEmail.setText("");
        edtUserName.setText("");
        edtPassword.setText("");
    }
}
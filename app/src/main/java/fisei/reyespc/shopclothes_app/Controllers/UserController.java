package fisei.reyespc.shopclothes_app.Controllers;


import fisei.reyespc.shopclothes_app.Models.AuthenticationResponse;
import fisei.reyespc.shopclothes_app.Models.ResponseUser;
import fisei.reyespc.shopclothes_app.Models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/*
*/

public interface UserController {

    @POST("/User")
    public Call<ResponseUser> newUser(@Body User user);

    @POST("/User/login")
    public Call<AuthenticationResponse> loginUser(@Body User user);

}

package fisei.reyespc.shopclothes_app.Models;

public class AuthResponse {

    private String email;
    private String token;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTOKEN() {
        return token;
    }

    public void setTOKEN(String token) {
        this.token = token;
    }
}

package fisei.reyespc.shopclothes_app.Models;

public class AuthenticationResponse {
    int status;
    String result;
    AuthResponse data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public AuthResponse getData() {
        return data;
    }

    public void setData(AuthResponse data) {
        this.data = data;
    }
}

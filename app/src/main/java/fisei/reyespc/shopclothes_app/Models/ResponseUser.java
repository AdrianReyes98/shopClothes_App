package fisei.reyespc.shopclothes_app.Models;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ResponseUser {

    int status;
    String result;
    ArrayList<User> data;

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

    public ArrayList<User> getData() {
        return data;
    }

    public void setData(ArrayList<User> data) {
        this.data = data;
    }
}

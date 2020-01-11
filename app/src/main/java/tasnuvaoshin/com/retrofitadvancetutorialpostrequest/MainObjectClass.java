package tasnuvaoshin.com.retrofitadvancetutorialpostrequest;

public class MainObjectClass {
    private String token;
    private dataObjectClass data;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public dataObjectClass getData() {
        return data;
    }

    public void setData(dataObjectClass data) {
        this.data = data;
    }

    public MainObjectClass() {
    }

    public MainObjectClass(String token, dataObjectClass data) {
        this.token = token;
        this.data = data;
    }
}

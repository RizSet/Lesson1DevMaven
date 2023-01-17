import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new Person("Dmytro", "Kononenko")));
    }
}

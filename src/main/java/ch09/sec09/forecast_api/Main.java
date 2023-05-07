package ch09.sec09.forecast_api;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String city;
        HttpResponse<String> response;

        while (true) {
            System.out.println("Enter the City in english: ");
            city = sc.nextLine();
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI("http://api.weatherapi.com/v1/current.json?key=9dbbf79375d743e9a6b144539230405&q=" + city + "&day=1"))
                    .GET()
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            response = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                break;
            }
            System.out.println("There are no info on this location.");
        }
        Gson gson = new Gson();
        Forecast forecast = gson.fromJson(response.body(), Forecast.class);

        System.out.printf("The temperature in %s today is %s", city, forecast.getCurrent().getTempC() + "\n");
        System.out.printf("Feels like %s", forecast.getCurrent().getFeelslikeC() + "\n");
        System.out.println(forecast.getCurrent().getCondition().getText());
    }
}

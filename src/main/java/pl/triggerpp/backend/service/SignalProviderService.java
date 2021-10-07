package pl.triggerpp.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;

@Service
@RequiredArgsConstructor
public class SignalProviderService {

    private final SignalService signalService;

    @Value("${signalProvider.url}")
    private String baseUrl;

    @Scheduled(fixedDelayString = "${signalProvider.delay}")
    public void isNewSignalAppeared(){
        try{
            int nextSignalId = +signalService.getLastProviderId();
            URL url = new URL(baseUrl + nextSignalId);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            System.out.println(connection.getResponseCode());
        }catch (Exception e){
            System.err.println("Exception hit");
        }
    }


}

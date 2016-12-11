package service;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Currency;
import model.CurrencyRates;
public class CurrencyRatesDownloader {
    public BigDecimal downloadRate(Currency from, Currency walutaDocelowa) {
        try {
            URL url = new URL("http://api.fixer.io/latest?base="+from+"&symbols="+walutaDocelowa);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json"); // deklarujemy ze Poberamy cos i to bedzie plik json
            
            ObjectMapper objectMapper = new ObjectMapper();// stwozamy objek z pliku json
            objectMapper.findAndRegisterModules();// odczytuje wsztkie nowe bublioteki z poma
            CurrencyRates ratesFromJson = objectMapper.readValue(connection.getInputStream(), CurrencyRates.class); // strumen
            
            Map<Currency, BigDecimal> ratesMap = ratesFromJson.getRates();
            return ratesMap.get(walutaDocelowa); // pobranie kursu dla waluty docelowej
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
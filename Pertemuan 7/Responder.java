import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Responder {
    private String[] defaultResponses;
    private Map<String, String> responsesMap;

    public Responder(){
        responsesMap = new HashMap<>();
        responsesMap.put("password", "Jika Anda mengalami masalah dengan kata sandi, coba reset atau verifikasi kata sandi tersebut.");
        responsesMap.put("sandi", "Jika Anda mengalami masalah dengan kata sandi, coba untuk reset kata sandi anda.");
        responsesMap.put("lambat", "Sistem Anda mungkin lambat karena berbagai alasan, seperti memori yang tidak mencukupi.");
        responsesMap.put("crash", "Jika aplikasi Anda crash, coba restart dan beri tahu saya jika masalahnya berlanjut.");
        responsesMap.put("tolong", "Saya di sini untuk membantu! Mohon berikan lebih banyak detail tentang masalah Anda.");
        responsesMap.put("error", "Mari kita selesaikan error ini. Bisakah Anda menjelaskan error yang terjadi?"); 
        responsesMap.put("username", "Anda dapat mendapatkan kembali username Anda dengan mengklik 'Forgot Username' di halaman login.");


        defaultResponses = new String[]{
            "Itu terdengar menarik. Ceritakan lebih lanjut...",
            "Oh, saya mengerti. Bisakah Anda menjelaskan lebih lanjut?",
            "Hmm, itu cukup rumit. Mari kita bahas lebih dalam.",
            "Menarik. Bisakah Anda memberikan lebih banyak detail?",
            "Biarkan saya berpikir... Bisakah Anda memperjelas sedikit lebih banyak?"
        };
    }

    public String generateResponse(String userInput){
        for (String key : responsesMap.keySet()) {
            if (userInput.toLowerCase().contains(key)) {
                return responsesMap.get(key);
            }
        }

        return getDefaultResponse();
    }

    public String getDefaultResponse(){
        Random random = new Random();
        int index = random.nextInt(defaultResponses.length);
        return defaultResponses[index];
    }
}
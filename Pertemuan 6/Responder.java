import java.util.Random;

public class Responder {
    private String[] responses;

    public Responder(){
        responses = new String[]{
            "Itu terdengar menarik. Ceritakan lebih lanjut...",
            "Oh, saya mengerti. Bisakah Anda menjelaskan lebih lanjut?",
            "Hmm, itu cukup rumit. Mari kita bahas lebih dalam.",
            "Menarik. Bisakah Anda memberikan lebih banyak detail?",
            "Biarkan saya berpikir... Bisakah Anda memperjelas sedikit lebih banyak?"
        };
    }

    public String generateResponse(){
        Random random = new Random();
        int index = random.nextInt(responses.length);
        return responses[index];
    }
}
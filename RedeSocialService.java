public class RedeSocialService {
    
    public void publicarNoTwitter(String payload) {
        try {
            AdapterTwitter adapter = new AdapterTwitter(payload);
            adapter.enviar();
            System.out.println("Twitter: Publicação realizada!");
        } catch (Exception e) {
            System.out.println("Twitter: Erro - " + e.getMessage());
        }
    }
    
    public void publicarNoTikTok(String payload) {
        try {
            AdapterTiktok adapter = new AdapterTiktok(payload);
            adapter.enviar();
            System.out.println("TikTok: Publicação realizada!");
        } catch (Exception e) {
            System.out.println("TikTok: Erro - " + e.getMessage());
        }
    }

    public void publicarNoInstagram(String payload) {
        try {
            AdapterInsta adapter = new AdapterInsta(payload);
            adapter.enviar();
            System.out.println("Instagram: Publicação realizada!");
        } catch (Exception e) {
            System.out.println("Instagram: Erro - " + e.getMessage());
        }
    }
}
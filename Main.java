public class Main {
    
    public static void main(String[] args) {
        String payloadInsta = "abc-123cba-312;https://imagemInstagram.jpg;Legenda para imagem";
        String payloadTwitter = "13;teste123;https://imagemTwitter.jpg;Texto para minha postagem no twitter";
        String payloadTikTok = "connection-123-abc.admin;https://imagemTikTok.jpg;Legenda para meu post no tik tok";

        RedeSocialService service = new RedeSocialService();

        System.out.println("\n Publicando no instagram: \n");
        service.publicarNoInstagram(payloadInsta);

        System.out.println("\n Publicando no tiktok: \n");
        service.publicarNoTikTok(payloadTikTok);

        System.out.println("\n Publicando no twitter: \n");
        service.publicarNoTwitter(payloadTwitter);

    }
}

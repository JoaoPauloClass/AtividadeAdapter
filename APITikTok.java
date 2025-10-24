public class APITikTok {
    public String connectionString;

    public APITikTok(String connectionString){
        this.connectionString = connectionString;
    }

    public void post(String imgURL, String subtitle)
    {
        System.out.println("Conexão: " + connectionString);
        System.out.println("Publicando imagem com URL: " + imgURL);
        System.out.println("Legenda: " + subtitle);
    }
}

public class APIinsta {
    public String apikey;


    public APIinsta(String apiKey){
        this.apikey = apiKey;
    }


    public void send(String imgURL, String subtitle){
        System.out.println("Chave de API: " + apikey);
        System.out.println("Publicando imagem com URL: " + imgURL);
        System.out.println("Legenda: " + subtitle);
    }


}

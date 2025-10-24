public class APITwitter {
    public String id;
    public String psw;

    public APITwitter(String id, String psw){
        this.id = id;
        this.psw = psw;
    }

    public void submit(String texto, String imgURL){
        System.out.println("Id de usuário: " + id);
        System.out.println("Senha: " + psw);
        System.out.println("Publicando imagem com URL: " + imgURL);
    }


}

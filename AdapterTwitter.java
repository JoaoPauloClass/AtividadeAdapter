public class AdapterTwitter extends ABSAdapterRedesSociais {

    public String payload;

    private APITwitter apiTwitter;

    public AdapterTwitter(String payload){
        String[] splits = payload.split(";");

        String id = splits[0];
        String psw = splits[1];

        this.apiTwitter = new APITwitter(id, psw);
        this.payload = payload;
    }

    @Override
    public void enviar() {

        String[] splits = payload.split(";");

        String imgURL = splits[2];
        String texto = splits[3];

        apiTwitter.submit(texto, imgURL);
    }
    


}

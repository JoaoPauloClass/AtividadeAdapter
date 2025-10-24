public class AdapterInsta extends ABSAdapterRedesSociais {

    public String payload;

    public APIinsta apiInsta;

    public AdapterInsta(String payload){
        String[] splits = payload.split(";");
        String apiKey = splits[0];

        this.payload = payload;
        this.apiInsta = new APIinsta(apiKey);
    }

    @Override
    public void enviar() {
       String[] splits = payload.split(";");

        String imgURL = splits[1];
        String subtitle = splits[2];

        apiInsta.send(imgURL, subtitle);
    }
    
}

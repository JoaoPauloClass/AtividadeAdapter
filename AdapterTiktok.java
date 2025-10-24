public class AdapterTiktok extends ABSAdapterRedesSociais
{
    public String payload;

    private APITikTok apiTikTok;

    public AdapterTiktok(String payload) {
        String[] splits = payload.split(";");
        String conn = splits[0];
        this.apiTikTok = new APITikTok(conn);
        this.payload = payload;
    }

    @Override
    public void enviar() {
        
        String[] splits = payload.split(";");

        String imgURL = splits[1];
        String subtitle = splits[2];

        apiTikTok.post(imgURL, subtitle);
    }
    
}
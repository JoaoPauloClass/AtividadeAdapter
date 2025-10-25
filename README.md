# Sistema de Integração de APIs de Mídia Social

Sistema simples para publicar conteúdo em diferentes redes sociais usando o padrão Adapter.


## 📁 Estrutura do Projeto

-   **RedeSocialService** - Service única para todas as redes
    
-   **AdapterTwitter** - Adaptador para API do Twitter
    
-   **AdapterTikTok** - Adaptador para API do TikTok
    
-   **AdapterInsta** - Adaptador para API do Instagram
    
-   **ABSAdapterRedesSociais** - Classe abstrata base

-   **APITwitter** - API do Twitter
    
-   **APITikTok** - API do TikTok
    
-   **APIInsta** - API do Instagram
    

## 📋 Formatos de Payload

**Instagram**

Formato: `token;url_imagem;legenda`

**Twitter**

Formato: `id;senha;url_imagem;texto`

**TikTok**

Formato: `connection_string;url_imagem;legenda`

## 🛠️ Tecnologias

-   Java
    
-   Padrão Adapter
    
-   Composition over Inheritance
    
----------

## 📊 Diagrama da Arquitetura
![Diagrama](https://github.com/JoaoPauloClass/AtividadeAdapter/blob/main/diagramaAdapter.png)


public class ComputerGames {
  //Aşırı yükleme:
   public ComputerGames(String gameName , String gameLocation , String gameCharacters , int gameInBuy){
   System.out.println("yapıcı blok çalıştı");
    this.gameName=gameName;
    this.gameCharacters=gameCharacters;
    this.gameLocation=gameLocation;
    this.gameInBuy=gameInBuy;

   }
   public ComputerGames(){

   }
    private String gameName;
    private String gameLocation;
    private String gameCharacters;
    private int gameInBuy;

    //sınıfımızı tanımladık ve gereken değişkenleri verdik
    //getter --- setter ile daha düzenli ve sistemli hale geldi
    // değerleri main de verip yazdırıyoruz
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameLocation() {
        return gameLocation;
    }

    public void setGameLocation(String gameLocation) {
        this.gameLocation = gameLocation;
    }

    public String getGameCharacters() {
        return gameCharacters;
    }

    public void setGameCharacters(String gameCharacters) {
        this.gameCharacters = gameCharacters;
    }

    public int getGameInBuy() {
        return gameInBuy;
    }

    public void setGameInBuy(int gameInBuy) {
        this.gameInBuy = gameInBuy;
    }
}

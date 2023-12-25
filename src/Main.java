//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //kulaklık methodunu ekrana yazdırdık
        kulaklık();
        System.out.println("//////////////////");

        //computer sınıfımızı çağırdık ve içinde ki methodları ekrana yazdırdık
        Computer computer = new Computer();
        computer.hardWare();
        computer.softWare();
        System.out.println("//////////////////");

        //computerGames sınıfımızı çağırdık ve değişkenlerini tanımlayıp ekrana yazdırdık..
      //  ComputerGames computerGames = new ComputerGames("yunus" , "beykoz", "kartal" ,200);
       ComputerGames computerGames=new ComputerGames();
        //setter değer ver
        computerGames.setGameCharacters("buz adam");
        //getter ekrana yazdır
        System.out.println("oyunda ki karakterimizin adı: " + computerGames.getGameCharacters());
        computerGames.setGameInBuy(500);
        System.out.println("oyun içi satın almalar: " + computerGames.getGameInBuy());
        computerGames.setGameName("buz çağı");
        System.out.println("oyunumuzun adı: " + computerGames.getGameName());


    }


    //kulaklık methodu tanımlaması yaptım.
    //kulaklık hakkında değerler vererek main de yazdırdım.
    public static void kulaklık() {
        String ad = "yunus";
        System.out.println("ad -" + ad);
        String özellik;
        int boyut;
        int fiyat = 150;
        System.out.println(" fiyat -" + fiyat);
        String tasarım;

    }

}
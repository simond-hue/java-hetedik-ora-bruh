package bruh.auction;

public class Lot {
    private String artist;
    private String title;
    private int hammerPrice;

    private Lot(String artist, String title, int hammerPrice) {
        this.artist = artist;
        this.title = title;
        this.hammerPrice = hammerPrice;
    }
    
    public static void Make(String artist, String title, int upSetPrice){
        if(artist!= null){
            if(title!=null && title.length() >= 2){
                for(int i = 0; i < title.length(); i++){
                    /*if(Integer.parseInt(title.charAt(i)) >= 65 
                    && Integer.parseInt(title.charAt(i)) <= 90
                    || Integer.parseInt(title.charAt(i)) == 32){
                        
                    }*/
                }
            }
        }
    }
}

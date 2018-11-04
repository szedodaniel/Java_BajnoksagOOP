package bajnoksagoop;

public class Merkozes {

    private Csapat hazaiCsapat;
    private Csapat vendegCsapat;
    
    public Merkozes(Csapat hazai, Csapat vendeg){
        this.hazaiCsapat = hazai;
        this.vendegCsapat = vendeg;
    }

    public Csapat leJatszas(){
        hazaiCsapat.edzes();
        vendegCsapat.edzes();
        
        int hazaiRugottGol = hazaiCsapat.jatek();
        int vendegRugottGol = vendegCsapat.jatek();
        
        if (hazaiRugottGol > vendegRugottGol){
            return hazaiCsapat;
        }else if (hazaiRugottGol < vendegRugottGol){
            return vendegCsapat;
        }else{
            return null;
        }
    }
    
    public Csapat tetMerkozesLeJatszas(){
        Csapat gyoztes;
        do {
            gyoztes = this.leJatszas();
        } while( gyoztes == null);

        return gyoztes;
    }
    
}

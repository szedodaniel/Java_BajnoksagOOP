package bajnoksagoop;

public class Csapat {

    private String csapatNev;
    private double golErosseg;
    private int golAtlag;
    private double edzesiHatekonysag;

    public Csapat(String csapatNev, double golErosseg, int golAtlag, double edzesiHatekonysag) {
        this.csapatNev = csapatNev;
        this.golErosseg = golErosseg;
        this.golAtlag = golAtlag;
        this.edzesiHatekonysag = edzesiHatekonysag;
    }
    
    public Csapat(String s){
        String[] adatok = s.split(" ");
        
        this.csapatNev = adatok[0];
        this.golErosseg = Double.parseDouble(adatok[1]);
        this.golAtlag = Integer.parseInt(adatok[2]);
        this.edzesiHatekonysag = Double.parseDouble(adatok[3]);
    }
    
    
    public void edzes(){
        this.golErosseg += this.edzesiHatekonysag * ((Math.random()* 0.2) - 0.1);
    }
    
    public int jatek(){
        return (int)(this.golAtlag * this.golErosseg * Math.random());
    }
   

    public String toString(){
        return String.format("%-30s %f %d %f", 
                this.csapatNev, 
                this.golErosseg, 
                this.golAtlag, 
                this.edzesiHatekonysag);    
    }
    
    
    
}

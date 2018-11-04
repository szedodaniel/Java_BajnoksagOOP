
package bajnoksagoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Bajnoksag{
    private List<Csapat> csapatLista;

    public Bajnoksag(List<Csapat> csapatLista) {
        this.csapatLista = csapatLista;
        
        
    }

   
    public Bajnoksag(String fajl){
        this.csapatLista = new ArrayList<Csapat>();
        try{
            FileReader fr = new FileReader(fajl);
            BufferedReader br = new BufferedReader(fr);
            
            String sor = br.readLine();
            while(sor != null){
                String[] adatok = sor.split(" ");
                this.csapatLista.add(new Csapat(sor));
                
            }
            
            fr.close();
        }
        catch(Exception ex){
            System.out.println("Hiba: "+ex);
        }
    }

    @Override
    public String toString() {
        String s = super.toString(); 
        
        return s; 
    }
    
    
}

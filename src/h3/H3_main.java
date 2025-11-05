package h3;

public class H3_main {
    public static void main(String[] args) {

        
        int max = 300;       
        int fix = 140;       
        int wartend = 170;  
        int frei = max - fix;
        boolean istVoll;  

        if (frei > 0) {
            
            if (wartend >= frei) {
                
                fix = max;
                
                wartend = wartend - frei;
                
                istVoll = true;
                
            }
            
            else {
               
                fix = fix + wartend;
                
                wartend = 0;
                
                istVoll = false;
                
            }
            
        } 
        
        else {
            
            istVoll = true;
        }
       
        System.out.println("Maximale Plätze: " + max);
        System.out.println("Fixplätze: " + fix);
        System.out.println("Warteliste: " + wartend);
        System.out.println("Ist voll: " + istVoll);
        
     // TODO Auto-generated method stub
    }
}


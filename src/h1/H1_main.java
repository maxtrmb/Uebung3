package h1;

public class H1_main {

	public static void main(String[] args) {
		
		double guthaben=-100, monEingang=200;
		
		int rating=-2;
		
		boolean warnhinweis = false, negativ;
		
		if(guthaben<0) {
			
			negativ = true;
		
		}else {
			
			negativ=false;
			
		}
		
		if(guthaben>0) {
		
			rating = rating+3;
			
		}
		
		else if(guthaben==0) {
		
			rating=rating+2;
		
		}
		
		else {
			
			if(monEingang>=guthaben*-1) {
				
				rating=rating+1;
				
			}
		
			else {
				
				rating=rating-1;
				
			}
		
		}
		
		if(guthaben<0) {
			
			if(monEingang<guthaben*-1) {
				
				if(rating<0) {
					
					warnhinweis=true;
					
				}
			}
		}
		
		else {
			
			warnhinweis=false;
			
		}
		
		System.out.println("Guthaben beträgt: " +guthaben);
		System.out.println("Der monatliche Eingang beträgt: " +monEingang);
		System.out.println("Rating = " +rating);
		System.out.println("Negativ = " +negativ);
		System.out.println("Warnhinweis = " +warnhinweis);
		
		// TODO Auto-generated method stub

		
	}
}



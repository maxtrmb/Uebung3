package h3;

public class H3_main {

	public static void main(String[] args) {
		
		int max=300;
		int fix=140;
		int wartend=200;
		boolean istVoll=false;
		
		if(fix<max) {
			
			fix=fix+wartend;
			
				if(fix>max) {
					
					wartend=fix-max;
					
				}
			
		}
		
		if(max==fix) {
			
			istVoll=true;
		}
		
		System.out.println("Es warten "+wartend );
		System.out.println("Fixplätze " +fix);
		System.out.println(istVoll);
		// TODO Auto-generated method stub

	}

}

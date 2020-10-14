package fr.mds.lo_tp11.utils;

public class Conjuguateur {
	
	public final static int PRONOM = 0;
	public final static int TERMINAISON = 1;
	public final static int NOUS = 3;
	public final static int JE = 0;
	public final static String[] VERBESAVECEONS = {"manger"};
	public final static String[] VOYELLES = {"a", "e", "i", "o", "u", "y"};
	
	public void conjugueAvecSaisi(String verbe) {
		String baseVerbale = verbe.substring(0, verbe.length() - 2);
		
		String[][] pronomsTerminaisons = {
										{"Je ", "e"},
										{"Tu ", "es"},
										{"Il/Elle ", "e"},
										{"Nous ", "ons"},
										{"Vous ", "ez"},
										{"Ils/Elles ", "ent"}
									};
		for(String voyelle : VOYELLES) {
			if(baseVerbale.substring(0, 1).equals(voyelle)) {
				pronomsTerminaisons[JE][PRONOM] = "J'";
			}
		}
		
		for(String verbeAvecEons : VERBESAVECEONS) {
			if(verbe == verbeAvecEons) {
				pronomsTerminaisons[NOUS][TERMINAISON] = "e" + pronomsTerminaisons[NOUS][TERMINAISON];
			}
		}
		for(String[] pronomTerminaison : pronomsTerminaisons) {
			System.out.println(pronomTerminaison[PRONOM] + baseVerbale + pronomTerminaison[TERMINAISON] + ".");
		}
	}
	
	public void conjugueAvecSaisi(String[] verbes) {
		for(String verbe : verbes) {
			this.conjugueAvecSaisi(verbe);
			System.out.println("");
		}
	}
}

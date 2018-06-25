package adsaufgabe3;

public class Shellsort_MaximilianFornacon implements IShellsort {

    /* Der Konstruktor hat kein Argument
     */
    public Shellsort_MaximilianFornacon() {

    }

    /* Rueckgabewert: Anzahl der Schluesselvergleiche
     */
    public int shellsort(String[] feld) {
    	int vgl = 0;
    	int schrittweite = 1;
    	String neu = "";
    	int k = 0;
		while (3 * schrittweite + 1 < feld.length) {
			schrittweite = 3 * schrittweite + 1;
		}
		
		while (schrittweite > 0) {
			for (int i = schrittweite + 1; i < feld.length; i++) {
				neu = feld[i - 1];
				k = i;
				//while (k > schrittweite && (getAnzA(feld[k - schrittweite]) > getAnzA(neu) || (feld[k - schrittweite].length() > neu.length() && getAnzA(feld[k - schrittweite]) == getAnzA(neu)))) {
				while (k > schrittweite && getAnzA(feld[k-schrittweite - 1]) * feld[k - schrittweite - 1].length() > getAnzA(neu) * neu.length()) {
					feld[k - 1] = feld[k - schrittweite - 1];
					k = k - schrittweite;
					vgl++;
				}
				feld[k] = neu;
			}
			
			schrittweite = (int) Math.floor(schrittweite/3);
			//System.out.println(schrittweite);
		}
		for (String s : feld) {
			System.out.println(s);
		}
		System.out.println(vgl);
		return vgl;
    }
    
    public int getAnzA(String s) {
		int counter = 0;
		
		if (s.indexOf('z') != -1) {
			for (int j = 0; j < s.indexOf('z'); j++) {
				if (s.charAt(j) == 'a') {
    				counter++;
    			}
    		}
    
		} else {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'a') {
    				counter++;
    			}
			}
		}
    	return counter;
    }

    /* Rueckgabewert: Anzahl der Schluesselvergleiche
     */
    public int insertionsortMitSchrittweite(String[] feld, int schrittweite) {
	return 0;
    }


}

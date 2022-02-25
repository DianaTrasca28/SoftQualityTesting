package ro.ase.classes;

public class Utils {
	//nr de aparitii a valorii minime dintr-un sir
	
	public static int nrMinAparitii(int []vector) {
		int nrAparitii=0;
		int min=vector[0];
		for(int i=0;i<vector.length;i++) {
			if(vector[i]==min) {
				nrAparitii++;
			}
			if(vector[i]<min) {
				min=vector[i];
				nrAparitii=1;
			}
			
		}
		return nrAparitii;
	}
}

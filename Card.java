
public class Card {
	static String[][] cardNames = new String [52][4];
	
	public static void makeCardArray()
	{
		int j=0;
		String[] imageNames={"AC.png","AD.png","AH.png","AS.png","KC.png","KD.png","KH.png","KS.png","QC.png","QD.png","QH.png","QS.png","JC.png","JD.png","JH.png","JS.png","10C.png","10D.png","10H.png","10S.png","9C.png","9D.png","9H.png","9S.png","8C.png","8D.png","8H.png","8S.png","7C.png","7D.png","7H.png","7S.png","6C.png","6D.png","6H.png","6S.png","5C.png","5D.png","5H.png","5S.png","4C.png","4D.png","4H.png","4S.png","3C.png","3D.png","3H.png","3S.png","2C.png","2D.png","2H.png","2S.png"};
		//System.out.println(imageNames.length);
		for(int i=0;i<52;i++) {
			cardNames[i][j]=imageNames[i];
			//System.out.println(cardNames[i][j]);
			//System.out.println(imageNames[i]);
			}
		j++;
		;
		
		int[] values= {11,11,11,11,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,9,9,9,9,8,8,8,8,7,7,7,7,6,6,6,6,5,5,5,5,4,4,4,4,3,3,3,3,2,2,2,2};
		for( int i=0;i<52;i++) {
			//System.out.println(values.length);
			String svalue =String.valueOf(values[i]);
			cardNames[i][j]=svalue;
			//System.out.println(cardNames[i][j]);
			}
		j++;	
		String[] names= {"C1C","D1D","H1H","S1S","C13C","D13D","H13H","S13S","C12C","D12D","H12H","S12S","C11S","D11S","H11S","S11S","S11S","S11S","C10C","D10D","H10H","S10S","C9C","D9D","H9H","S9S","C8C","D8D","H8H","S8S","S8S","S8S","C7C","D7D","H7H","S7S","C6C","D6D","H6H","S6S","C5C","D5D","H5H","S5S","S5S","S5S","C4C","D4D","H4H","S4S","C3C","D3D","H3H","S3S","C2C","D2D","H2H","S2S"};
		for( int i2=0;i2<52;i2++) {
			cardNames[i2][j]=names[i2];
		//System.out.println(cardNames[i2][j]);	
		}
		j++;
		for( int i2=0;i2<52;i2++) {
			cardNames[i2][j]="deck";};
		}

}

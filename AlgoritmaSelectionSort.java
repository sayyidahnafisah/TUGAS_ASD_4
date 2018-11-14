	import java.util.ArrayList;
public class AlgoritmaSelectionSort {
	



		public static void main(String[] args) {
			ArrayList<Double>data = new ArrayList<Double>();
			data.add(14.0);
			data.add(33.1);
			data.add(27.2);
			data.add(10.3);
			data.add(35.4);
			data.add(19.5);
			data.add(42.6);
			data.add(44.7);
			System.out.println("DATA AWAL : "+data.toString());
			//BEGIN SORTING
			for(int i=0;i<data.size()-1;i++) {
				Double MIN = data.get(i);
				int indexMIN = i;
				/* check the element to be minimum */
				for(int j=i;j<data.size();j++) {
					if(data.get(j)<MIN) {
						MIN = data.get(j);
						indexMIN=j;
					}//end of if
				}//end of for
				if(indexMIN!=i) {//TUKAR
					Double tempBOX = data.get(i);
					data.set(i, data.get(indexMIN));
					data.set(indexMIN, tempBOX);
				}
				
				//print langkah
				System.out.println("STEP->"+i+", MIN = "+indexMIN+" SWAP("+i+","+indexMIN+")"+" -> "+data.toString());
			}//end of for
			
			//END OF SORTING
			System.out.println();
			System.out.println("HASIL SORTING SELECTION : "+data.toString());

		}
	




}

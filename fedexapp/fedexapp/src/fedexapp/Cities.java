package fedexapp;

import java.util.Random;
import java.util.UUID;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Cities {
   
	
	static int b;
	
	public  static String a[] = new String[1000000];
	 public static String source[] = new String[100000];
	public  static String  destination[] = new String[100000];
	static int i;
	
		
public static String city[] = new String[25];{
city[0] = "Northborough, MA";
city[1] = "Edison, NJ";
city[2] = "Pittsburgh, PA";
city[3] = "Allentown, PA";
city[4] = "Martinsburg, WV";
city[5] = "Charlotte, NC";
city[6] = "Atlanta, GA";
city[7] = "Orlando, FL";
city[8] = "Memphis, TN";
city[9] = "Grove City, OH";
city[10] = "Indianapolis, IN";
city[11] = "Detroit, MI";
city[12] = "New Berlin, WI";
city[13] = "Minneapolis, MN";
city[14] = "St. Louis, MO";
city[15] = "Kansas, KS";
city[16] = "Dallas, TX";
city[17] = "Houston, TX";
city[18] = "Denver, CO";
city[19] = "Salt Lake City, UT";
city[20] = "Phoenix, AZ";
city[21] = "Los Angeles, CA";
city[22] = "Chino, CA";
city[23] = "Sacramento, CA";
city[24] = "Seattle, WA";




for(b=0; b<100000; b++){
	
int i = new Random().nextInt(city.length); 
source[b] = city[i];
int j = new Random().nextInt(city.length);
destination[b] = city[j];
}






}
void trackid(){
	  {   int j;
	      for(j=0;j<100000;j++){
		  String uuid = ""+j;
		  a[j] = uuid;
		 
	      }
	  }
	  }
   


}


	






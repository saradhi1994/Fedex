package fedexapp;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class output extends Thread{

	public void run() {
		try{
			Dijkstra rand = new Dijkstra();
			   Vertex[] b = rand.calldij(); 
			   
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Success");
			   String user = "rofl";
			   String pwd = "";
			   Connection connect = DriverManager.getConnection("jdbc:mysql://192.168.0.12:3306/users", user  , pwd);		
			   //System.out.println("Success");
			   Statement stat;
			   stat = connect.createStatement();
		
		Dijkstra d = new Dijkstra();
		
		  Scanner S = new Scanner(System.in);
		    Vertex[] vNew=d.calldij();
			int[] start = new int[100000];
			
			for(int a=0; a<100000; a++){
				start[a] = (int)(Math.random()*5-Math.random()*6);
				
				while(start[a]> 2){
					start[a] = (int)(Math.random()*5-Math.random()*6);
				}
				
			}
			
			
		  while(true){
			  
				 //System.out.println("Enter ID");
				// System.out.println("Tracking ID" + "  " + S);
				 //int input;
				 //input= S.nextInt();
				 String Status = new String();
				for(int input= 1; input <=30;input++)
				//System.out.println("*************************************************************************************************************************************************************************************************************************");
				//System.out.println("Tracking ID : " +  input);
			    //System.out.println("");
			    
				/*System.out.println("Source      : " + d.getSrcCities(input));
				
				System.out.println("Destination : " + d.getDesCities(input));
				*/
				{
					List path = d.pathOf(d.SrcCity[input],d.DestCity[input],vNew);
				
				if((path.size()-start[input]) ==0) start[input]--;
				
				int pres = (int) (database.time-start[input])/(path.size()-start[input]);
				
				if (pres > path.size()-1) pres = path.size()-1 ; 
				//String present = path.get(pres);
				
				//System.out.println("Present     : " + path.get(pres));
				
				if(pres< path.size()-1) Status = "In transit";
				if(pres == path.size()-1) Status = "Delivered";
				//System.out.println("Status      : " + Status);
				/*String query = "INSERT into Packages(ID, Source, "
						+ "Destination, Current_Status, Last_known_location) "
						+ "VALUES("+input+",'"+rand.getSrcCities(input)+"','"+rand.getDesCities(input)+"','"
						+Status+"', '"+path.get(pres)+"')";
				 */  
				String query = "UPDATE Packages SET Current_status = '"+Status+"', Last_known_location = '"+path.get(pres)+"' where ID = "+input;
				//System.out.println(query);
				
				stat.executeUpdate(query); 
				//System.out.println("*************************************************************************************************************************************************************************************************************************");
				  }
		
	}
		}
		catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
}
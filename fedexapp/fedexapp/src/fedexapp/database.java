package fedexapp;
import java.sql.*;
public class database   {
	 
	
	public static double time = 0;
	
	
	
	 
	
	public  static void main(String[] args) {
		/*try {
			   Class.forName("com.mysql.jdbc.Driver");
			   String user = "rofl";
			   Dijkstra rand = new Dijkstra();
			   Vertex[] b = rand.calldij(); 
			   String pwd = "";
			   Connection connect = DriverManager.getConnection("jdbc:mysql://192.168.0.101:3306/users", user, pwd);		
			   Statement stat;
			   //System.out.println("Success");
			   //System.out.println(rand.getDesCities(3));
			  for(int i=1; i<=30;i++)
			  {
			   String query = "INSERT into Packages(ID, Source, Destination) VALUES("+i+",'"+rand.getSrcCities(i)+"','"+rand.getDesCities(i)+"')";
			   System.out.println(query);
			   stat = connect.createStatement();
			   stat.execute(query);
			  }
			  //System.out.println("Success");
			}
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		} */
		//System.out.println("No connection");
		output o = new output();
	    o.start();
	    
	    while(true){
	    	time++;
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
		
	 }
}

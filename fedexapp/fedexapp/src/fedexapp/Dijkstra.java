package fedexapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

class Dijkstra
  { 
//	static int SrcCity[] = new int[100000];
//	  static int DestCity[] = new int[100000];
	    
	
	static Vertex SrcCity[] = new Vertex[100000];
  static Vertex DestCity[] = new Vertex[100000];
  static Vertex PresCity[] = new Vertex[100000];
  
  
      public static void computePaths(Vertex source)
      {
          source.minDistance = 0.;
          PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
  	vertexQueue.add(source);
  
  		while (!vertexQueue.isEmpty()) {
  	    Vertex u = vertexQueue.poll();
  
              // Visit each edge exiting u
              for (Edge e : u.adjacencies)
              {
                  Vertex v = e.target;
                  double weight = e.weight;
                  double distanceThroughU = u.minDistance + weight;
                  	if (distanceThroughU < v.minDistance) {
                  		vertexQueue.remove(v);
                  		v.minDistance = distanceThroughU ;
                  		v.previous = u;
                  		vertexQueue.add(v);
                  	}
              }	
          }
      }
  
      public static List<Vertex> getShortestPathTo(Vertex target)
      {
          List<Vertex> path = new ArrayList<Vertex>();
          for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
              path.add(vertex);
     
          Collections.reverse(path);
          return path;
      }
  
      public Vertex[] calldij()
      
      {  
          Vertex v0 = new Vertex("Northborough");
  	Vertex v1 = new Vertex("Edison");
  	Vertex v2 = new Vertex("Pittsburgh");
  	Vertex v3 = new Vertex("Allentown");
  	Vertex v4 = new Vertex("Martinsburg");
  	Vertex v5 = new Vertex("Charlotte");
  	Vertex v6 = new Vertex("Atlanta");
  	Vertex v7 = new Vertex("Orlando");
  	Vertex v8 = new Vertex("Memphis");
  	Vertex v9 = new Vertex("Grove City");
  	Vertex v10 = new Vertex("Indianapolis");
  	Vertex v11 = new Vertex("Detroit");
  	Vertex v12 = new Vertex("New Berlin");
  	Vertex v13 = new Vertex("Minneapolis");
  	Vertex v14 = new Vertex("St.Louis");
  	Vertex v15 = new Vertex("Kansas");
  	Vertex v16 = new Vertex("Dallas");
  	Vertex v17 = new Vertex("Houston");
  	Vertex v18 = new Vertex("Denver");
  	Vertex v19 = new Vertex("Salt Lake City");
  	Vertex v20 = new Vertex("Phoenix");
  	Vertex v21 = new Vertex("Los Angeles");
  	Vertex v22 = new Vertex("Chino");
  	Vertex v23 = new Vertex("Sacramento");
  	Vertex v24 = new Vertex("Seattle");
  	
  
  	
  	
  	v0.adjacencies = new Edge[]{ new Edge(v11,  586),
  	                             new Edge(v3,  244),
  	                           new Edge(v1,  200)};
  	v1.adjacencies = new Edge[]{ new Edge(v0,  200),
  	                             new Edge(v3,  57),
  	                             new Edge(v5, 493),
  	                             new Edge(v4,  207),
  	                           new Edge(v7,  919)};
  	v2.adjacencies = new Edge[]{ new Edge(v3,  150), 
  			                     new Edge(v4,  153),
  			                     new Edge(v9,  179),
  			                   new Edge(v12,  445)};
 	v3.adjacencies = new Edge[]{ new Edge(v0,  244),
	                             new Edge(v1,  57),
 	                             new Edge(v4,  150),
 	                            new Edge(v11,  417),
 	                           new Edge(v2,  238)};
 	v4.adjacencies = new Edge[]{ new Edge(v1, 207),
 			                     new Edge(v3,  150),
 			                    new Edge(v9,  275),
 		
 			                     new Edge(v2,  153),
 			                  new Edge(v5,  319)};
 	v5.adjacencies = new Edge[]{ new Edge(v0,  81.77),
 	                             new Edge(v1,  493),
 	                             new Edge(v7, 485),
 	                             new Edge(v6,  246),
 	                            new Edge(v8,  521),
 	                           new Edge(v10,  403)};
 	v6.adjacencies = new Edge[]{ new Edge(v7,  389),
 	                             new Edge(v17,  706),
 	                            new Edge(v5,  246),
 	                            new Edge(v8, 352)
 	                           };
 	v7.adjacencies = new Edge[]{ new Edge(v1,  919),
                                 new Edge(v5,  485),
                                 new Edge(v6,  389)
                                                 };
 	v8.adjacencies = new Edge[]{ new Edge(v9,  473),
             new Edge(v5,  521),
             new Edge(v16, 440),
             new Edge(v6,  352),
            new Edge(v15,  373),
           new Edge(v14,  208)};
 	v9.adjacencies = new Edge[]{ new Edge(v4,  275),
             new Edge(v11,  207),
             new Edge(v2, 179),
             new Edge(v10,  165),
            new Edge(v8,  473),
                               };
 	v10.adjacencies = new Edge[]{ new Edge(v0,  81.77),
             new Edge(v13,  504),
             new Edge(v12, 231),
             new Edge(v5,  403),
            new Edge(v14,  229),
           new Edge(v9, 165)};
 	v11.adjacencies = new Edge[]{ new Edge(v0, 586),
             new Edge(v1,  417),
             new Edge(v9, 207),
             new Edge(v12,  260),
                                 };
 	v12.adjacencies = new Edge[]{ new Edge(v0,  81.77),
             new Edge(v2, 445),
             new Edge(v13, 295 ),
             new Edge(v10,  231)
                                 };
 	v13.adjacencies = new Edge[]{ new Edge(v12,  295),
             new Edge(v24,  1415),
             new Edge(v14, 444),
             new Edge(v15,  352),
            new Edge(v18,  697),
           new Edge(v10,  504)};
 	v14.adjacencies = new Edge[]{ 
             new Edge(v13, 444),
             new Edge(v8,  208),
            new Edge(v15,  247),
           new Edge(v10,  229)};
 	v15.adjacencies = new Edge[]{ new Edge(v13,  352),
             new Edge(v16,  500),
             new Edge(v14, 247),
             new Edge(v18,  559),
            new Edge(v8,  373),
           };
 	v16.adjacencies = new Edge[]{ new Edge(v15,  500),
             new Edge(v18,  668),
             new Edge(v17, 224),
             new Edge(v20,  892),
            new Edge(v8,  440),
           };
 	v17.adjacencies = new Edge[]{ new Edge(v16, 224),
             
             new Edge(v20, 1026),
             new Edge(v6,  706),
            };
 	v18.adjacencies = new Edge[]{ new Edge(v19,  374),
             new Edge(v20,  573),
             new Edge(v16, 668),
             new Edge(v15,  559),
            new Edge(v13,  697),
           new Edge(v24,  1033)};
 	v19.adjacencies = new Edge[]{ new Edge(v18,  374),
             new Edge(v24,  711),
             new Edge(v23, 534),
             new Edge(v22,  523),
            new Edge(v20,  484),
           };
 	v20.adjacencies = new Edge[]{ new Edge(v19,  484),
                    new Edge(v18,  573),
                    new Edge(v16, 892),
                    new Edge(v17,  1026),
                   new Edge(v22,  331),
                  new Edge(v21,  362)};
 	v21.adjacencies = new Edge[]{ new Edge(v22,  32),
             new Edge(v23,  331),
             new Edge(v20, 362),
            };
 	v22.adjacencies = new Edge[]{ new Edge(v21,  32),
             new Edge(v20,  331),
             new Edge(v19, 523),
             new Edge(v23,  349),
            };
 	v23.adjacencies = new Edge[]{ new Edge(v22,  349),
             new Edge(v19,  534),
             new Edge(v21, 331),
             new Edge(v24,  623),
            };
 	v24.adjacencies = new Edge[]{ new Edge(v23,  623),
             new Edge(v19,  711),
             new Edge(v18, 1033),
             new Edge(v13,  1415),
            };
 	
 	Vertex[] vertices = { v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24 };
 
    for(int a =0; a<100000; a++){
    	 int k = new Random().nextInt(vertices.length);
    	 SrcCity[a] = vertices[k];
    	 int l = new Random().nextInt(vertices.length);
    	 DestCity[a] = vertices[l];
    	 //System.out.println(SrcCity[a]);
    	//SrcCity[a] = (int)Math.random()*25;
    	
    	//DestCity[a] = (int)Math.random()*25;
    	   
     }
    
  //       for (int i=0;i<25;i++){
    //    	 
        //	 computePaths(SrcCity[i]);
      //  	
        //	 for(int j=0; j<25; j++){
        	// 
        		// System.out.println("from "+SrcCity[i]+"Distance to " + DestCity[j] + ": " + DestCity[j].minDistance);
          //  	 List<Vertex> path = getShortestPathTo(DestCity[j]);
            //	 System.out.println("Path: " + path);     
        	 //}	 
   
            	 
         //}	
    
    
         return vertices;
 
 
     }
      
      
      
      
      public List pathOf (Vertex src, Vertex dest,Vertex [] arr_city){
    //	  computePaths(src);
    //	  List<Vertex> path = getShortestPathTo(dest);
	//	return path;
    	  
    	  for (Vertex v : arr_city)
    	  {
    		  v.minDistance=Double.POSITIVE_INFINITY;
    		  v.previous=null;
    	  }
    	  computePaths(src);
    	  System.out.println("Distance    : " + dest.minDistance + " " + "miles");
     	 List<Vertex> path = getShortestPathTo(dest);
     	 System.out.println("Path        : " + path);
      	return path;
      	
      }
      public Vertex getSrcCities(int i)
      {
    	  //System.out.println(SrcCity[i] +""+ i);
    	  return SrcCity[i];
      }
      public Vertex getDesCities(int i)
      {
    	  return DestCity[i];
      }
      
      
      
   
      
 }  
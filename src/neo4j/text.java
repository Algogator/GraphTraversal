package neo4j;
import java.awt.Label;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

import org.neo4j.graphalgo.GraphAlgoFactory;
import org.neo4j.graphalgo.PathFinder;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.DynamicLabel;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Path;
import org.neo4j.graphdb.PathExpanders;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.schema.IndexDefinition;
import org.neo4j.graphdb.schema.Schema;
import org.neo4j.helpers.collection.IteratorUtil;
public class text{
	 static String c;
	 static int stop=0;
	 static ArrayList<Node> Nodesfinal = new ArrayList<>();
	 static ArrayList<Node> a0 = new ArrayList<>();
	 static ArrayList<Node> a1 = new ArrayList<>();

	 static ArrayList<Node> a125 = new ArrayList<>();
	 static ArrayList<Node> a15 = new ArrayList<>();

	 static ArrayList<Node> a175 = new ArrayList<>();

	 static ArrayList<Node> a2 = new ArrayList<>();

	 static ArrayList<Node> a225 = new ArrayList<>();

	 static ArrayList<Node> a25 = new ArrayList<>();

	 static ArrayList<Node> a275 = new ArrayList<>();

	 static ArrayList<Node> a3 = new ArrayList<>();


	 static ArrayList<Node> a325 = new ArrayList<>();
	 static ArrayList<Node> a35 = new ArrayList<>();

	 static ArrayList<Node> a375 = new ArrayList<>();

	 static ArrayList<Node> a4 = new ArrayList<>();
	 
	 static ArrayList<Node> a425 = new ArrayList<>();
	 static ArrayList<Node> a45 = new ArrayList<>();

	 static ArrayList<Node> a475 = new ArrayList<>();

	 static ArrayList<Node> a5 = new ArrayList<>();
	 
	 
	public static void main (String[] args){
	
		GraphDatabaseFactory graphDbFactory = new GraphDatabaseFactory();

	      GraphDatabaseService graphDb = graphDbFactory.newEmbeddedDatabase("/home/anna/neo");
	      ExecutionEngine execEngine = new ExecutionEngine(graphDb);
	      
	      System.out.println("Enter Competency (Eg: 1-5)");
	     Scanner scan=new Scanner(System.in);
	     c =  scan.nextLine();
	      String values[]={"0","1","1.25","1.5","1.75","2","2.25","2.5","2.75","3","3.25","3.5","3.75","4","4.25","4.5","4.75","5"};

	     //c =  scan.nextLong();
	      /*  ExecutionResult result = execEngine.execute("MATCH (n) RETURN n;");
	      
	    	    while ( result.hasNext() )
	    	    {
	    	        Map<String,Object> row = result.next();
	    	        String rows = null;
					for ( Entry<String,Object> column : row.entrySet() )
	    	        {
	    	            rows += column.getKey() + ": " + column.getValue() + "; ";
	    	        }
	    	        rows += "\n";
	    	    }
	    	
	     // String result = execResult.dumpToString();
	     IndexDefinition indexDefinition;
	     
	     try ( Transaction tx = graphDb.beginTx() )
	     {
	         org.neo4j.graphdb.Label label = DynamicLabel.label( "JAVA" );
	         for ( IndexDefinition indexDefinition1 : graphDb.schema()
	                 .getIndexes( label ) )
	         {
	             // There is only one index
	             indexDefinition1.drop();
	         }

	         tx.success();
	     }
	     
	      try ( Transaction tx = graphDb.beginTx() )
	      {
	          Schema schema = graphDb.schema();
	          indexDefinition = schema.indexFor( DynamicLabel.label( "JAVA" ) )
	                  .on( "POST" )
	                  .create();
	          tx.success();
	      }
	      System.out.println( "SUccess");
			
	      double values[]={0,1,1.25,1.5,1.75,2,2.25,2.5,2.75,3,3.25,3.5,3.75,4,4.25,4.5,4.75,5};
	      org.neo4j.graphdb.Label label = DynamicLabel.label( "JAVA" );
	      //String idToFind = "3";
	      //String nameToFind = idToFind;
	      int index = Arrays.binarySearch(values, c);
	      while(c<5){
		   

	      try ( Transaction tx = graphDb.beginTx() )
	      {
	    	  
	          try ( ResourceIterator<Node> users =
	                  graphDb.findNodes( label, "PRE", c ) )
	          {
	              ArrayList<Node> userNodes = new ArrayList<>();
	              while ( users.hasNext() )
	              {
	                  userNodes.add( users.next() );
	              }

	              for ( Node node : userNodes )
	              {		
	                  System.out.println( node + " \t || " + node.getProperty( "PRE" ) );
	                  for (Relationship rel : node.getRelationships()) { // n1.getRelationships(type,direction)
	                	  System.out.println(" \t || " +rel);
	                   }
	              }
	          }
	      }
	      c = values[index++];
	      }  
	    */
	      
	     
	      
	      try ( Transaction tx = graphDb.beginTx() )
	      {
	    	  
	    	  
	    	  Node initialnode = graphDb.getNodeById(34);
	    	  ArrayList<Node> nodes = new ArrayList<Node>();
	    	  nodes.add(initialnode);
	    	 // ArrayList<Node> n1 = new ArrayList<>();

	    	 while(stop!=1){
	    		
	    		nodes = findconnectednodes(nodes);
	    		
		

	    		
	    	 }
	    	 HashSet hs = new HashSet();
	    	 hs.addAll(Nodesfinal);
	    	 Nodesfinal.clear();
	    	 Nodesfinal.addAll(hs);
	    	 System.out.println("Nodes in this path");
	    	 System.out.println(Nodesfinal);
	    	 System.out.println("\n========================================== \n");
	    	 System.out.println("CLIQUES");
	    	 System.out.println("\n========================================== \n");
	    	 String val[] = {};
	    	 for ( Node n : Nodesfinal ){
	 			if (n.getProperty("POST").toString().equals("0")){
	 				a0.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("1")){
	 				a1.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("1.25")){
	 				a125.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("1.5")){
	 				a15.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("1.75")){
	 				a175.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("2")){
	 				a2.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("2.25")){
	 				a225.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("2.5")){
	 				a25.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("2.75")){
	 				a275.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("3")){
	 				a3.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("3.25")){
	 				a325.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("3.5")){
	 				a35.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("3.75")){
	 				a375.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("4")){
	 				a4.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("4.25")){
	 				a425.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("4.5")){
	 				a45.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("4.75")){
	 				a475.add(n);
	 			}
	 			else if (n.getProperty("POST").toString().equals("5")){
	 				a475.add(n);
	 			}

	    	 }
	    	 System.out.println("Clique for 0");
	    	 System.out.println(a0);
	    	 System.out.println("");
	    	 System.out.println("Clique for 1");
	    	 System.out.println(a1);
	    	 System.out.println("");
	    	 System.out.println("Clique for 1.25");
	    	 System.out.println(a125);
	    	 System.out.println("");
	    	 System.out.println("Clique for 1.5");
	    	 System.out.println(a15);
	    	 System.out.println("");
	    	 System.out.println("Clique for 1.75");
	    	 System.out.println(a175);
	    	 System.out.println("");
	    	 System.out.println("Clique for 2");
	    	 System.out.println(a2);
	    	 System.out.println("");
	    	 System.out.println("Clique for 2.25");
	    	 System.out.println(a225);
	    	 System.out.println("");
	    	 System.out.println("Clique for 2.5");
	    	 System.out.println(a25);
	    	 System.out.println("");
	    	 System.out.println("Clique for 2.75");
	    	 System.out.println(a275);
	    	 System.out.println("");
	    	 System.out.println("Clique for 3");
	    	 System.out.println(a3);
	    	 System.out.println("");
	    	 System.out.println("Clique for 3.25");
	    	 System.out.println(a325);
	    	 System.out.println("");
	    	 System.out.println("Clique for 3.5");
	    	 System.out.println(a35);
	    	 System.out.println("");
	    	 System.out.println("Clique for 3.75");
	    	 System.out.println(a375);
	    	 System.out.println("");
	    	 System.out.println("Clique for 4");
	    	 System.out.println(a4);
	    	 System.out.println("");
	    	 System.out.println("Clique for 4.25");
	    	 System.out.println(a425);
	    	 System.out.println("");
	    	 System.out.println("Clique for 4.5");
	    	 System.out.println(a45);
	    	 System.out.println("");
	    	 System.out.println("Clique for 4.75");
	    	 System.out.println(a475);
	    	 System.out.println("");
	    	 System.out.println("Clique for 5");
	    	 System.out.println(a5);
	    	 System.out.println("");

	    	 Node endNode = graphDb.getNodeById(20);
	    	PathFinder<Path> finder = GraphAlgoFactory.shortestPath(
	    	PathExpanders.forDirection( Direction.INCOMING ), 100 );
	    	Iterable<Path> paths = finder.findAllPaths( initialnode, endNode );
	    	 System.out.println("\n========================================== \n");
	    	 System.out.println("SHORTEST PATHS");
	    	 System.out.println("\n========================================== \n");
	    	for ( Path p : paths ){
	    		System.out.println(p);
	    	}
	      }
	}


	private static ArrayList<Node> findconnectednodes(ArrayList<Node> nodes) {
		// TODO Auto-generated method stub
		 ArrayList<Node> rnodes = new ArrayList<>();
		
		for ( Node n : nodes ){
			
			//System.out.println("Property: \t" + n.getProperty("POST"));
			if (n.getProperty("POST").toString().equals(c)){
   			 Nodesfinal.add(n);
   			// System.out.println( "Found it!!!");
   			 stop = 1;
			}
			else{
				
			Nodesfinal.addAll(findconnectednode(n));
			rnodes.addAll(findconnectednode(n));
			}
			}
		 
		return rnodes;
	}


	private static void printnodes(ArrayList<Node> Nodes) {
		// TODO Auto-generated method stub
		for ( Node n : Nodes ){
   		 System.out.println(n);		
   		 
   	 }
		
	}

/*
	private static ArrayList<Node> checkifarrayhasvalue(ArrayList<Node> Nodes) {
		// TODO Auto-generated method stub
	  	  ArrayList<Node> userNodes = new ArrayList<>();
	  	  loop: {
		  for ( Node n : Nodes ){
	    		 if (n.getProperty("POST")==c){
	    			 userNodes.add(n);
	    			 System.out.println( "Found it!!!");
	    			 stop = 1;
	    			 break loop;
	    		
	    		 }
	    		 else{
	    			 userNodes.add(n);
	    		 }
	    	  }
	  	  }
			return(userNodes); 
	}

*/
	private static ArrayList<Node> findconnectednode(Node node) {
		// TODO Auto-generated method stub
	
  	  ArrayList<Node> userNodes = new ArrayList<>();

		for (Relationship rel : node.getRelationships(Direction.INCOMING)) { 
      	 // System.out.println(" \t || " +rel.getStartNode());
      	  Node n = rel.getStartNode();
      	   userNodes.add( rel.getStartNode() );
		}
		
	return(userNodes);	
	}
	
}
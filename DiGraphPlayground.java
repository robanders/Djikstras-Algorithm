package A6_Dijkstra;

public class DiGraphPlayground {

	  public static void main (String[] args) {
	  
	      // thorough testing is your responsibility
	      //
	      // you may wish to create methods like 
	      //    -- print
	      //    -- sort
	      //    -- random fill
	      //    -- etc.
	      // in order to convince yourself your code is producing
	      // the correct behavior
	    exTest();
	    }
	  
	    public static void exTest(){
	      DiGraph d = new DiGraph();
	      
	      /*
	      d.addNode(1, "f");
	      d.addNode(3, "s");
	      d.addNode(7, "t");
	      d.addNode(0, "fo");
	      d.addNode(4, "fi");
	      d.addNode(6, "si");
	      d.addEdge(0, "f", "s", 0, null);
	      d.addEdge(1, "f", "si", 0, null);
	      d.addEdge(2, "s", "t", 0, null);
	      d.addEdge(3, "fo", "fi", 0, null);
	      d.addEdge(4, "fi", "si", 0, null);
	     // d.addEdge(10, "fi", "fo", 0, null);
	      //d.delNode("fo");
	      //d.delEdge("f", "s");
	      System.out.println("numEdges: "+d.numEdges());
	      System.out.println("numNodes: "+d.numNodes());
	      d.print(); */
	      
	     /* d.addNode(0, "a");
	      d.addNode(1, "b");
	      d.addNode(2, "c");
	      d.addNode(3, "d");
	      d.addEdge(0, "d", "a", 0, null);
	      d.addEdge(1, "a", "b", 0, null);
	      d.addEdge(2, "b", "c", 0, null);
	      d.delEdge("d", "a");
	      d.addEdge(3, "c", "d", 0, null);
	      d.print();
	      printTOPO(d.topoSort()); */
	      //d.toposort() == [a, b, c, d] (There's only one toposort for this case)
	      
	      /*d.addNode(1,"f");
	      d.addNode(2,"x");
	      System.out.println("numNodes: "+d.numNodes());
	      d.addEdge(0,"f","x",0,null);
	      System.out.println("numEdges: "+d.numEdges());
	      d.delNode("x");
	      System.out.println("numNodes: "+d.numNodes());
	      System.out.println("numEdges: "+d.numEdges());
	      d.addNode(2,"x");
	      d.addEdge(0,"f","x",0,null);
	      d.print();
	      //printTOPO(d.topoSort()); */
	      
	      /*d.addNode(1,"p");
	      d.addNode(4,"a");
	      d.addNode(3,"g");
	      d.addNode(2,"e");
	      d.addEdge(0, "p", "a", 0, null);
	      d.addEdge(1, "a", "g", 0, null);
	      d.addEdge(2, "g", "e", 0, null);
	      d.addEdge(3, "e", "p", 0, null);
	      d.addEdge(4, "p", "g", 0, null);
	      d.addEdge(5, "a", "e", 0, null);
	      d.addEdge(6, "p", "e", 0, null);
	      d.delNode("e");
	      d.print();*/
	      //printTOPO(d.topoSort());
	      
	      
	      d.addNode(0, "a");
	      d.addNode(1, "b");
	      d.addNode(2, "c");
	      d.addNode(3, "d");
	      d.addNode(4, "e");
	      d.addNode(5, "f");
	      d.addEdge(0, "a", "b", 3, null);
	      d.addEdge(1, "b", "c", 4, null);
	      d.addEdge(2, "a", "c", 5, null);
	      d.addEdge(4, "a", "e", 8, null);
	      d.addEdge(8, "b", "f", 2, null);
	      d.addEdge(5, "e", "f", 3, null);
	      d.addEdge(9, "c", "d", 3, null);
	      //d.addEdge(10, "a", "a", 2, null);
	      //d.addEdge(10, "b", "b", 4, null);
	      d.delEdge("b", "f");
	      
	      //d.delNode("b");
	      d.print();
	      //d.addEdge(3, "a", "a", 5, null);
	      
	      //d.addEdge(3, "c", "d", 6, null);
	      //d.delNode("c");
	      
	      d.shortestPath("a");
	      //d.shortestPath("c");
	      //d.shortestPath("f");
	      //d.shortestPath("a");
	      //d.shortestPath("c");
	      //d.toString();
	      
	   
	    }
	    public static void printTOPO(String[] toPrint){
	      System.out.print("TOPO Sort: ");
	      if(toPrint == null){
	    	  System.out.println("null array");
	    	  return;
	      }
	      for (String string : toPrint) {
	      System.out.print(string+" ");
	    }
	      System.out.println();
	    }

	}
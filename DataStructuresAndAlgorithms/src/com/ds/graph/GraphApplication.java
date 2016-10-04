/**
 * 
 */
package com.ds.graph;

/**
 * @author mrule
 *
 */
public class GraphApplication {

	public static void main(String args[]){
		SimpleGraph g1 = new SimpleGraph();
		g1.insertEdge('A', 'B', 10);
		g1.insertEdge('A', 'D', 8);
		g1.insertEdge('A', 'F', 6);
		g1.insertEdge('C', 'B', 12);
		g1.insertEdge('F', 'D', 11);
		g1.insertEdge('C', 'E', 2);
		g1.insertEdge('D', 'E', 7);
		g1.DFS('F');
	}
}

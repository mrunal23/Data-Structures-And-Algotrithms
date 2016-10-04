/**
 * 
 */
package com.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * @author mrule
 *
 */
public class SimpleGraph {
	
	private int VertexCount;
	private HashMap<Character,LinkedList<ListNode>> edgeList = new HashMap<Character, LinkedList<ListNode>>();
	
	public int getVertexCount() {
		return VertexCount;
	}

	public void setVertexCount(int vertexCount) {
		VertexCount = vertexCount;
	}

	public HashMap<Character, LinkedList<ListNode>> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(HashMap<Character, LinkedList<ListNode>> edgeList) {
		this.edgeList = edgeList;
	}
	
	public void insertEdge(char start, char end , int weight){
		
		Vertex v1 = new Vertex();
		v1.setName(start);
		Vertex v2 =  new Vertex();
		v2.setName(end);
		ListNode node = new ListNode();
		node.setEnd(v2);
		
		ListNode node1 = new ListNode();
		node1.setEnd(v1);
		
		if(edgeList.containsKey(start)){
			LinkedList<ListNode> list = edgeList.get(start);
			list.add(node);			
		}else{
			LinkedList<ListNode> list = new LinkedList<>();
			list.add(node);
			edgeList.put(start, list);
		}
		
		if(edgeList.containsKey(end)){
			LinkedList<ListNode> list = edgeList.get(end);
			list.add(node1);			
		}else{
			LinkedList<ListNode> list = new LinkedList<>();
			list.add(node1);
			edgeList.put(end, list);
		}
		
		
	}

	public void printList(){
		for(Entry<Character, LinkedList<ListNode>> e:edgeList.entrySet()){
			System.out.println(e.getKey()+ " -> ");
			ListIterator<ListNode> iterator = e.getValue().listIterator();
			while(iterator.hasNext()){
				System.out.print( iterator.next().getEnd().getName() + "\t");
			}
			System.out.println("");
		}
	}
	
	public void BFS(char startVertex){
		System.out.println("in BFS");
		if(edgeList.containsKey(startVertex)){
			System.out.println("edgeList contains key!!");
			Set<Character> vertexSet = new HashSet<Character>();
			Queue<Character> q = new LinkedList<Character>();
		
			q.add(startVertex);
			System.out.println("\nBFS is :: \n");
			while(!q.isEmpty()){
				//System.out.println("in while");
				char temp = q.poll();
				
				if(!vertexSet.contains(temp)){
					vertexSet.add(temp);
					System.out.print(temp + "->");				
					LinkedList tempList = edgeList.get(temp);
					for(int i=0;i<tempList.size();i++){
						ListNode node = (ListNode) tempList.get(i);
						if(!vertexSet.contains(node.getEnd().getName())){						
							q.add(node.getEnd().getName());						
						}
					}
				}
			}
		}
		else{
			System.out.println("vertex does not exist..!!");
		}
	}
	
	
	public void DFS(char startVertex){
		if(edgeList.containsKey(startVertex)){
			System.out.println("edgeList contains key!!");
			Set<Character> vertexSet = new HashSet<Character>();
			Stack<Character> s = new Stack<Character>();
		
			s.push(startVertex);
			System.out.println("\nDFS is :: \n");
			while(!s.isEmpty()){
				//System.out.println("in while");
				char temp = s.pop();
				
				if(!vertexSet.contains(temp)){
					vertexSet.add(temp);
					System.out.print(temp + "->");				
					LinkedList<ListNode> tempList = edgeList.get(temp);
					for(int i=tempList.size()-1;i>=0;i--){
						ListNode node = (ListNode) tempList.get(i);
						if(!vertexSet.contains(node.getEnd().getName())){						
							s.push(node.getEnd().getName());						
						}
					}
				}
			}
		}
		else{
			System.out.println("vertex does not exist..!!");
		}
	}
}

package Lecture22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Graphs {
	public class Vertex {
		String name;
		HashMap<Vertex, Integer> nbrs;

		Vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();
		}

		public boolean equals(Object other) {
			Vertex ov = (Vertex) other;
			return this.name.equals(ov.name);
		}

		public void display() {
			String str = "";
			str = str + this.name + "=>";

			Set<Vertex> nbrs = this.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				str = str + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
			}
			str = str + " END";
			System.out.println(str);
		}
	}

	HashMap<String, Vertex> vtces;

	Graphs() {
		this.vtces = new HashMap<>();
	}

	public int numVertices() {
		return this.vtces.size();
	}

	public void addVertex(String name) {
		if (vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = new Vertex(name);
		this.vtces.put(name, vtx);
	}

	public void removeVertex(String name) {
		if (!vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = this.vtces.get(name);
		Set<Vertex> nbrs = vtx.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			nbr.nbrs.remove(vtx);
		}

		this.vtces.remove(name);
	}

	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);
	}

	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx1);
	}

	public int numEdges() {
		int rv = 0;
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			rv = rv + vtx.nbrs.size();
		}

		rv = rv / 2;

		return rv;
	}

	public void display() {
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			vtx.display();
		}
	}
	
	public boolean hasPath(String name1,String name2) {
		Vertex vtx1=this.vtces.get(name1);
		Vertex vtx2=this.vtces.get(name2);
		
		if(vtx1==null||vtx2==null) {
			return false;
		}
		HashMap<Vertex,Boolean> explored=new HashMap<>();
		this.hasPath(vtx1,vtx2,explored);
	}
	
	private boolean hasPath(Vertex vtx1,Vertex vtx2,HashMap<Vertex, Boolean> explored) {
		
		
	}

}

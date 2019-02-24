package Lecture19;

import java.util.ArrayList;

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(13);
		list1.add(21);
		list1.add(44);

		lists.add(list1);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(6);
		list2.add(12);
		list2.add(15);
		list2.add(18);

		lists.add(list2);

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(7);

		lists.add(list3);

	//	System.out.println(lists);
		
		ArrayList<Integer> ans=MergeKLists(lists);
		System.out.println(ans);
		

	}

	public static class Pair implements Comparable<Pair> {
		int data;
		int listno;
		int idxno;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.data - o.data;
		}

	}

	public static ArrayList<Integer> MergeKLists(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> ans = new ArrayList<>();
		Heap<Pair> heap=new Heap<>(true);
		
		for(int i=0;i<lists.size();i++) {
			Pair p=new Pair();
			p.data=lists.get(i).get(0);
			p.listno=i;
			p.idxno=0;
			
			heap.add(p);
		}
		
		while(!heap.isEmpty()) {
			Pair rp=heap.remove();
			ans.add(rp.data);
			rp.idxno++;
			if(rp.idxno<lists.get(rp.listno).size()) {
				rp.data=lists.get(rp.listno).get(rp.idxno);
				heap.add(rp);
			}
			
		}
		
		return ans;
	}

}

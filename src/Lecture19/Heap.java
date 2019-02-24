package Lecture19;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	private ArrayList<T> data;
	private boolean isMin;

	public Heap(boolean isMin) {
		this.isMin = isMin;
		this.data = new ArrayList<>();
	}

	public Heap(T[] items) {
		
	}
	public int size() {
		return this.data.size();
	}

	public T getHP() {
		return this.data.get(0);
	}

	public void add(T data) {
		this.data.add(data);
		this.upheapify(this.data.size() - 1);
	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;
		if (!isLarger(pi, ci)) {
			this.swap(pi, ci);
			this.upheapify(pi);
		}
	}

	private void swap(int i, int j) {
		T ithitem = this.data.get(i);
		T jthitem = this.data.get(j);

		this.data.set(i, jthitem);
		this.data.set(j, ithitem);
	}

	private boolean isLarger(int i, int j) {
		T ithitem = this.data.get(i);
		T jthitem = this.data.get(j);

		if (isMin) {
			return ithitem.compareTo(jthitem) < 0;
		} else {
			return ithitem.compareTo(jthitem) > 0;
		}

	}

	public T remove() {
		T rv = this.data.get(0);
		this.swap(0, this.data.size() - 1);
		this.data.remove(this.data.size() - 1);
		this.downheapify(0);
		return rv;

	}

	private void downheapify(int pi) {
		int mi = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		if (lci < this.data.size() && isLarger(lci, mi)) {
			mi = lci;
		}
		if (rci < this.data.size() && isLarger(rci, mi)) {
			mi = rci;
		}

		if (mi != pi) {
			this.swap(pi, mi);
			this.downheapify(mi);
		}
	}

	public void display() {
		this.display(0);
	}

	private void display(int index) {
		int lci = 2 * index + 1;
		int rci = 2 * index + 2;

		String str = "";
		if (lci < this.data.size()) {
			T lc = this.data.get(lci);
			str = str + lc + "=>";
		} else {
			str = str + "END=>";
		}

		str = str + this.data.get(index);
		if (rci < this.data.size()) {
			T rc = this.data.get(rci);
			str = str + "<=" + rc;
		} else {
			str = str + "<=END";
		}

		System.out.println(str);
		if (lci < this.data.size()) {
			this.display(lci);
		}

		if (rci < this.data.size()) {
			this.display(rci);
		}

	}
}

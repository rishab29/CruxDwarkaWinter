package Lecture19;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Heap<Integer> heap = new Heap<>(false);
//
//		heap.add(35);
//		heap.add(30);
//		heap.add(25);
//		heap.add(20);
//		heap.add(15);
//		heap.add(10);
//		heap.add(5);
//		heap.add(8);
//		heap.add(12);
//
//		heap.display();
//		System.out.println("********************");
//		heap.add(45);
//		heap.display();
//		System.out.println("********************");
//		heap.remove();
//		heap.display();

//		Heap<Student> heap = new Heap<>(false);
//		heap.add(new Student("A", 800, 2));
//		heap.add(new Student("B", 300, 7));
//		heap.add(new Student("C", 100, 9));
//		heap.add(new Student("D", 600, 4));
//		heap.add(new Student("E", 900, 1));
//		heap.add(new Student("F", 500, 5));
//		heap.add(new Student("G", 400, 6));
//		heap.add(new Student("H", 200, 8));
//		heap.add(new Student("I", 700, 3));

	//	heap.display();
		Student[] students=new Student[9];
		students[0]=new Student("A", 800, 2);
		students[1]=new Student("B", 300, 7);
		students[2]=new Student("C", 100, 9);
		students[3]=new Student("D", 600, 4);
		students[4]=new Student("E", 900, 1);
		students[5]=new Student("F", 500, 5);
		students[6]=new Student("G", 400, 6);
		students[7]=new Student("H", 200, 8);
		students[8]=new Student("I", 700, 3);
		
		Heap<Student> heap=new Heap<>(students);
		heap.display();//(o(n)
	}

	public static class Student implements Comparable<Student> {
		String name;
		int marks;
		int rank;

		public Student(String name, int marks, int rank) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.marks = marks;
			this.rank = rank;
		}

		public String toString() {
			return "{name=" + this.name + " marks=" + this.marks + " rank=" + this.rank + "}";
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.marks - o.marks;
		}

	}

}

package pl.testgit2;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.fru();
		t.workHard(7);
		Test2 t2 = new Test2();
		t2.workVeryHard();
		Test3 t3 = new Test3();
		t3.workLazy();
	}

	private void workHard(int ile) {
		for(int i=0; i<ile; i++) {
			System.out.println(i);
		}
	}

	private void fru() {
		System.out.println("fru 101");
	}

}

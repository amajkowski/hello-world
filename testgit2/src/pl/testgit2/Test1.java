package pl.testgit2;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.fru();
		t.workHard();
	}

	private void workHard() {
		for(int i=0; i<6; i++) {
			System.out.println(i);
		}
	}

	private void fru() {
		System.out.println("fru");
	}

}

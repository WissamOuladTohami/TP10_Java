package ma.projet;

public class TestTriplet {

	public static void main(String[] args) {
		Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
		tInt.affiche(); // affiche [1, 2, 3]

		Triplet<String> tStr = new Triplet<>("A", "B", "C");
		tStr.affiche();

		System.out.println("Second élément de tInt : " + tInt.getSecond() + "\n et Premier élement de tStr : " + tStr.getPremier());
	}

}

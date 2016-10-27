public class BeerSong {

	public static void main(String[] args) {
		
		int BeerNum = 99;
		String word = "bottles";

		while (BeerNum > 0) {

			if (BeerNum == 1) {
				word = "bottle";
			}

			if (BeerNum == 0) {
				word = "No more";
			}
			System.out.println(BeerNum + " bottles of beer on the wall, " + BeerNum + " bottles of beer.");
			System.out.println("Take one down and pass it around, " + BeerNum + " bottles of beer on the wall.");

			BeerNum = BeerNum - 1;
		}
	}
}
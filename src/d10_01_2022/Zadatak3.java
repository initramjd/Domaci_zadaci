package d10_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		FacebookPost prvi = new FacebookPost();

		prvi.infoPost = "Goran Maodus";
		prvi.infoWall = "IT Bootcamp";
		prvi.message = "Veliki pozdrav za ekipu iz kraja :)";
		prvi.numLike = 5;
		prvi.numShare = 2;

		FacebookPost drugi = new FacebookPost();

		drugi.infoPost = "Pjetar Pjetrovic";
		drugi.infoWall = "Srbija";
		drugi.message = "Narodnjaci su zakon";
		drugi.numLike = 0;
		drugi.numShare = 3;

		FacebookPost treci = new FacebookPost();

		treci.infoPost = "Lucifer";
		treci.infoWall = "God";
		treci.message = "in Heaven is Hell.";
		treci.numLike = 0;
		treci.numShare = 13;

		for (int i = 0; i < 666; i++) {
			treci.like();
		}

		prvi.like();
		prvi.dislike();
		prvi.like();
		prvi.like();

		drugi.dislike();
		drugi.dislike();
		drugi.like();
		drugi.dislike();
		drugi.dislike();

		prvi.share();

		drugi.share();

		prvi.print();

		drugi.print();

		treci.print();

	}

}

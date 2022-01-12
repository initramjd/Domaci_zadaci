package d10_01_2022;

public class FacebookPost {

	String infoPost;
	String infoWall;
	String message;
	int numLike;
	int numShare;

	public void like() {
		this.numLike++;
	}

	public void dislike() {
		this.numLike--;

		if (this.numLike < 0) {
			this.numLike = 0;
		}
	}

	public void share() {
		this.numShare++;
	}

	public void print() {
		System.out.println(this.infoPost + " >>> " + infoWall);
		System.out.println(this.message);
		System.out.println("Likes (" + this.numLike + ") | Shares (" + numShare + ")");
		System.out.println();
	}
}

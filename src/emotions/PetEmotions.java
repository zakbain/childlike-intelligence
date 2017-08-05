package emotions;

/**
 * Container class for the emotion classes that are specific to pets. NOTE: This
 * consolidation of classes is a bad practice but I think it is OK in this case
 * since pet is a prototype AI.
 * 
 * @author Zak_b
 *
 */
public class PetEmotions {
	public static class Happiness extends Emotion {

		public Happiness(int x, int y) {
			super(x, y);
		}
	}

	public static class Sadness extends Emotion {

		public Sadness(int x, int y) {
			super(x, y);
		}

	}

	public static class Anger extends Emotion {

		public Anger(int x, int y) {
			super(x, y);
		}
	}

	public static class Fear extends Emotion {

		public Fear(int x, int y) {
			super(x, y);
		}
	}
}

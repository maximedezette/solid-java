package common;

public class Database {
	
	private static boolean userIsSaved;

	public static void userIsSaved(boolean isSaved) {
		userIsSaved = isSaved;
	}

	public static boolean userIsSaved() {
		return userIsSaved;
	}

	public void save(User user) {
		userIsSaved = true;
	}

}

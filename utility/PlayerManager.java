package utility;

class PlayerManager {
    private static PlayerManager instance;  // Singleton design pattern
    private PlayerManager () {
    }
    
    public static PlayerManager getInstance() {
        if (instance == null) instance = new PlayerManager();
        return instance;
    }

}

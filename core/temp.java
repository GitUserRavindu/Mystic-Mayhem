package core;

public class temp {
    
}

public class Player {
    private static HashMap<String, Player> playerList = new HashMap<>();
    private final String username;

    public Player (String username) {
        this.username = username;
        playerList.put(username, Player);
    }
}
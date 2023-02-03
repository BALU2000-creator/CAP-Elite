

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Board{
    int max, min;
    Jumps jumps;
    Board(int max=100, int min=0, Jumps jumps){
        this.max = max;
        this.min = min;
        this,jumps = jumps;
    }
}

class Dice{
    
}

class Player{
    String id, name;
    int location;
    boolean turn = false;
    HashMap<Integer, Integer> notSnakeBite = new HashMap<>();
    player(String id, String name, String location, boolean turn = false){
        this.id = id;
        this.name = name;
        this.location;
        this.turn = turn;
    }
}

class Players{
    private HashMap<String, player> map;
    private Queue<player> queuePlayers;
    private Queue<player> LeaderBoard;
    Player(HashMap<player> map){
        this.map = map;
        this.queuePlayers = new LinkedList<>();
        this.LeaderBoard = new TreeMap<>();
    }
    Queue<player> createPlayersQueue(Map<Integer, String> priorMap){  
        /** PriorMap is TreeMap  that contains priority and String**/
        for (Map.Entry<Integer, String> entry : priorMap.entrySet())
            this.queuePlayers.add(this.map.get(entry.getValue()));
        return this.queuePlayers;
    }
    HashMap<String, player> getPlayers(){
        return this.map;
    }
    void removeWinPlayer(){
        Player plr = this.queuePlayers.poll();
    }
    void AddPlayersInMiddleOfGame(HashMap<player> map, Map<Integer, String> priorMap){
        /**Function -TODO**/
    }
    Map<Integer, player> displayLeaderBoard(){
        
    }
    
}

class Jumps{
    Private HashMap<Integer, Integer> map = new HashMap<>();
    map.put(4, 25); map.put(13, 46); map.put(15, 69); map.put(74, 92); map.put(33, 49);
    map.put(42, 63); map.put(62,81); 
    map.put(99,41); map.put(76, 58); map.put(66, 45); map.put(89, 53); map.put(54, 31);
    map.put(43,18); map.put(40, 3); map.put(27, 5);
    
    Jump(HashMap<Integer, Integer> map = map, boolean random=false, int numOfSnakes=7, int numOfLadders=7){
        if(random) this.map = constructRandomMap(numOfSnakes, numOfLadders);
        else this.map = map;
    }
    HashMap<Integer, Integer> constructRandomMap(int numOfSnakes, int numOfLadders){
        // TO-DO
        return this.map
    }
    HashMap<Integer, Integer> getMap(){
        return map;
    }
}

class SnakesAndLadders{
    Board board;
    Players players;
    Dice dice;
    SnakesAndLadders(Board board, Players players, Jumps jumps, Dice dice){
        this.board = board;
        this.players = players;
        this.jumps = jumps;
    }
}

class Driver {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

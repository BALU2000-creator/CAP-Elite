
class Board{
    int max, min;
    Jumps jumps;
    Board(int max=100, int min=0, Jumps jumps){
        this.max = max;
        this.min = min;
        this,jumps = jumps;
    }
}

class Jumper{
    Player Currentplayer, 
    Dice dice, 
    Jumps jumps; 
    boolean turn;
    int MaxNumBoundValues;
    HashMap<Integer, ArrayList<Player>> SnakeNotToBite;
    Jumper(Dice dice, int MaxNumBoundValues=2){
        this.dice = dice;
        this.SnakeNotToBite = new HashMap<>();
        this.jumps = jumps;
        this.MaxNumBoundValues = MaxNumBoundValues; // 3 sixes --> out
    }
    void NextMove(Scanner sc){
        boolean turn = this.turn;
        int curr Location = this.Currentplayer.getLocation();
        int locationToChange = 0
        int numOfMaximums = 0;
        while(turn){
            EnterInput();
            int numRolled = getDiceNumber();
            int locationToChange = CheckMaximumBound(numRolled, locationToChange);
        }
    }
    
    boolean CheckMaximumBound(int numRolled, int locationToChange){
        int numOfMaximums = 0;
        if(numRolled==this.dice.getMaxDice){
            numOfMaximums++;
            locationToChange = locationToChange + numRolled;
        }
        else{
            return 0;
        }
        if(numOfMaximums==this.MaxNumBoundValues)
            return 0;        
    }
    
    int getDiceNumber(){
        return this.dice.rollDice();
    }
    Player getCurrentPlayer(){
        return this.Currentplayer;
    }
    void UserEnterInput(){
        String st = "Press Enter";
        do{
            System.out.println("Press Enter Button to roll dice");
            st= sc.nextLine();
        }while(!st.equals(""));
    }
    void setMaxNumBoundValues(int MaxNumBoundValues){
        this.MaxNumBoundValues = MaxNumBoundValues;
    }
    void setCurrentPlayer(){
        this.CurrentPlayer = Player;
        setCurrentTurn(this.CurrentPlayer.getTurn());
    }
    void setCurrentTurn(boolean turn){
        this.turn = turn;
    }
}

class Dice{
    private int maxDice=6, minDice=1, numOfDices=1;
    Dice(int maxDice=6, int min=1, int numOfDices=1){
        setMinDice(minDice);
        setMaxDice(maxDice);
        setNumOfDices(numOfDices);
    }
    void ModifyMinMax(int minDice, int maxDice, int numOfDices)){
        setMinDice(minDice+numOfDices);
        setMaxDice(maxDice*numOfDices);
    }
    int rollDice(){
        return (int)((Math.random() * (this.maxDice - this.minDice)) + this.minDice);
    }
    //Getters & Setters
    int getMaxDice() return this.maxDice;
    int getMinDice() return this.minDice;
    int getNumOfDices() return this.numOfDices;
    void setMaxDice(int MaxDice) this.maxDice=MaxDice;
    void setMinDice(int MinDice) this.minDice=MinDice;
    void setNumOfDices(int numOfDices){
        this.numOfDices = numOfDices;
        ModifyMinMax(getMinDice(), getMaxDice(), getNumOfDices());
    }
    
}

class Player{
    String id, name;
    int location=0;
    boolean turn = false;
    HashMap<Integer, Integer> notSnakeBite = new HashMap<>();
    player(String id, String name, String location, boolean turn = false){
        this.id = id;
        this.name = name;
        this.location;
        this.turn = turn;
    }
    boolean getTurn() return this.turn;
    int getLocation() return this.location;
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
        return;
    }
    Map<Integer, player> displayLeaderBoard(){
        return;
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

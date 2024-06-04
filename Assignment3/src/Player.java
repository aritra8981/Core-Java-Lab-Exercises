public class Player {
    private String playerName; // Name of the player
    private int totalRuns; // Total runs scored by the player
    private int noOfWickets; // Number of wickets taken by the player
    private int noOfMatches; // Number of matches played by the player
    private String country; // Country the player represents
    private int noOfCenturies; // Number of centuries scored by the player
    private String category; // Category of the player (A or B)

    // Constructor to initialize a Player object
    public Player(String playerName, int totalRuns, int noOfWickets, int noOfMatches, String country, int noOfCenturies) {
        this.playerName = playerName;
        this.totalRuns = totalRuns;
        this.noOfWickets = noOfWickets;
        this.noOfMatches = noOfMatches;
        this.country = country;
        this.noOfCenturies = noOfCenturies;
        this.category = null; // Category is initially null
    }

    // Getter method to retrieve the player's name
    public String getPlayerName() {
        return playerName;
    }

    // Getter method to retrieve the total runs scored by the player
    public int getTotalRuns() {
        return totalRuns;
    }

    // Method to update the category of the player based on the number of centuries
    public void updateCategory() {
        if (noOfCenturies >= 10) {
            category = "A"; // Category A for players with 10 or more centuries
        } else {
            category = "B"; // Category B for players with less than 10 centuries
        }
    }

    // Override the toString method to provide a string representation of the player
    @Override
    public String toString() {
        return "Player Name = " + playerName + ", Total Runs = " + totalRuns + ", No. Of Wickets = " + noOfWickets
                + ", No Of Matches = " + noOfMatches + ", Country = " + country + ", No Of Centuries = " + noOfCenturies
                + ", Category = " + category;
    }
}

package fa.training.entities;

import java.util.List;

public class Team {
    private String teamID;
    private String teamName;
    private String ground;
    private List<Player> listOfPlayer;

    public Team() {
        super();
    }

    public Team(String teamID, String teamName, String ground, List<Player> listOfPlayer) {
        super();
        this.teamID = teamID;
        this.teamName = teamName;
        this.ground = ground;
        this.listOfPlayer = listOfPlayer;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public String getGround() {
        return ground;
    }

    public void setListOfPlayer(List<Player> listOfPlayer) {
        this.listOfPlayer = listOfPlayer;
    }

    public List<Player> getListOfPlayer() {
        return listOfPlayer;
    }

    @Override
    public String toString() {
        return "\nTeam [id=" + teamID + ", name=" + teamName + ", ground=" + ground +
                ",\nlistOfPlayer=" + listOfPlayer + "]";
    }
}

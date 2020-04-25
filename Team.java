/**
 * A class encapsulating the concept of a team.
 * 
 * @author Jeremie Guerchon
 */



public class Team {
static String name;
private String officialTeam;

 public Team(String TeamName) {
    this.name = TeamName;
 }

public String toString() {
    String officialTeam = "\nTeam name: " + this.name;
    return officialTeam;
 }
    public boolean equals(Team Team1)  {
        if (this.officialTeam == Team1.officialTeam) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        Team Team1 = new Team("Rare Tigers");

        System.out.println(Team1);
    }

} 

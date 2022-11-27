package de.uni.koeln.sse.se;

public class Team implements OlympicTeam {

    private String name;
    private int nrOfAthletes = 0;
    private int nrOfGoldMedals = 0;

    public Team(String name, int nrOfAthletes, int nrOfGoldMedals) {
        this.name = name;
        this.nrOfAthletes = nrOfAthletes;
        this.nrOfGoldMedals = nrOfGoldMedals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfAthletes() {
        return nrOfAthletes;
    }

    public void setNrOfAthletes(int nrOfAthletes) {
        this.nrOfAthletes = nrOfAthletes;
    }

    public int getNrOfGoldMedals() {
        return nrOfGoldMedals;
    }

    public void setNrOfGoldMedals(int nrOfGoldMedals) {
        this.nrOfGoldMedals = nrOfGoldMedals;
    }

    @Override
    public void printNrOfAthletes() {
        System.out.println("Team: " + this.name + " -> " + "Number of Athletes: " + this.nrOfAthletes);
    }

    @Override
    public void printNrOfGoldMedals() {
        System.out.println("Team: " + this.name + " -> " + "Number of GoldMedals " + this.nrOfGoldMedals);
    }
}

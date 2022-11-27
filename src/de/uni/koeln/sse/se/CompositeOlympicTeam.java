package de.uni.koeln.sse.se;

import java.util.ArrayList;

public class CompositeOlympicTeam implements OlympicTeam {

    private String name;
    private ArrayList<OlympicTeam> children;


    public CompositeOlympicTeam(String name) {
        this.children = new ArrayList<OlympicTeam>();
        this.name = name;
    }

    public void addChild(OlympicTeam child) {
        this.children.add(child);

    }

    public void removeChild(OlympicTeam child) {
        children.remove(child);
    }

    public ArrayList<OlympicTeam> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<OlympicTeam> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printNrOfAthletes() {
        System.out.println(this.name);
        for (OlympicTeam t : children) {
            t.printNrOfAthletes();
        }
    }

    @Override
    public void printNrOfGoldMedals() {
        System.out.println(this.name);
        for (OlympicTeam t : children) {
            t.printNrOfGoldMedals();
        }
    }
}

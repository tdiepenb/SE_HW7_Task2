package de.uni.koeln.sse.se;

public class Client {

    public static void main(String[] args) {

        CompositeOlympicTeam olympicsTeams = new CompositeOlympicTeam("Olympics Team");

        CompositeOlympicTeam asiaTeam = new CompositeOlympicTeam("Asia Team");
        CompositeOlympicTeam africaTeam = new CompositeOlympicTeam("Africa Team");
        CompositeOlympicTeam europeTeam = new CompositeOlympicTeam("Europe Team");
        CompositeOlympicTeam southAmericaTeam = new CompositeOlympicTeam("South America Team");
        olympicsTeams.addChild(asiaTeam);
        olympicsTeams.addChild(africaTeam);
        olympicsTeams.addChild(europeTeam);
        olympicsTeams.addChild(southAmericaTeam);

        //Asia Team
        CompositeOlympicTeam chinaTeam = new CompositeOlympicTeam("China Team");
        CompositeOlympicTeam afghanistanTeam = new CompositeOlympicTeam("Afghanistan Team");
        asiaTeam.addChild(chinaTeam);
        asiaTeam.addChild(afghanistanTeam);
        //China Team
        CompositeOlympicTeam chinaWomensTeam = new CompositeOlympicTeam("China-Women");
        CompositeOlympicTeam chinaMensTeam = new CompositeOlympicTeam("China-Men");
        chinaTeam.addChild(chinaWomensTeam);
        chinaTeam.addChild(chinaMensTeam);
        //China Women's Team
        Team chinaWomensTeakwondo = new Team("Women's Teakwondo", 10, 15);
        Team chinaWomensWaterpolo = new Team("Women's Waterpolo", 5, 5);
        Team chinaWomensArtGymnast = new Team("Women's Artistic Gymnastics", 15, 3);
        chinaWomensTeam.addChild(chinaWomensTeakwondo);
        chinaWomensTeam.addChild(chinaWomensWaterpolo);
        chinaWomensTeam.addChild(chinaWomensArtGymnast);
        //China Men's Team
        Team chinaMensShooting = new Team("Men's Shooting", 3, 1);
        chinaMensTeam.addChild(chinaMensShooting);


        //EuropeTeam
        CompositeOlympicTeam germanyTeam = new CompositeOlympicTeam("Germany Team");
        CompositeOlympicTeam italyTeam = new CompositeOlympicTeam("Italy Team");
        europeTeam.addChild(germanyTeam);
        europeTeam.addChild(italyTeam);

        //Germany Team
        CompositeOlympicTeam gerWomensTeam = new CompositeOlympicTeam("Germany-Womens");
        CompositeOlympicTeam gerMensTeam = new CompositeOlympicTeam("Germany-Mens");
        germanyTeam.addChild(gerWomensTeam);
        germanyTeam.addChild(gerMensTeam);

        //Germany Women's Team
        Team gerWomensCycling = new Team("Women's Cycling", 50, 50);
        Team gerWomensTennis = new Team("Women's Tennis", 10, 10);
        gerWomensTeam.addChild(gerWomensCycling);
        gerWomensTeam.addChild(gerWomensTennis);

        //Germany Men's Team
        Team gerMensTableTennis = new Team("Men's Table Tennis", 10, 5);
        Team gerMensFootball = new Team("Men's Football", 11, 11);
        gerMensTeam.addChild(gerMensTableTennis);
        gerMensTeam.addChild(gerMensFootball);

        //Italy Team
        CompositeOlympicTeam italyWomensTeam = new CompositeOlympicTeam("Italy-Womens");
        CompositeOlympicTeam italyMensTeam = new CompositeOlympicTeam("Italy-Mens");
        italyTeam.addChild(italyWomensTeam);
        italyTeam.addChild(italyMensTeam);

        //Italy Women's Team
        Team italyWomensAlpineSky = new Team("Women's Alpine Sky", 70, 10);
        italyWomensTeam.addChild(italyWomensAlpineSky);

        //Italy Men's Team
        Team italyMensFootball = new Team("Men's Football", 77, 77);
        Team italyMensSwimming = new Team("Men's Swimming Team", 5, 5);
        italyMensTeam.addChild(italyMensFootball);
        italyMensTeam.addChild(italyMensSwimming);


        //4.a
        gerMensTeam.printNrOfAthletes();

        //4.b
        germanyTeam.printNrOfGoldMedals();

        //4.c
        asiaTeam.printNrOfGoldMedals();

        //4.d
        olympicsTeams.printNrOfAthletes();

    }
}

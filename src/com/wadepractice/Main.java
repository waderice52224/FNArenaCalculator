package com.wadepractice;

public class Main {

    public static void main(String[] args) {

        //this is a console run project
        //use the variables bellow to change the inputs.
        //It does not have input validation so,
        //pick a number beween 1 - 100 for userPlacement, for user Division a number between 1-10
        //gametype 1 or 2
        // totalEliminations is as high as you want





        int userPlacement = 3;
        int userDivision = 10 - 1;
        int gameType = 1;
        int teamSize = 1;
        int totalEliminations =3;





        //solo tournament points
        //
        //each elimination, 1
        //top 75, 1
        //top 50, 1
        //top 40, 1
        //top 35, 1
        //top 30, 1
        //top 25, 2
        //top 15, 2
        //top 10, 2
        //top 9, 1
        //top 8, 1
        //top 7, 1
        //top 6, 1
        //top 5, 2
        //top 4, 1
        //top 3, 2
        //top 2, 3
        //top 1, 5



        int[] TournamentSoloPlacement = {75,50,40,35,30,25,15,10,9,8,7,6,5,4,3,2,1};
        int[] TournamentSoloPoints = {1,1,1,1,1,2,2,2,1,1,1,1,2,1,2,3,5};

        int userPlacementPoints = 0;

        int[] soloPlacement = {50,35,30,25,20,15,10,5,3,2,1};
        int[] soloPoints = {10,10,10,15,10,10,15,15,10,25,50};

        int[] duoPlacement = {25,20,17,15,12,10,5,3,2,1};
        int[] duoPoints = {10,5,5,5,5,10,10,10,25,50};

        int[] trioPlacement = {15,10,9,8,7,6,5,4,3,2,1};
        int[] trioPoints = {5,10,5,5,5,5,10,5,10,25,50};

        int[] tournamentTrioPlacement = {17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int[] tournamentTrioPoints = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,4,5};

        int[] divisionsBusFair = {0,0,0,-10,-20,-30,-40,-60,-60,-70};

        int soloElimPointsArena = 15;
        int duoElimPointsArena = 15;
        int TrioElimPointsArena = 15;
        int trioElimPointsTournament = 1;

        //HARD CODE!!!!!!!
        //arena or tournament
        // solo duo or trio
        //division
        //total kills
        //placement



        if(gameType == 1) {
            if(teamSize == 1) {
                //Turning solo placement into points
                if (userPlacement <= 50 & userPlacement > 1) {
                    int i = 0;
                    while (userPlacement <= soloPlacement[i]) {
                        userPlacementPoints = userPlacementPoints + soloPoints[i];
                        i++;
                    }
                    // userPlacementPoints = userPlacementPoints + soloPoints[i +1];
                }
                if (userPlacement == 1) {
                    userPlacementPoints = 180;
                }
                userPlacementPoints = userPlacementPoints + divisionsBusFair[userDivision];
                userPlacementPoints = userPlacementPoints + (totalEliminations * soloElimPointsArena);
                System.out.printf("%n");
                System.out.print(userPlacementPoints);
            }
            if(teamSize == 2) {
                //Turning duo placement into points
                userPlacementPoints = 0;
                if (userPlacement <= 25 & userPlacement > 1) {
                    int i = 0;

                    while (userPlacement <= duoPlacement[i]) {
                        userPlacementPoints = userPlacementPoints + duoPoints[i];
                        i++;
                    }
                    // userPlacementPoints = userPlacementPoints + soloPoints[i +1];
                }
                if (userPlacement == 1) {
                    userPlacementPoints = 180;
                }
                userPlacementPoints = userPlacementPoints + divisionsBusFair[userDivision];
                userPlacementPoints = userPlacementPoints + (totalEliminations * duoElimPointsArena);
                System.out.printf("%n");
                System.out.print(userPlacementPoints);
            }

            if(teamSize == 3) {
                //Turning Trio placement into points
                userPlacementPoints = 0;
                if (userPlacement <= 15 & userPlacement > 1) {
                    int i = 0;
                    while (userPlacement <= trioPlacement[i]) {
                        userPlacementPoints = userPlacementPoints + trioPoints[i];
                        i++;
                    }
                }
                if (userPlacement == 1) {
                    userPlacementPoints = 180;
                }

                userPlacementPoints = userPlacementPoints + (totalEliminations * TrioElimPointsArena);
                userPlacementPoints = userPlacementPoints + divisionsBusFair[userDivision];
                System.out.printf("%n");
                System.out.print(userPlacementPoints);
            }
        }
        if (gameType == 2) {
            if (teamSize == 1) {
                //Turning Trio placement into points
                userPlacementPoints = 0;
                if (userPlacement <= 75 & userPlacement > 1) {
                    int i = 0;
                    while (userPlacement <= TournamentSoloPlacement[i]) {
                        userPlacementPoints = userPlacementPoints + TournamentSoloPoints[i];
                        i++;
                    }
                }
                if (userPlacement == 1) {
                    userPlacementPoints = 28;
                }

                userPlacementPoints = userPlacementPoints + (totalEliminations * trioElimPointsTournament);
                System.out.printf("%n");
                System.out.print(userPlacementPoints);
            }
            if (teamSize == 3) {
                //Turning Trio placement into points
                userPlacementPoints = 0;
                if (userPlacement <= 17 & userPlacement > 1) {
                    int i = 0;
                    while (userPlacement <= tournamentTrioPlacement[i]) {
                        userPlacementPoints = userPlacementPoints + tournamentTrioPoints[i];
                        i++;
                    }
                }
                if (userPlacement == 1) {
                    userPlacementPoints = 25;
                }

                userPlacementPoints = userPlacementPoints + (totalEliminations * trioElimPointsTournament);
                System.out.printf("%n");
                System.out.print(userPlacementPoints);
            }
        }








        //duo tournament points




    }
}

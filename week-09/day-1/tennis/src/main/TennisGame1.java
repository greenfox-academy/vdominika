package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TennisGame1 implements TennisGame {

    private int P1Point = 0;
    private int P2point = 0;
    private String player1Name;
    private String player2Name;
    List<String> scoreNames = Arrays.asList("Love","Fifteen", "Thirty","Forty","Deuce");

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            P1Point += 1;
        else
            P2point += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (P1Point ==P2point) {
            score=scoreNames.get(P1Point);
        }
        else if (P1Point >=4 || P2point>=4)
        {
            int minusResult = P1Point -P2point;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else {
            for (int i=1; i<3; i++) {
                if (i==1) {tempScore = P1Point;
                score=scoreNames.get(0);
            } else (score+="-All"; tempScore = P2point;){
                score=scoreNames.get();
            }
        }
        return score;
    }
}

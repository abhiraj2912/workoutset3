package sportsstar;

import java.util.Scanner;

class Circketer{
    static String blowerRatingCal(int avg){
        if(avg<15){
            return "A++";
        } else if (avg>15&&avg<25) {
            return "A";
        } else {
            return "B";
        }
    }
    static String battingRatingCal(int stkRate){
        if(stkRate>140){
            return "A++";
        } else if (stkRate<140&&stkRate>120) {
            return "A";
        }else{
            return "B";
        }
    }

    String rating;
    double Salary;

    public Circketer(String rating) {
        this.rating = rating;
    }

    double salaryCal(){
        if(rating=="A++"){
            this.Salary=1000000;
        }
        if(rating=="A"){
            this.Salary=500000;
        }
        if(rating=="b"){
            this.Salary=250000;
        }
        return this.Salary;
    }

}

class Footballer{
    static String goalKeeperRating(int sgoal){
        if(sgoal>500){
            return "A++";
        } else if (sgoal>350) {
            return "A";
        } else if (sgoal>250) {
            return "B";
        }else{
            return "C";
        }
    }
    static String playerRating(int ngoal){
        if(ngoal>1000){
            return "A++";
        } else if (ngoal>800) {
            return "A";
        } else if (ngoal>700) {
            return "B";
        }else{
            return "C";
        }
    }

    String rating;
    double Salary;
    Footballer(String rate){
        this.rating=rate;
    }

    double salaryCal(){
        if(rating=="A++"){
            this.Salary=1000000;
        }
        if(rating=="A"){
            this.Salary=500000;
        }
        if(rating=="b"){
            this.Salary=250000;
        }
        return(this.Salary);
    }


}

public class Sportsstar {
    public static void main(String[] args){

        Circketer bowler = new Circketer(Circketer.blowerRatingCal(13));
        Circketer batter = new Circketer(Circketer.battingRatingCal(130));

        Footballer goalkeeper = new Footballer(Footballer.goalKeeperRating(1000));
        Footballer player = new Footballer(Footballer.goalKeeperRating(1500));

        System.out.println("Cricketer");
        System.out.println("Blower Rating "+bowler.rating);
        System.out.println("Blower Salary "+bowler.salaryCal());
        System.out.println("Batter Rating "+batter.rating);
        System.out.println("Batter Salary "+batter.salaryCal());

        System.out.println("Footballer");
        System.out.println("Goalkeeper Rating "+goalkeeper.rating);
        System.out.println("Goalkeeper Salary "+goalkeeper.salaryCal());
        System.out.println("Player Rating "+player.rating);
        System.out.println("Player Salary "+player.salaryCal());
    }
}

/**
 * Descision_maker 
 *
 * @author (Luke Logan)
 * @version (1.8)
 */
import java.util.Scanner;
public class Adventure_Game2

{
   static void clearscreen()
   {
       System.out.print("\u000C"); 
   }
   static void q()
   {
       Scanner mynum = new Scanner(System.in);
       System.out.println("Hello user. Please type you name below.");
       String nameo = mynum.nextLine();
       System.out.println("Welcome to the jungle " + nameo +"."); 
       
       System.out.println("Please select a month. 1-12");
       int month = mynum.nextInt();
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
            break;
            case 2:  monthString = "February";
            break;
            case 3:  monthString = "March";
            break;
            case 4:  monthString = "April";
            break;
            case 5:  monthString = "May";
            break;
            case 6:  monthString = "June";
            break;
            case 7:  monthString = "July";
            break;
            case 8:  monthString = "August";
            break;
            case 9:  monthString = "September";
            break;
            case 10: monthString = "October";
            break;
            case 11: monthString = "November";
            break;
            case 12: monthString = "December";
            break;
            default: monthString = "Invalid month";
            break;
        }
        System.out.println(monthString);
        System.out.println("Please select a day. 1-31");
       int day = mynum.nextInt();
       String dayString;
        switch (day) {
            case 1: dayString = "1";
            break;
            case 2: dayString = "2";
            break;
            case 3: dayString = "3";
            break;
            case 4: dayString = "4";
            break;
            case 5: dayString = "5";
            break;
            case 6: dayString = "6";
            break;
            case 7: dayString = "7";
            break;
            case 8: dayString = "8";
            break;
            case 9: dayString = "9";
            break;
            case 10: dayString = "10";
            break;
            case 11: dayString = "11";
            break;
            case 12: dayString = "12";
            break;
            case 13: dayString = "13";
            break;
            case 14: dayString = "14";
            break;
            case 15: dayString = "15";
            break;
            case 16: dayString = "16";
            break;
            case 17: dayString = "17"; 
            break;
            case 18: dayString = "18";
            break;
            case 19: dayString = "19";
            break;
            case 20: dayString = "20";
            break;
            case 21: dayString = "21";
            break;
            case 22: dayString = "22";
            break;
            case 23: dayString = "23";
            break;
            case 24: dayString = "24";
            break;
            case 25: dayString = "25";
            break;
            case 26: dayString = "26";
            break;
            case 27: dayString = "27";
            break;
            case 28: dayString = "28";
            break;
            case 29: dayString = "29";
            break;
            case 30: dayString = "30";
            break;
            case 31: dayString = "31";
            break;
            default: dayString = "Invalid day";
            break;
        }
       System.out.println(dayString);       
       System.out.println("It is currently " + monthString + ", " + dayString + ", 1977(the year is default). You will have to navagate this harsh wilderness if you are to survive. For each question, you must answer correctly or face the consequences.");
       System.out.println("You wake up in the middle of a bank souronded by water on all fronts.");
       System.out.println("Option 1: Swim to land");
       System.out.println("Option 2: Make a boat");
       System.out.println("Option 3: Use old swamp vines to swing to land");
       System.out.println("Option 4: Go back to sleep and pretend that this is a bad dream");
       System.out.println("Option 5. Do nothing");
       System.out.println("The numbers you chose corespond to options above. Pick either 1, 2, 3, 4, or 5.");  
   }
   static void w()
   {
       System.out.println("Congrats!!! You have made it to the next round because the vines held up.");
       System.out.println("You still have many challenges to go.");
       System.out.println("You now have a hard decision to make.");
       System.out.println("Your hungry and you can only pick one of these options to do.");
       System.out.println("1 = Forage for food");
       System.out.println("2 = Look for shelter");
       System.out.println("3 = Fasten a weapon");
       System.out.println("Please select a number.");
   }
   static void e()
   {
       System.out.println("Congrats!!! You found special berries that are full of water and that helped refule you.");
       System.out.println("It's getting dark. Please choose an option if you are to live.");
       System.out.println("1 = Fasten a weapon");
       System.out.println("2 = Look for shelter");
       System.out.println("3 = Build a fire near a large bolder");
       System.out.println("4 = Continue Journying into the jungle and press your luck");
       System.out.println("Please select 1-4.");
   }
   static void r()
   {
       System.out.println("Good survival skills. You kept the wild life away with your fire and the bolder served as a good rest point.");
       System.out.println("You traverse through the thick brush for hours and hear the sounds of vehicles. If you hear more than one of these sounds, you can be sure it is not a helusination, but if you hear too many,it could be a helusination.");
       System.out.println("Please enter how many times you herd the vehicle sound twice to make sure its not a helusination.");
   }
   static void t()
   {
       Scanner mynum = new Scanner(System.in);
       int i = mynum.nextInt();
       do{
       System.out.println(i);
       i++;
       } while (i < 20);
       System.out.println("You found a caravan of 19 trucks");
       System.out.println("Congrats you wern't helusinating. You have been picked up by a caravan of wilderness explorers.");
       System.out.println("You must pass one more test if you are to make it out alive. On your ride home, will you");
       System.out.println("1. Ride with the caravan");
       System.out.println("2. Ride on your own");
       System.out.println("3. Or stay where you are?");
   }
   static void y()
   {
       System.out.println("On your way home, you find a temple that is gaurding a treasure.");
       System.out.println("1. Explore the temple");
       System.out.println("2. Keep riding home");
   }
   static void u()
   {
       System.out.println("You see a treasure in the temple, but in order to obtain it, you must enter the correct # combonation.");
        System.out.println("The riddle under the treasure reads, If you seek this treasure you must enter 1 2 3 with no spaces in one line.");
   }
   static void i()
   {
       System.out.println("You come to a river that has flooded the road.");
       System.out.println("1. Hall your vehicle across the river");
       System.out.println("2. Ditch the vehicle and continue on foot");
       System.out.println("3. Travel back to the caravan");
   }
   static void o()
   {
       System.out.println("You have made it back to town.");
       System.out.println("You can");
       System.out.println("1. Fly back to the USA");
       System.out.println("2. Swim back to the USA");
       System.out.println("3. Ride in a boat back to the USA");
   }
   static void p()
   {
       System.out.println("Congrats!!! You have beat the game.");
   }
   static void z()
   {
       System.out.println("Please start over and select a valid number");
   }
   public static void main(String[] args) {
      String play = "yes";
      while (play.equals("yes") || play.equals("Yes"))
      {
        Scanner mynum = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);
        clearscreen();
        q();   
        int hi = mynum.nextInt();
        if (hi == 1)
        {
        System.out.println("You have been eaten by paranas. Please try again.");
        }
        else if (hi == 2)
        {
        System.out.println("You could not fasten a river worthy vestile, so you died of exaustion next to your almost ok boat. Please try again");
        }
        else if (hi == 3)
        {
        w();
         int ewn = mynum.nextInt();
        if (ewn == 1)
        { 
        e();
        int AST = mynum.nextInt();
        if (AST == 3)
        {
        r();
        int i = mynum.nextInt();
        if (i < 20)
        {
        t();
        int FINAL = mynum.nextInt();
        if (FINAL == 1)
        {
        System.out.println("Awesome job!!! Thanks for playing. You have made it home safely.");
        }  
        else if (FINAL == 2)
        {
        y();
        int dest = mynum.nextInt();
        if (dest == 1)
        {
        u();
        int we = mynum.nextInt();
        if (we == 123)
        {
        System.out.println("Congrats!!! You have found a jem worth billions and made it to safty.");
        System.out.println("Thanks for playing");
        }
        else 
        {
            System.out.println("You answered incorrectly and died.");
        }
        
        }
        else if (dest == 2)
        {
        i();
        int edna = mynum.nextInt();
        if (edna == 1)
        {
         System.out.println("You got stuck half way and drowned.");
         System.out.println("Please play again.");
        }
        else if (edna == 2)
        {
        o();
        int time = mynum.nextInt();
        if (time == 1)
        {
        p();
        }
        else if (time == 2)
        {
        p();
        }
        else if (time == 3)
        {
        p();
        }
        else
        {
        z();
        }
        }
        else if (edna == 3)
        {
         System.out.println("You got eaten by a snake while looking for the caravan.");
        }
        else 
        {
        z();
        }
        }
        else
        {
        z();
        }
        }  
        else if (FINAL == 3)
        {
        System.out.println("Your stupid. Please play again.");
        }  
        else 
        {
        System.out.println("That was incorrect. Please play again.");
        }
        }
        else if (i >= 20)
        {
        System.out.println("Your number was too good to be true. You went mentaly insane and died. Please play again.");
        }   
        
        }
        else if (AST == 1)
        {
        System.out.println("There was no materials that could build a strong enough weapon to fend off a gorilla. Please try again.");
        }
        else if (AST == 2)
        {
        System.out.println("There was no reliable shelter that could have stopped a jaguar from ripping you to shreads.");
        }
        else if (AST == 4)
        {   
        System.out.println("You wondered all night and found nothing. You mistereasly vanashed near the old ruins. Please try again.");
        }
        else 
        {
        z();
        }
        }
        else if (ewn == 2)
        {
        System.out.println("You have guessed incorectly. There was no shelter near you and a wild tiger ate you. Game over:( Please try again");
        }
        else if (ewn == 3)
        {
        System.out.println("You have guessed incorectly. Your sword could not protecr you from a raging wild bore. Game over:( Please try again");
        }
        else 
        {
        z();
        }
        }
        else if (hi == 4)
        {
         System.out.println("You never wake up again. Please try again.");
        }
        else if (hi == 5)
        {
        System.out.println("Your stupidity has cost you your life. Please try again.");
        }
         else 
        {
        z();
        }
        System.out.println("Do you want to play again?");
        System.out.println("Please select yes or no.");
        System.out.println("Your choice:    ");
        play = inputScanner.next();   
   } 
  }
}   
        
        

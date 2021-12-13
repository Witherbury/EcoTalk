import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Main
{
    public static void main()throws Exception
    {
        //make scanner class
        Scanner sc = new Scanner(System.in);
       
        //Intro and prompt
        System.out.println("Hi, my name is EcoTalk! And who might you be?");
        String name = sc.nextLine();
        System.out.println("I'll try remembering that, "+ name + ". What can I do for you?");
        String inp = sc.nextLine();
        int i,sw;
        String check;
        //While loop
        while(true)
        {
            inp = inp.replaceAll("\\p{Punct}","");
           
            //Ignore/Cut punctuations and case of letters
          while(true)
          {
           if(inp.equalsIgnoreCase("Tell me a joke") || (inp.equalsIgnoreCase("Another one")) || (inp.equalsIgnoreCase("One more"))
         
           || (inp.equalsIgnoreCase("Another joke")) || (inp.equalsIgnoreCase("Tell me another joke") || (inp.equalsIgnoreCase("Again"))))//Joke prompt      
            {
                Jokes jokes = new Jokes();
             jokes.tell();
             
                }
           
           
           
            if (inp.equalsIgnoreCase("Tell me a riddle"))
            {
               riddles riddles = new riddles();
               riddles.tell();
               
               
            }
           
            if (inp.equalsIgnoreCase("play a game" ))
            {
              System.out.println("How about Rock,Paper,Scissors?");
              check = sc.nextLine();
              if (check.equalsIgnoreCase("no"))
              {
                  System.out.println("Mabye some other time...");
             
                }
               
                if (check.equalsIgnoreCase("yes"))
                {
                    int r = 0;  //Rock
                    int p = 1;  //Paper
                    int s = 2;  //scissors
                    int u,c;    //user and computer output
                   
                System.out.println("0 is Rock , 1 is Paper , and 2 is Scissors. What do you choose?");
                u = sc.nextInt();
                c = (int)(Math.random()*2);
                //if block to check
                if (u == c)
                {
                //tie
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("It is a TIE");
               
               
               
               
                }
                else if ((u == r && c == s)||(u == s && c == p) || (u == p && c == r))
                {
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("You win!");
               
               
               }
               else
               {
                System.out.println("You put " + u + " and the I put " + c);
                System.out.println("Sorry, you lose!");
               }
           
            }
         
           
           
             
            }  
           if (inp.equalsIgnoreCase("flip a coin"))
           {
            System.out.println("Flipping...");  
               TimeUnit.SECONDS.sleep(2);
               sw = (int)(Math.random()*2) + 1;
               switch (sw)
               {
               case 1:
               System.out.println("It landed on heads.");
               break;
             
               case 2:
               System.out.println("It landed on tails.");
               }
             
            }
           
            if (inp.equalsIgnoreCase("What is your faviorite colour") ||(inp.equalsIgnoreCase ("What are your faviorite colours")))
            {
               
                System.out.println("My faviorite colours are those of Mother Nature , BLUE and GREEN");
               
               
               
            }
           
           
            if (inp.equalsIgnoreCase("I hate you"))
            {
               I_hate_you hateresp = new I_hate_you();
               hateresp.tell();
               
               
               
               
               
            }
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Test
{
    public static void main()throws Exception
    {
        //make scanner class
        Scanner sc = new Scanner(System.in);
       
        //Intro and prompt
        System.out.println("Hi, my name is EcoTalk! And who might you be?");
        String name = sc.nextLine();
        System.out.println("I'll try remembering that, "+ name + ". What can I do for you?");
        String inp = sc.nextLine();
        int i,sw;
        String check;
        //While loop
        while(true)
        {
            inp = inp.replaceAll("\\p{Punct}","");
           
            //Ignore/Cut punctuations and case of letters
          while(true)
          {
           if(inp.equalsIgnoreCase("Tell me a joke") || (inp.equalsIgnoreCase("Another one")) || (inp.equalsIgnoreCase("One more"))
         
           || (inp.equalsIgnoreCase("Another joke")) || (inp.equalsIgnoreCase("Tell me another joke") || (inp.equalsIgnoreCase("Again"))))//Joke prompt      
            {
                Jokes jokes = new Jokes();
             jokes.tell();
             
                }
           
           
           
            if (inp.equalsIgnoreCase("Tell me a riddle"))
            {
               riddles riddles = new riddles();
               riddles.tell();
               
               
            }
           
            if (inp.equalsIgnoreCase("play a game" ))
            {
              System.out.println("How about Rock,Paper,Scissors?");
              check = sc.nextLine();
              if (check.equalsIgnoreCase("no"))
              {
                  System.out.println("Mabye some other time...");
             
                }
               
                if (check.equalsIgnoreCase("yes"))
                {
                    int r = 0;  //Rock
                    int p = 1;  //Paper
                    int s = 2;  //scissors
                    int u,c;    //user and computer output
                   
                System.out.println("0 is Rock , 1 is Paper , and 2 is Scissors. What do you choose?");
                u = sc.nextInt();
                c = (int)(Math.random()*2);
                //if block to check
                if (u == c)
                {
                //tie
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("It is a TIE");
               
               
               
               
                }
                else if ((u == r && c == s)||(u == s && c == p) || (u == p && c == r))
                {
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("You win!");
               
               
               }
               else
               {
                System.out.println("You put " + u + " and the I put " + c);
                System.out.println("Sorry, you lose!");
               }
           
            }
         
           
           
             
            }  
           if (inp.equalsIgnoreCase("flip a coin"))
           {
            System.out.println("Flipping...");  
               TimeUnit.SECONDS.sleep(2);
               sw = (int)(Math.random()*2) + 1;
               switch (sw)
               {
               case 1:
               System.out.println("It landed on heads.");
               break;
             
               case 2:
               System.out.println("It landed on tails.");
               }
             
            }
           
            if (inp.equalsIgnoreCase("What is your faviorite colour") ||(inp.equalsIgnoreCase ("What are your faviorite colours")))
            {
               
                System.out.println("My faviorite colours are those of Mother Nature , BLUE and GREEN");
               
               
               
            }
           
           
            if (inp.equalsIgnoreCase("I hate you"))
            {
               I_hate_you hateresp = new I_hate_you();
               hateresp.tell();
               
               
               
               
               
            }
             if (inp.equalsIgnoreCase("I love you"))
             {
                 I_love_you loveresp = new I_love_you();
                 loveresp.tell();
                 
                 
                 
                 
                 
                 
                 
                 
              }
         inp = sc.nextLine();
              break;
         }
         if (inp.equalsIgnoreCase("see you later"))
            {
                System.out.println("See ya, " + name);
               
                break;
            }
      }
    }
}

	import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Test
{
    public static void main()throws Exception
    {
        //make scanner class
        Scanner sc = new Scanner(System.in);
       
        //Intro and prompt
        System.out.println("Hi, my name is EcoTalk! And who might you be?");
        String name = sc.nextLine();
        System.out.println("I'll try remembering that, "+ name + ". What can I do for you?");
        String inp = sc.nextLine();
        int i,sw;
        String check;
        //While loop
        while(true)
        {
            inp = inp.replaceAll("\\p{Punct}","");
           
            //Ignore/Cut punctuations and case of letters
          while(true)
          {
           if(inp.equalsIgnoreCase("Tell me a joke") || (inp.equalsIgnoreCase("Another one")) || (inp.equalsIgnoreCase("One more"))
         
           || (inp.equalsIgnoreCase("Another joke")) || (inp.equalsIgnoreCase("Tell me another joke") || (inp.equalsIgnoreCase("Again"))))//Joke prompt      
            {
                Jokes jokes = new Jokes();
             jokes.tell();
             
                }
           
           
           
            if (inp.equalsIgnoreCase("Tell me a riddle"))
            {
               riddles riddles = new riddles();
               riddles.tell();
               
               
            }
           
            if (inp.equalsIgnoreCase("play a game" ))
            {
              System.out.println("How about Rock,Paper,Scissors?");
              check = sc.nextLine();
              if (check.equalsIgnoreCase("no"))
              {
                  System.out.println("Mabye some other time...");
             
                }
               
                if (check.equalsIgnoreCase("yes"))
                {
                    int r = 0;  //Rock
                    int p = 1;  //Paper
                    int s = 2;  //scissors
                    int u,c;    //user and computer output
                   
                System.out.println("0 is Rock , 1 is Paper , and 2 is Scissors. What do you choose?");
                u = sc.nextInt();
                c = (int)(Math.random()*2);
                //if block to check
                if (u == c)
                {
                //tie
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("It is a TIE");
               
               
               
               
                }
                else if ((u == r && c == s)||(u == s && c == p) || (u == p && c == r))
                {
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("You win!");
               
               
               }
               else
               {
                System.out.println("You put " + u + " and the I put " + c);
                System.out.println("Sorry, you lose!");
               }
           
            }
         
           
           
             
            }  
           if (inp.equalsIgnoreCase("flip a coin"))
           {
            System.out.println("Flipping...");  
               TimeUnit.SECONDS.sleep(2);
               sw = (int)(Math.random()*2) + 1;
               switch (sw)
               {
               case 1:
               System.out.println("It landed on heads.");
               break;
             
               case 2:
               System.out.println("It landed on tails.");
               }
             
            }
           
            if (inp.equalsIgnoreCase("What is your faviorite colour") ||(inp.equalsIgnoreCase ("What are your faviorite colours")))
            {
               
                System.out.println("My faviorite colours are those of Mother Nature , BLUE and GREEN");
               
               
               
            }
           
           
            if (inp.equalsIgnoreCase("I hate you"))
            {
               I_hate_you hateresp = new I_hate_you();
               hateresp.tell();
               
               
               
               
               
            }
             if (inp.equalsIgnoreCase("I love you"))
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Test
{
    public static void main()throws Exception
    {
        //make scanner class
        Scanner sc = new Scanner(System.in);
       
        //Intro and prompt
        System.out.println("Hi, my name is EcoTalk! And who might you be?");
        String name = sc.nextLine();
        System.out.println("I'll try remembering that, "+ name + ". What can I do for you?");
        String inp = sc.nextLine();
        int i,sw;
        String check;
        //While loop
        while(true)
        {
            inp = inp.replaceAll("\\p{Punct}","");
           
            //Ignore/Cut punctuations and case of letters
          while(true)
          {
           if(inp.equalsIgnoreCase("Tell me a joke") || (inp.equalsIgnoreCase("Another one")) || (inp.equalsIgnoreCase("One more"))
         
           || (inp.equalsIgnoreCase("Another joke")) || (inp.equalsIgnoreCase("Tell me another joke") || (inp.equalsIgnoreCase("Again"))))//Joke prompt      
            {
                Jokes jokes = new Jokes();
             jokes.tell();
             
                }
           
           
           
            if (inp.equalsIgnoreCase("Tell me a riddle"))
            {
               riddles riddles = new riddles();
               riddles.tell();
               
               
            }
           
            if (inp.equalsIgnoreCase("play a game" ))
            {
              System.out.println("How about Rock,Paper,Scissors?");
              check = sc.nextLine();
              if (check.equalsIgnoreCase("no"))
              {
                  System.out.println("Mabye some other time...");
             
                }
               
                if (check.equalsIgnoreCase("yes"))
                {
                    int r = 0;  //Rock
                    int p = 1;  //Paper
                    int s = 2;  //scissors
                    int u,c;    //user and computer output
                   
                System.out.println("0 is Rock , 1 is Paper , and 2 is Scissors. What do you choose?");
                u = sc.nextInt();
                c = (int)(Math.random()*2);
                //if block to check
                if (u == c)
                {
                //tie
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("It is a TIE");
               
               
               
               
                }
                else if ((u == r && c == s)||(u == s && c == p) || (u == p && c == r))
                {
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("You win!");
               
               
               }
               else
               {
                System.out.println("You put " + u + " and the I put " + c);
                System.out.println("Sorry, you lose!");
               }
           
            }
         
           
           
             
            }  
           if (inp.equalsIgnoreCase("flip a coin"))
           {
            System.out.println("Flipping...");  
               TimeUnit.SECONDS.sleep(2);
               sw = (int)(Math.random()*2) + 1;
               switch (sw)
               {
               case 1:
               System.out.println("It landed on heads.");
               break;
             
               case 2:
               System.out.println("It landed on tails.");
               }
             
            }
           
            if (inp.equalsIgnoreCase("What is your faviorite colour") ||(inp.equalsIgnoreCase ("What are your faviorite colours")))
            {
               
                System.out.println("My faviorite colours are those of Mother Nature , BLUE and GREEN");
               
               
               
            }
           
           
            if (inp.equalsIgnoreCase("I hate you"))
            {
               I_hate_you hateresp = new I_hate_you();
               hateresp.tell();
               
               
               
               
               
            }
             if (inp.equalsIgnoreCase("I love you"))
             {
                 I_love_you loveresp = new I_love_you();
                 loveresp.tell();
                 
                 
                 
                 
                 
                 
                 
                 
              }
         inp = sc.nextLine();
              break;
         }
         if (inp.equalsIgnoreCase("see you later"))
            {
                System.out.println("See ya, " + name);
               
                break;
            }
      }
    }
}

	import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Test
{
    public static void main()throws Exception
    {
        //make scanner class
        Scanner sc = new Scanner(System.in);
       
        //Intro and prompt
        System.out.println("Hi, my name is EcoTalk! And who might you be?");
        String name = sc.nextLine();
        System.out.println("I'll try remembering that, "+ name + ". What can I do for you?");
        String inp = sc.nextLine();
        int i,sw;
        String check;
        //While loop
        while(true)
        {
            inp = inp.replaceAll("\\p{Punct}","");
           
            //Ignore/Cut punctuations and case of letters
          while(true)
          {
           if(inp.equalsIgnoreCase("Tell me a joke") || (inp.equalsIgnoreCase("Another one")) || (inp.equalsIgnoreCase("One more"))
         
           || (inp.equalsIgnoreCase("Another joke")) || (inp.equalsIgnoreCase("Tell me another joke") || (inp.equalsIgnoreCase("Again"))))//Joke prompt      
            {
                Jokes jokes = new Jokes();
             jokes.tell();
             
                }
           
           
           
            if (inp.equalsIgnoreCase("Tell me a riddle"))
            {
               riddles riddles = new riddles();
               riddles.tell();
               
               
            }
           
            if (inp.equalsIgnoreCase("play a game" ))
            {
              System.out.println("How about Rock,Paper,Scissors?");
              check = sc.nextLine();
              if (check.equalsIgnoreCase("no"))
              {
                  System.out.println("Mabye some other time...");
             
                }
               
                if (check.equalsIgnoreCase("yes"))
                {
                    int r = 0;  //Rock
                    int p = 1;  //Paper
                    int s = 2;  //scissors
                    int u,c;    //user and computer output
                   
                System.out.println("0 is Rock , 1 is Paper , and 2 is Scissors. What do you choose?");
                u = sc.nextInt();
                c = (int)(Math.random()*2);
                //if block to check
                if (u == c)
                {
                //tie
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("It is a TIE");
               
               
               
               
                }
                else if ((u == r && c == s)||(u == s && c == p) || (u == p && c == r))
                {
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("You win!");
               
               
               }
               else
               {
                System.out.println("You put " + u + " and the I put " + c);
                System.out.println("Sorry, you lose!");
               }
           
            }
         
           
           
             
            }  
           if (inp.equalsIgnoreCase("flip a coin"))
           {
            System.out.println("Flipping...");  
               TimeUnit.SECONDS.sleep(2);
               sw = (int)(Math.random()*2) + 1;
               switch (sw)
               {
               case 1:
               System.out.println("It landed on heads.");
               break;
             
               case 2:
               System.out.println("It landed on tails.");
               }
             
            }
           
            if (inp.equalsIgnoreCase("What is your faviorite colour") ||(inp.equalsIgnoreCase ("What are your faviorite colours")))
            {
               
                System.out.println("My faviorite colours are those of Mother Nature , BLUE and GREEN");
               
               
               
            }
           
           
            if (inp.equalsIgnoreCase("I hate you"))
            {
               I_hate_you hateresp = new I_hate_you();
               hateresp.tell();
               
               
               
               
               
            }
             if (inp.equalsIgnoreCase("I love you"))
             {
                 I_love_you loveresp = new I_love_you();
                 loveresp.tell();
                 
                 
                 
                 
                 
                 
                 
                 
              }
         inp = sc.nextLine();
              break;
         }
         if (inp.equalsIgnoreCase("see you later"))
            {
                System.out.println("See ya, " + name);
               
                break;
            }
      }
    }
}

	import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Test
{
    public static void main()throws Exception
    {
        //make scanner class
        Scanner sc = new Scanner(System.in);
       
        //Intro and prompt
        System.out.println("Hi, my name is EcoTalk! And who might you be?");
        String name = sc.nextLine();
        System.out.println("I'll try remembering that, "+ name + ". What can I do for you?");
        String inp = sc.nextLine();
        int i,sw;
        String check;
        //While loop
        while(true)
        {
            inp = inp.replaceAll("\\p{Punct}","");
           
            //Ignore/Cut punctuations and case of letters
          while(true)
          {
           if(inp.equalsIgnoreCase("Tell me a joke") || (inp.equalsIgnoreCase("Another one")) || (inp.equalsIgnoreCase("One more"))
         
           || (inp.equalsIgnoreCase("Another joke")) || (inp.equalsIgnoreCase("Tell me another joke") || (inp.equalsIgnoreCase("Again"))))//Joke prompt      
            {
                Jokes jokes = new Jokes();
             jokes.tell();
             
                }
           
           
           
            if (inp.equalsIgnoreCase("Tell me a riddle"))
            {
               riddles riddles = new riddles();
               riddles.tell();
               
               
            }
           
            if (inp.equalsIgnoreCase("play a game" ))
            {
              System.out.println("How about Rock,Paper,Scissors?");
              check = sc.nextLine();
              if (check.equalsIgnoreCase("no"))
              {
                  System.out.println("Mabye some other time...");
             
                }
               
                if (check.equalsIgnoreCase("yes"))
                {
                    int r = 0;  //Rock
                    int p = 1;  //Paper
                    int s = 2;  //scissors
                    int u,c;    //user and computer output
                   
                System.out.println("0 is Rock , 1 is Paper , and 2 is Scissors. What do you choose?");
                u = sc.nextInt();
                c = (int)(Math.random()*2);
                //if block to check
                if (u == c)
                {
                //tie
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("It is a TIE");
               
               
               
               
                }
                else if ((u == r && c == s)||(u == s && c == p) || (u == p && c == r))
                {
                System.out.println("You put " + u + " and I put " + c);
                System.out.println("You win!");
               
               
               }
               else
               {
                System.out.println("You put " + u + " and the I put " + c);
                System.out.println("Sorry, you lose!");
               }
           
            }
         
           
           
             
            }  
           if (inp.equalsIgnoreCase("flip a coin"))
           {
            System.out.println("Flipping...");  
               TimeUnit.SECONDS.sleep(2);
               sw = (int)(Math.random()*2) + 1;
               switch (sw)
               {
               case 1:
               System.out.println("It landed on heads.");
               break;
             
               case 2:
               System.out.println("It landed on tails.");
               }
             
            }
           
            if (inp.equalsIgnoreCase("What is your faviorite colour") ||(inp.equalsIgnoreCase ("What are your faviorite colours")))
            {
               
                System.out.println("My faviorite colours are those of Mother Nature , BLUE and GREEN");
               
               
               
            }
           
           
            if (inp.equalsIgnoreCase("I hate you"))
            {
               I_hate_you hateresp = new I_hate_you();
               hateresp.tell();
               
               
               
               
               
            }
             if (inp.equalsIgnoreCase("I love you"))
             {
                 I_love_you loveresp = new I_love_you();
                 loveresp.tell();
                 
                 
                 
                 
                 
                 
                 
                 
              }
         inp = sc.nextLine();
              break;
         }
         if (inp.equalsIgnoreCase("see you later"))
            {
                System.out.println("See ya, " + name);
               
                break;
            }
      }
    }
}

	
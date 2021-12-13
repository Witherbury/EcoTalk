import java.util.concurrent.TimeUnit;
public class Jokes
{
    private static String Jokes[] = {"Why did the guard name his dogs Rolex and Timex?" , "Why did the student eat his homework?" , "Why did the girl angle like the boy angle?" , "Ever heard of a restaraunt named Karma?" , "Why do we tell actors to 'Break a leg'?" , "What do you call a park full of computers?" , "Why did the girl catch her nose?" , "What is non living but always cries?" , "Why do you have to go to bed?" , "What do you call a bear with no teeth?"};
     
    private static String Answer[] = {"Because they were WATCHDOGS!", "Because the teacher said it was a piece of cake!" , "Because he was acute!" , "There's no menu. They give you what you deserve." , "Because every play has a  CAST!" , "Tech Park!" , "Because it was running!" , "A cloud!" , "Because the bed doesn't come to you!" , "A Gummy Bear"};
    public void tell () throws Exception
    {
        int jrand = (int)(Math.random() * 10);
        System.out.println(Jokes[jrand]);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(Answer[jrand]);
    }
}
import java.util.concurrent.TimeUnit;

public class riddles
{
    private static String riddle[] = {"I am wet when I am drying. What am I?" , "What word is always pronounced wrong?" , "What has an eye but cannot see?" , "What has a head and tail , but no body?" , "You can't see me , or taste me , but you can touch me and hear me. What am I?" , "What can travel around the entire world by just sitting in one corner?" , "What is made of water but dies when it is put in water?" , "Which month do people sleep the least in?" , "What has hands but cannot clap?" , "I am tall when I'm young and I get shorter as I get older. What am I?"};
    private static String answer[] = {"A towel!" , "Wrong!" , "A needle!" , "A coin!" , "Air!" , "A stamp." , "An Ice Cube!" , "February." , "A clock!" , "A candle!"};
    public  void tell()throws Exception
   
    {
        int  rrand = (int)(Math.random()*10);
        System.out.println(riddle[rrand]);
        TimeUnit.SECONDS.sleep(5);
        System.out.println(answer[rrand]);
    }
}
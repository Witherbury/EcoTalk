import java.util.concurrent.TimeUnit;
public class I_love_you
{
    private static String loveresp[] = {"I'm not sure how to respond" , "That's nice , thanks!" , "I like you too "  , "Sorry , but I'm a machine" , "I know" , "ey dumma im a program.Weirdo" , "I love you too" , "That's sweet" , "I think you are pretty great too" , "I'm not sure I understand"} ;
    public void tell()throws Exception
    {
       
        int lovrand =(int) (Math.random()*10);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(loveresp[lovrand]);
       
       
       
       
       
       
       
       
    }
}
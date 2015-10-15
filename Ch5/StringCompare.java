

/**
 * Write a description of class StringCompare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringCompare
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] arg)
    {
           String word1= "catalog";
           String word2= "cat";
           String word3= "aaa";
           int result= word1.compareTo(word2);
           int resultAAA= word1.compareTo(word3);
           boolean resultW1W2= word1.equals(word2);
           boolean resultSub= word2.equals(word1.substring(0,3));
           System.out.println("1:"+result+"\n"+
           "2:"+resultAAA+"\n"+
           "3:"+resultW1W2+"\n"+
           "4:"+resultSub);
    }
}

package app;

public class App 
{
    public static void main(String args[]) 
    {
        System.out.println(fizzbuzz(1, 20));
    }

    public static String fizzbuzz(int start, int end)
    {
        String output = "";
        for (int counter = start; counter <= end; counter += 1)
        {
            if (Integer.toString(counter).contains("3")){
                output += "lucky ";
            }
            else if (counter % 3 == 0 && counter % 5 == 0){
                output += "fizzbuzz ";
            }
            else if (counter % 3 == 0){
                output += "fizz ";
            }
            else if (counter % 5 == 0){
                output += "buzz ";
            }
            else {
                output += counter + " ";
            }
        }
        return output;
    }
}
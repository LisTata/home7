public class Kata7 {
    //You are to write a function that takes a string as its first parameter. This string will be a string of words.
    //
    //You are expected to then use the second parameter, which will be an integer,
    // to find the corresponding word in the given string. The first word would be represented by 0.
    //
    //Once you have the located string you are finally going to multiply by it the third provided parameter,
    // which will also be an integer. You are additionally required to add a hyphen in between each word.
    public static void main(String[] args) {
String str="This is a string";
int loc=3;
int num=5;
        String [] word=str.split(" ");
        String result=word[loc];

        for(int i=1;i<num;i++)
            result=result+"-"+word[loc];

        System.out.println(result);
    }
}



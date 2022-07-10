package ua.nix.kahamlyk.hw1;

public class SumOfNumbersInString {

    public static int SumOfNumbers(String line){
        char[] newmas = line.toCharArray();
        int a =0;
        int result =0;
        for(int i=0; i<newmas.length; i++){
            a = (int) newmas[i];
            if(a>47 && a<58) {
                result += a - 48;
            }
        }
        return result;
    }

}

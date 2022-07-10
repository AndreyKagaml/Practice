package ua.nix.kahamlyk.hw2;

public class EnteringOfSymbols {


    public static String AmountOfEnterings(String value){
        char[] newmas = value.toCharArray();
        int a = 0, j, score = 0;
        String result = "";
        for(int i=0; i<newmas.length; i++) {

            boolean availabilityOfSymbol = true;
            for (int k = 0; k < result.toCharArray().length; k++) {
                if (result.toCharArray()[k] == newmas[i]) availabilityOfSymbol = false;
            }

            if (availabilityOfSymbol) {

                score = 0;
                a = (int) newmas[i];
                if (a > 96 && a < 123) {

                    j = i;
                    while (j < newmas.length) {
                        if (a == (int) newmas[j]) {
                            score++;
                        }
                        j++;
                    }

                } else continue;
                result += (char) a + "-" + score + "\n";
                // System.out.println((char) a + "-" + score);
            }
        }
        return result;
    }
}

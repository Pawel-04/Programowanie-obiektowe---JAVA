package Tasks;

import java.util.Random;

public class RandomValue {

    public static int[] createRandomValueArray(int min, int max, int ilosc){
        if(min >= max){
            System.out.println("Wartość minimalna nie może być większa od maksymalnej.");
            return null;
        }
        if(ilosc <= 0){
            System.out.println("Nie można wprowadzić takiej ilości liczb do tablicy!");
            return null;
        }
        int[] newRandomValueArray = new int[ilosc];
        Random randomValue = new Random();
        for(int i = 0; i < ilosc; i++){
            newRandomValueArray[i] = randomValue.nextInt(max - min - 1) + min;
        }
        return newRandomValueArray;
    }
}
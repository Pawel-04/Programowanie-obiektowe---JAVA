package Tasks;
import java.util.Arrays;
import java.util.Scanner;
import static Tasks.RandomValue.createRandomValueArray;

public class Task {

    public void task01(){
        int suma = 0, min, max, ilosc;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj minimalną wartość: ");
        min = input.nextInt();
        System.out.println("Podaj maksymalną wartość: ");
        max = input.nextInt();
        System.out.println("Podaj ilość elementów tablicy: ");
        ilosc = input.nextInt();
        int[] tablica = createRandomValueArray(min,max,ilosc);
        for(int x : tablica) suma += x;
        System.out.println("Suma = " + suma + "\nŚrednia = " + ((double)suma / ilosc));
    }

    public void task02(){
        int[] tab1 = { 6, 7, 14, 2, 24, 36};
        int[] tab2 = { 6, 14, 1, 15, 28};
        for(int i = 1; i < tab1.length; i += 2) System.out.println( (i+1) + " element pierwszej tablicy: " + tab1[i]);
        for(int i = 1; i < tab2.length; i += 2) System.out.println( (i+1) + " element drugiej tablicy: " + tab2[i]);
    }

    public void task03(){
        String[] tablica_Wyrazow = { "Zmiana", "na", "wielkie", "litery" };
        for(String slowa : tablica_Wyrazow){
            System.out.print(slowa.toUpperCase() + " ");
        }
    }

    public void task04(){
        Scanner input = new Scanner(System.in);
        String[] zdanie = new String[5];
        for(int i = 0; i < zdanie.length; i++){
            System.out.println("Podaj " +(i+1) +" słowo");
            zdanie[i] = input.nextLine();
        }
        for(int j = zdanie.length - 1; j >= 0; j--){
            for(int n = zdanie[j].length() - 1; n >= 0; n--){
                System.out.print(zdanie[j].charAt(n));
            }
            System.out.print(" ");
        }
    }

    public void task05(){
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[8];
        int x;
        for(int i = 0; i < tablica.length; i++){
            System.out.println("Podaj " +(i + 1) +" liczbę: ");
            tablica[i] = input.nextInt();
        }
        for(int j = 0; j < tablica.length; j++){
            for(int n = 0; n < tablica.length; n++){
                if(tablica[j] < tablica[n]){
                    x = tablica[n];
                    tablica[n] = tablica[j];
                    tablica[j] = x;
                }
            }
        }
        System.out.println(Arrays.toString(tablica));
    }

    public void task06(){
        Scanner input = new Scanner(System.in);
        int[] tablica_Silnia = new int[5];
        int x = 1;
        for(int i = 0; i < tablica_Silnia.length; i++){
            System.out.println("Podaj " +(i + 1) +" liczbę: ");
            tablica_Silnia[i] = input.nextInt();
        }
        for(int j = 0; j < tablica_Silnia.length; j++){
            for(int n = 0; n < tablica_Silnia[j]; n++){
                x *= (n + 1);
            }
            tablica_Silnia[j] = x;
            x = 1;
        }
        System.out.println(Arrays.toString(tablica_Silnia));
    }

    public void task07(){
        String[] tab_1 = {"Czy", "są", "takie", "same?"};
        String[] tab_2 = {"Czy", "są", "takie", "same?"};
        System.out.println(Arrays.equals(tab_1, tab_2) ? "Tablice są takie same." : "Tablice się różnią.");
    }
}
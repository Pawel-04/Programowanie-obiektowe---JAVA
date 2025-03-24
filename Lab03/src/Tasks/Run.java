package Tasks;

import java.util.Scanner;

public class Run {
    public void runTasks(){
        Task newTask = new Task();
        Scanner input = new Scanner(System.in);
        System.out.println("Laboratorium 3\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n8. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                newTask.task01();
                break;
            case 2:
                newTask.task02();
                break;
            case 3:
                newTask.task03();
                break;
            case 4:
                newTask.task04();
                break;
            case 5:
                newTask.task05();
                break;
            case 6:
                newTask.task06();
                break;
            case 7:
                newTask.task07();
                break;
            default:
                break;
        }
    }
}
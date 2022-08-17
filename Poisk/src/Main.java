import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String path, file;
        boolean z = false;

        System.out.println("Имя файла c форматом: ");
        file = input.nextLine();
        System.out.println("Путь: ");
        path = input.nextLine();



        File dir = new File(path);

        if(dir.isDirectory()) {                         // сам поиск файла
            for (File item : dir.listFiles()) {
                if(item.getName().equals(file)){
                    z = true;
                }
            }
        }
        if(z == true)
            System.out.println("Найден Файл или папка с таким именем ");
        else {
            System.out.println("Не найден");
        }
    }
}

// ну очень простая программа я хз шо тут еще комментить